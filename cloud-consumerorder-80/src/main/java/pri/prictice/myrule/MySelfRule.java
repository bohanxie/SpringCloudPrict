package pri.prictice.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName MySelfRule.java
 * @Description TODO
 * @createTime 2020年06月10日 22:06:00
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
