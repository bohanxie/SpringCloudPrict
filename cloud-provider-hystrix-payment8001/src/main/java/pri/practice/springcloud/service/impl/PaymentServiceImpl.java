package pri.practice.springcloud.service.impl;

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
    public String paymentTimeout(Integer id) {
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池 " + Thread.currentThread().getName() + "Paymentinfo Timeout ,id" + id + " 耗时3s";
    }
}
