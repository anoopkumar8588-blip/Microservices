package com.zepto.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.exception.OrderNotFoundException;
import com.zepto.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public OrderEntity updateStatus(String id, String status) {
		OrderEntity entity = orderRepository.findById(id).orElseThrow(()-> new OrderNotFoundException("Order Not found"));
		entity.setId(id);
		entity.setStatus(status);
		return orderRepository.save(entity);

	}
}
