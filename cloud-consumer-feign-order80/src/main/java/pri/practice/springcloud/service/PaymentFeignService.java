package pri.practice.springcloud.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pri.prictice.springcloud.entities.CommonResult;
import pri.prictice.springcloud.entities.Payment;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentFeignService.java
 * @Description TODO
 * @createTime 2020年06月16日 22:46:00
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
