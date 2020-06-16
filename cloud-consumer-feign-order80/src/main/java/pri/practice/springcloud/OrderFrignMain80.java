package pri.practice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName OrderFrignMain80.java
 * @Description TODO
 * @createTime 2020年06月16日 22:44:00
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFrignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFrignMain80.class, args);
    }
}
