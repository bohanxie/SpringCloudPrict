package pri.prictice.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pri.prictice.springcloud.entities.CommonResult;
import pri.prictice.springcloud.entities.Payment;
import pri.prictice.springcloud.service.PaymenService;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2020年04月23日 22:05:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymenService paymenService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymenService.create(payment);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        }else {
            return new CommonResult(500, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymenService.getPaymentById(id);
        log.info("查询结果:" + result);
        if (result != null) {
            return new CommonResult(200, "查询成功", result);
        }else {
            return new CommonResult(500, "查询失败", null);
        }
    }
}
