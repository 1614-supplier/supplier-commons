package com.supplier.commons.bean.commodity;

import java.io.Serializable;

/**
 * Created by o-zhengzhenhai on 2019/2/12.
 * 商品公共类
 */
public class Goods implements Serializable{

    private String name;

    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
