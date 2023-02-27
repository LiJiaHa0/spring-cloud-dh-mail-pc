package com.dh.mail;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 订单信息
 * @author: Jh Lee
 * @create: 2023-02-25 22:08
 **/
public interface IOrderService {

    @PostMapping("/order")
    String createOrder(@RequestParam(value = "goodsInfo") String goodsInfo,
                       @RequestParam(value = "promotionInfo")  String promotionInfo);
}
