package com.pbl4.demo.service;

import com.pbl4.demo.entity.Order;
import com.pbl4.demo.model.CartInfo;
import com.pbl4.demo.model.OrderDetailInfo;
import com.pbl4.demo.model.OrderInfo;
import com.pbl4.demo.pagination.PaginationResult;

import java.util.List;

public interface OrderService {
    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);

    public Order findOrder(String orderId);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
