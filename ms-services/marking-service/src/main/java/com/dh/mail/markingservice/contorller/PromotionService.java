package com.dh.mail.markingservice.contorller;

import com.dh.mail.IPromotionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 折扣查询
 * @author: Jh Lee
 * @create: 2023-02-24 00:06
 **/
@RestController
public class PromotionService implements IPromotionService {

    @GetMapping("/promotion")
    public String getPromotionById(){
        return "查询到指定商品的折扣";
    }
}
