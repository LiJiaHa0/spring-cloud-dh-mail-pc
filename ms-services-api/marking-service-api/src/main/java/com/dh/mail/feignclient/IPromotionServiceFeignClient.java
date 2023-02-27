package com.dh.mail.feignclient;

import com.dh.mail.IPromotionService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description: 折扣FeignClient
 * @author: Jh Lee
 * @create: 2023-02-25 22:27
 **/
@FeignClient(name = "marking-service")
public interface IPromotionServiceFeignClient extends IPromotionService {
}
