package com.dh.mail;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 折扣处理
 * @author: Jh Lee
 * @create: 2023-02-25 22:07
 **/
public interface IPromotionService {

    @GetMapping("/promotion")
    String getPromotionById();
}
