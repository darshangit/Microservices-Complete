package dash.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Dash on 3/6/2018.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationMain.class, args);
    }
}
