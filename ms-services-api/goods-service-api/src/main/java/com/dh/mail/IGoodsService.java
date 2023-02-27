package com.dh.mail;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 商品接口
 * @author: Jh Lee
 * @create: 2023-02-25 21:16
 **/
public interface IGoodsService {

    @GetMapping("/goods")
    String getGoodsById();
}
