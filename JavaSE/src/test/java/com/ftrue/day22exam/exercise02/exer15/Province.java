package com.ftrue.day22exam.exercise02.exer15;

/**
 * @ClassName: Province
 * @Description:
 * @Author: zhiqi zhang on 2021/7/25 9:37
 * @Version: 1.0
 */
public class Province {
    private int id;
    private String name;

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
