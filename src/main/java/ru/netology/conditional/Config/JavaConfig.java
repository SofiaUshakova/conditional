package ru.netology.conditional.Config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional.Controller.DevProfile;
import ru.netology.conditional.Controller.ProductionProfile;
import ru.netology.conditional.Controller.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "true",
            matchIfMissing = true
    )

    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "false"
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
