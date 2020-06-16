package pri.practice.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pri.practice.springcloud.service.PaymentFeignService;
import pri.prictice.springcloud.entities.CommonResult;
import pri.prictice.springcloud.entities.Payment;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName OrderFeignController.java
 * @Description TODO
 * @createTime 2020年06月16日 22:51:00
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
