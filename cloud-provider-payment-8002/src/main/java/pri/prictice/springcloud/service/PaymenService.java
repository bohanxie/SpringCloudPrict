package pri.prictice.springcloud.service;

import org.apache.ibatis.annotations.Param;
import pri.prictice.springcloud.entities.Payment;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymenService.java
 * @Description TODO
 * @createTime 2020年04月23日 22:02:00
 */
public interface PaymenService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
