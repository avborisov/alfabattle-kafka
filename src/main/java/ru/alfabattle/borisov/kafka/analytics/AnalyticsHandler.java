package ru.alfabattle.borisov.kafka.analytics;

import ru.alfabattle.borisov.kafka.model.AbstractDto;

@FunctionalInterface
public interface AnalyticsHandler {

    public void handle(AbstractDto object);

}
