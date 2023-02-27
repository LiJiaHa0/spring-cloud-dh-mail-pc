package com.dh.mail.feignclient;

import com.dh.mail.IOrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description: order   FeignClient
 * @author: Jh Lee
 * @create: 2023-02-25 22:29
 **/
@FeignClient(name = "order-service")
public interface IOrderServiceFeignClient extends IOrderService {
}
