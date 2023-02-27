package com.dh.mail.goodsservice.contorller;

import com.dh.mail.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 商品查询
 * @author: Jh Lee
 * @create: 2023-02-24 00:05
 **/
@Slf4j
@RestController
public class GoodsService implements IGoodsService {

    @Value("${server.port}")
    private String port;

    /**
     * 根据ID查询商品信息
     * @return
     */
    @GetMapping("/goods")
    public String getGoodsById(){
        log.info("端口信息：{}",port);
        return "商品信息";
    }
}
