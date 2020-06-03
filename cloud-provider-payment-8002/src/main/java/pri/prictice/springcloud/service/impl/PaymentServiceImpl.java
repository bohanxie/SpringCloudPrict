package pri.prictice.springcloud.service.impl;

import org.springframework.stereotype.Service;
import pri.prictice.springcloud.dao.PaymentDao;
import pri.prictice.springcloud.entities.Payment;
import pri.prictice.springcloud.service.PaymenService;

import javax.annotation.Resource;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @Description TODO
 * @createTime 2020年04月23日 22:03:00
 */
@Service
public class PaymentServiceImpl implements PaymenService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
