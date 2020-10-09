package app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@EnableAutoConfiguration()
@ComponentScan({"app"})
public class WebProjectApplication {

    public static void main(String[] args) {
        log.info("Lets get started...");
        SpringApplication.run(WebProjectApplication.class, args);
    }
}
