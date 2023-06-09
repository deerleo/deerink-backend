package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.OrderRequest;
import com.tencent.wxcloudrun.model.Order;

public interface OrderService {
    Order placeOrder(OrderRequest orderRequest) throws Exception;

    Order getOrderDetail(Integer id);
}
