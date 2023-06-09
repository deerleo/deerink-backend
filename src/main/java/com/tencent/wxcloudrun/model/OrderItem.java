package com.tencent.wxcloudrun.model;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class OrderItem implements Serializable {

    public OrderItem() {
        // 无参构造函数
    }
    private Integer id;

    private String picture;

    private String prompt;

    private String model;

    private String seed;

    private String params;

    private String customType;

    private String customParam;

    private Integer amount;

    private Double price;

    private Double totalPrice;

    private Integer orderId;

    private Integer printStatus;

    private String pictureBase64;

}