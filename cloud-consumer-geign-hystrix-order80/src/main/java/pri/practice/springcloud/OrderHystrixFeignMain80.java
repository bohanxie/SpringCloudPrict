package pri.practice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName OrderHystrixFeignMain80.java
 * @Description TODO
 * @createTime 2020年06月28日 22:28:00
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixFeignMain80.class, args);
    }
}
