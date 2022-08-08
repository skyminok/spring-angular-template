package app.feature;

import app.AppPath;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Tag(name = "users", description = "Управление пользователями")
@RestController
@RequestMapping(path = AppPath.API_PATH + "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserResource {

    @GetMapping
    @Operation(summary = "Список пользователей")
    public List<UserDto> list() {
        return Collections.emptyList();
    }
}
