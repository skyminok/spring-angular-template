package app;

import org.springframework.boot.jdbc.autoconfigure.EmbeddedDataSourceConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("h2")
@Configuration
@Import(org.springframework.boot.jdbc.autoconfigure.EmbeddedDataSourceConfiguration.class)
public class H2DataSourceConfig {
}
