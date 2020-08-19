package pri.practice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName MainAppConfigCenter3344.java
 * @Description TODO
 * @createTime 2020年08月04日 23:59:00
 */
@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class MainAppConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(MainAppConfigCenter3344.class, args);
    }
}
