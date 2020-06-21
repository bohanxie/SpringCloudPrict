package pri.practice.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName FeignConfig.java
 * @Description TODO
 * @createTime 2020年06月21日 21:23:00
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
