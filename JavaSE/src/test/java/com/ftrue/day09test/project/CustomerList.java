package com.ftrue.day09test.project;

import java.util.Arrays;

/**
 * @ClassName: CustomerList
 * @Description:
 * @Author: zhangzhiqi on 2021/7/7 10:06
 * @Version: 1.0
 */
public class CustomerList {
    private Customer[] cs;

    private int total = 0;

    public CustomerList(int total) {
        cs = new Customer[total];
    }

    public boolean addCustomer(Customer customer) {
        //判断客户对象是否为null
        if (isNull(customer) == false) {
            return false;
        }

        //判断数组已满
        if (isArr()) {
            return false;
        }

        cs[total] = customer;

        total++;

        return true;
    }

    public boolean replaceCustomer(int index, Customer customer) {
        //判断索引合法性
        if (isIndex(index) == false) {
            return false;
        }

        //判断对象customer是否为null
        if (isNull(customer) == false) {
            return false;
        }

        //代码执行到这一行，说明索引合法，对象customer不为null
        cs[index] = customer;

        return true;
    }

    /*
    * 用途：从数组中删除参数index指定索引位置的客户对象记录
    * */
    public boolean deleteCustomer(int index) {
        //判断索引是否无效
        if (isIndex(index) == false) {
            return false;
        }

        //思路：将index索引后面的数据依次往前移动
        for (int i = index; i < total - 1; i++) {
            cs[i] = cs[i + 1];
        }

        //将最后一个对象替换为null
        cs[total - 1] = null;

        //因为引进成功删除，真实客户数量已经减少
        total--;

        return true;
    }

    //返回数组中记录的所有客户对象
    public Customer[] getAllCustomers() {
        return Arrays.copyOf(cs, total);
    }

    //返回参数index指定
    public Customer getCustomer(int index) {
        if (isIndex(index) == false) {
            return null;
        }

        return cs[index];
    }



    //判断索引合法性
    public boolean isIndex(int index) {
        if (index < 0 || index >= total) {
            return false;
        }

        return true;
    }

    //判断客户对象是否为null
    public boolean isNull(Customer customer) {
        return customer != null;
    }

    //判断数组是否已满
    public boolean isArr() {
        if (total >= cs.length) {
            return true;
        }

        return false;
    }
}
