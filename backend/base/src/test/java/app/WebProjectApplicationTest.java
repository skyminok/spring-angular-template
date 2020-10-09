package app;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Boot testing of entire app
 */
@Slf4j
@SpringBootTest(classes = WebProjectApplication.class)
class WebProjectApplicationTest {

    @Test
    void contextLoads() {
        log.info("Spring Boot Application is started successfully!");
    }
}
