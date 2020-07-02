package pri.practice.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PaymentService.java
 * @Description TODO
 * @createTime 2020年06月22日 22:42:00
 */
public interface PaymentService {

    /**
     * 正常访问方法
     * @param id
     * @return
     */
    public String paymentinfoOK(Integer id);

    /**
     * 超时错误
     * @param id
     * @return
     */
    public String paymentTimeout(Integer id);

    public String paymentCircutiBreaker(@PathVariable("id") Integer id);
}
