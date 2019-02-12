package com.supplier.commons.bean.order;

import java.math.BigDecimal;

/**
 * Created by o-zhengzhenhai on 2019/2/12.
 * 订单公共实体类
 */
public class Order {
    private String orderNumber;

    private BigDecimal orderPrice;

    private String userName;

    public Order(String orderNumber, BigDecimal orderPrice, String userName) {
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
        this.userName = userName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
