package com.ftrue.day09;

/**
 * @ClassName CustomerView
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月07日 14时01分
 * @Version 1.0
 *
 * CustomerView类的设计
 */
public class CustomerView {
	//创建最大包含10客户对象的CustomerList 对象，供以下各成员方法使用。
	private CustomerList list = new CustomerList(10);


	public static void main(String[] args) {
		//创建CustomerView实例
		CustomerView cv = new CustomerView();
		//并调用 enterMainMenu()方法以执行程序。
		cv.enterMainMenu();
	}

	//用途：显示主菜单，响应用户输入，
	// 根据用户操作分别调用其他相应的成员方法（如addNewCustomer），
	// 以完成客户信息处理。
	public void enterMainMenu() {
		//声明循环变量标记
		boolean flag = true;
		while (flag) {
			System.out.println("---------------客户信息管理软件-----------------");
			System.out.println("\t\t\t\t1 添 加 客 户");
			System.out.println("\t\t\t\t2 修 改 客 户");
			System.out.println("\t\t\t\t3 删 除 客 户");
			System.out.println("\t\t\t\t4 客 户 列 表");
			System.out.println("\t\t\t\t5 退 出 软 件");
			System.out.print("\t\t\t\t请选择(1-5)：");
			char key = CMUtility.readMenuSelection();

			switch (key) {
				case '1':
					addNewCustomer();
					break;
				case '2':
					modifyCustomer();
					break;
				case '3':
					deleteCustomer();
					break;
				case '4':
					listAllCustomers();
					break;
				case '5':
					flag = false;
					break;
			}
		}

	}

	private void listAllCustomers() {
		//获取客户列表数组
		Customer[] cs = list.getAllCustomers();

		if (cs.length == 0) {
			System.out.println("系统中还没有客户对象,请添加后再进行查询");
			return;
		}

		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");
		for (int i = 0; i < cs.length; i++) {
			//获取当前客户对象
			Customer c = cs[i];
			System.out.println(c.getId() + "\t\t" + c.getName() + "\t\t" + c.getGender() + "\t\t" + c.getAge() + "\t\t" + c.getPhone() + "\t\t" + c.getEmail());
		}
		System.out.println("-------------------------客户列表完成-------------------------");

	}

	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		System.out.println("请选择待删除客户编号(-1退出)：");
		int cid = CMUtility.readInt();

		if (cid == -1) {
			return;
		}


		System.out.println("确认是否删除(Y/N):");
		char key = CMUtility.readConfirmSelection();

		if (key == 'Y' || key == 'y') {
			//可以根据客户的编号获取客户在数组中对应的索引
			int index = getIndex(cid);

			//直接根据索引进行删除
			boolean result = list.deleteCustomer(index);

			if (result) {
				System.out.println("---------------------删除完成---------------------");
			} else {
				System.out.println("---------------------删除失败---------------------");
			}
		} else {
			System.out.println("---------------------删除失败---------------------");
		}
	}

	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		System.out.println("请选择待修改客户编号(-1退出)：");
		//待修改的客户编号
		int cid = CMUtility.readInt();

		if (cid == -1) {
			return;
		}

		//通过客户的编号获取该客户在数组中的索引值
		int index = getIndex(cid);

		//通过索引获取客户
		Customer c = list.getCustomer(index);

		//针对客户对象c做非空校验
		if (list.isNull(c) == false) {
			return;
		}

		System.out.println("姓名(" + c.getName() + "):");
		String name = CMUtility.readString(4,c.getName());
		System.out.println("性别(" + c.getGender() + "):");
		char gender = CMUtility.readChar(c.getGender());
		System.out.println("年龄(" + c.getAge() + "):");
		int age = CMUtility.readInt(c.getAge());
		System.out.println("手机(" + c.getPhone() + "):");
		String phone = CMUtility.readString(11,c.getPhone());
		System.out.println("邮箱(" + c.getEmail() + "):");
		String email = CMUtility.readString(25,c.getEmail());

		//根据新的客户信息创建客户对象
		Customer cust = new Customer(name, gender, age, phone, email);

		//获取待修改客户的编号
		int id = c.getId();

		//将待修改客户的编号存入给新客户对象
		cust.setId(id);

		//将自动分配编号的变量给其自动-1
		Customer.setNum(Customer.getNum() - 1);

		//进行客户的替换
		boolean result = list.replaceCustomer(index, cust);

		if (result) {
			System.out.println("---------------------修改完成---------------------");
		} else {
			System.out.println("---------------------修改失败---------------------");
		}
	}

	private int getIndex(int cid) {
		//获取所有客户的数组
		Customer[] cs = list.getAllCustomers();

		for (int i = 0; i < cs.length; i++) {
			//将待修改客户编号和所有客户对象的编号进行一一匹配
			if (cid == cs[i].getId()) {
				return i;
			}
		}

		return -1;
	}

	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		//提前判断数组是否已经存满
		if (list.isArr()) {
			System.out.println("---------------------添加失败---------------------");
			return;
		}

		//通过键盘录入,获取创建Customer对象所需的数据
		System.out.println("姓名:");
		String name = CMUtility.readString(4);
		System.out.println("性别:");
		char gender = CMUtility.readChar();
		System.out.println("年龄:");
		int age = CMUtility.readInt();
		System.out.println("手机:");
		String phone = CMUtility.readString(11);
		System.out.println("邮箱:");
		String email = CMUtility.readString(25);



		//根据5个客户信息创建客户对象
		Customer customer = new Customer(name, gender, age, phone, email);

		//调用List工具类的添加客户的功能
		boolean result = list.addCustomer(customer);

		if (result) {
			System.out.println("---------------------添加完成---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}

	}
}
