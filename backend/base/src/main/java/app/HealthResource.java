package app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthResource {

    @GetMapping(path = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
    public String health() {
        log.trace("Health check");
        return "OK";
    }
}
