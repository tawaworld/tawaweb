package world.tawa.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by tawa on 2018-12-16
 */
@SpringBootApplication
public class TawaWebSystem {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TawaWebSystem.class);
        springApplication.run(args);
    }
}
