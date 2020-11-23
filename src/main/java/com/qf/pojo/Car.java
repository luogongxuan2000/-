package com.qf.pojo;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String name;//名字
    private String type;//类型
    private int sitnum;//座位数
    private int cid;//所在城市编号
    private double price;//价格
    private int number;//数量
    private String picture;//图片

}
