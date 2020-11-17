package app;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("postgres")
@Configuration
@Import(DataSourceAutoConfiguration.class)
public class PostgresDataSourceConfig {
}
