package com.zepto.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;
import com.zepto.order.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PutMapping("/orders/{id}/status")
	public ResponseEntity updateOrderStatus(@PathVariable String id, @RequestBody OrderRequest orderRequest) {

		orderService.updateStatus(id, orderRequest.getStatus());
		return ResponseEntity.ok("Order Status Updated!!!");
	}
}
