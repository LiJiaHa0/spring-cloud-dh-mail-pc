package com.dh.mail.feignclient;

import com.dh.mail.IGoodsService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description: feignclient
 * @author: Jh Lee
 * @create: 2023-02-25 22:25
 **/
@FeignClient(name = "goods-service")
public interface IGoodsServiceFeignClient extends IGoodsService {
}
