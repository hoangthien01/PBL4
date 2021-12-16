package com.pbl4.demo.service.impl;

import com.pbl4.demo.dao.OrderDAO;
import com.pbl4.demo.entity.Order;
import com.pbl4.demo.model.CartInfo;
import com.pbl4.demo.model.OrderDetailInfo;
import com.pbl4.demo.model.OrderInfo;
import com.pbl4.demo.pagination.PaginationResult;
import com.pbl4.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO orderDAO;

    @Override
    public void saveOrder(CartInfo cartInfo) {
        orderDAO.saveOrder(cartInfo);
    }

    @Override
    public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage) {
        return orderDAO.listOrderInfo(page,maxResult,maxNavigationPage);
    }

    @Override
    public Order findOrder(String orderId) {
        return orderDAO.findOrder(orderId);
    }

    @Override
    public OrderInfo getOrderInfo(String orderId) {
        return orderDAO.getOrderInfo(orderId);
    }

    @Override
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId) {
        return orderDAO.listOrderDetailInfos(orderId);
    }
}
