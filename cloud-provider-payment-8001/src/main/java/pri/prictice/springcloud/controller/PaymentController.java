package pri.prictice.springcloud.controller;

import ch.qos.logback.core.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import pri.prictice.springcloud.entities.CommonResult;
import pri.prictice.springcloud.entities.Payment;
import pri.prictice.springcloud.service.PaymenService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymenService.create(payment);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功，serverPort：" + serverPort, result);
        }else {
            return new CommonResult(500, "插入失败，serverPort：" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymenService.getPaymentById(id);
        log.info("查询结果:" + result);
        if (result != null) {
            return new CommonResult(200, "查询成功，serverPort：" + serverPort, result);
        }else {
            return new CommonResult(500, "查询失败，serverPort：" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element: services){
            log.info("****element:" + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance: instances) {
            log.info(instance.getServiceId() + "\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/timeout")
    public String paymentTimeOut(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }
        return serverPort;
    }
}
