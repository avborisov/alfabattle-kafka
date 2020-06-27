package ru.alfabattle.borisov.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.alfabattle.borisov.kafka.analytics.AnalyticsHandler;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public AnalyticsHandler getStepOneAnalyticsHandler() {
        return dto -> {
            // do something with dto
        };
    }

}
