package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.dto.OrderItemRequest;
import com.tencent.wxcloudrun.model.OrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderItemMapper {
    @Insert("INSERT INTO order_item (picture, prompt, model, seed, params, custom_type, custom_param, amount, price, total_price, order_id, print_status, picture_base64) " +
            "VALUES (#{orderItem.picture}, #{orderItem.prompt}, #{orderItem.model}, #{orderItem.seed}, #{orderItem.params}, " +
            "#{orderItem.customType}, #{orderItem.customParam}, #{orderItem.amount}, #{orderItem.price}, #{orderItem.totalPrice}, " +
            "#{orderItem.orderId}, #{orderItem.printStatus}, #{orderItem.pictureBase64})")
    @Options(useGeneratedKeys = true, keyProperty = "orderItem.id")
    void insertOrderItem(@Param("orderItem") OrderItem orderItem);
}
