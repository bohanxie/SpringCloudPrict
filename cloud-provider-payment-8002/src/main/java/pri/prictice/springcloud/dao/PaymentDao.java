package pri.prictice.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pri.prictice.springcloud.entities.Payment;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentDao.java
 * @Description TODO
 * @createTime 2020年04月23日 21:47:00
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
