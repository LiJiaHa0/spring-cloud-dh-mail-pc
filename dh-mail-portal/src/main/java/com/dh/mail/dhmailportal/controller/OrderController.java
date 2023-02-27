package com.dh.mail.dhmailportal.controller;

import com.dh.mail.IGoodsService;
import com.dh.mail.IOrderService;
import com.dh.mail.IPromotionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 订单控制器
 * @author: Jh Lee
 * @create: 2023-02-24 00:02
 **/
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private IGoodsService iGoodsService;

    @Autowired
    private IPromotionService iPromotionService;

    @Autowired
    private IOrderService iOrderService;

    @GetMapping()
    public String order(){

        log.info("begin do order");

        String goodsById = iGoodsService.getGoodsById();
        String promotionById = iPromotionService.getPromotionById();
        String order = iOrderService.createOrder(goodsById, promotionById);
        return order;
        //TODO 商品模块，查询商品信息
//        ServiceInstance choose = loadBalancerClient.choose("goods-service");
//        String url = String.format("http://%s:%s", choose.getHost(), choose.getPort());
//        log.info("ribbon url :{}",url);
//        String goodsInfo = restTemplate.getForObject("http://goods-service:9090/goods", String.class);
//        //TODO 营销模块，查询注销信息
//        String promotionInfo = restTemplate.getForObject("http://marking-service:9091/promotion", String.class);
//        //TODO 会员模块，查看会员权益
//        //TODO 订单模块，查询订单信息
//        MultiValueMap<String,Object> param = new LinkedMultiValueMap<>();
//        param.add("goodsInfo",goodsInfo);
//        param.add("promotionInfo",promotionInfo);
//        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(param, new HttpHeaders());
//        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://order-service:9092/order", httpEntity, String.class);
//        return stringResponseEntity.getBody();
    }
}
