package pri.practice.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pri.practice.springcloud.service.PaymentService;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2020年06月22日 22:48:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id) {
        String result = paymentService.paymentinfoOK(id);
        log.info("result: " + result);
        return result;
    }


    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id){
        String result = paymentService.paymentTimeout(id);
        log.info("result: " + result);
        return result;
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircutiBreaker(@PathVariable("id") Integer id){
        return paymentService.paymentCircutiBreaker(id);
    }
}
