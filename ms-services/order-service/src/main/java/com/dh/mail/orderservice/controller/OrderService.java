package com.dh.mail.orderservice.controller;

import com.dh.mail.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 订单信息
 * @author: Jh Lee
 * @create: 2023-02-24 00:08
 **/
@Slf4j
@RestController
public class OrderService implements IOrderService {

    @PostMapping("/order")
    public String createOrder(@RequestParam String goodsInfo,
                              @RequestParam String promotionInfo) {

        log.info("开始创建订单，请求参数，{}，{}",goodsInfo,promotionInfo);
        return "订单创建成功";
    }
}
