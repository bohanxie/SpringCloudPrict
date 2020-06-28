package pri.practice.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pri.practice.springcloud.service.PaymentHystrixService;

import javax.annotation.Resource;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentHystrixController.java
 * @Description TODO
 * @createTime 2020年06月28日 22:32:00
 */
@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService service;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        return service.paymentInfoOK(id);
    }


    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id){
        return service.paymentInfoTimeout(id);
    }
}
