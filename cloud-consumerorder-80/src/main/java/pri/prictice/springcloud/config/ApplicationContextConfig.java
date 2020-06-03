package pri.prictice.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName ApplicationConfig.java
 * @Description TODO
 * @createTime 2020年05月10日 16:38:00
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }
}
