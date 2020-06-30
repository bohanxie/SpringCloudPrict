package pri.practice.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentFallbackService.java
 * @Description TODO
 * @createTime 2020年06月30日 22:12:00
 */
@Component
public class PaymentFallbackService  implements PaymentHystrixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "-------------PaymentFallbackService falll back";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "-------------PaymentFallbackService falll back time oout";
    }
}
