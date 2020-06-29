package pri.practice.springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import pri.practice.springcloud.service.PaymentService;

import java.util.concurrent.TimeUnit;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @Description TODO
 * @createTime 2020年06月22日 22:43:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentinfoOK(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "Paymentinfo ok ,id" + id + " ok";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentTimeoutHander", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentTimeout(Integer id) {
        int timeNumber = 5;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池 " + Thread.currentThread().getName() + "Paymentinfo Timeout ,id" + id + " 耗时3s";
    }

    /**
     * 服务降级
     * @param id
     * @return
     */
    public String paymentTimeoutHander(Integer id){
        return  "线程池 " + Thread.currentThread().getName() + "paymentTimeoutHander ,id" + id + " 出事";
    }
}
