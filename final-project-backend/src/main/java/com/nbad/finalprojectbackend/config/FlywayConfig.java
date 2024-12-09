package com.nbad.finalprojectbackend.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {
    private final DataSource dataSource;

    FlywayConfig(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Bean(initMethod = "migrate")
    public Flyway flyway() {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .baselineOnMigrate(true)
                .validateOnMigrate(false)
                .load();
        
        flyway.repair();
        
        return flyway;
    }
}
