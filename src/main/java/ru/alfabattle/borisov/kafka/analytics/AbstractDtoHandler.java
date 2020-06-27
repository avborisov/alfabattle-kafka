package ru.alfabattle.borisov.kafka.analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alfabattle.borisov.kafka.model.AbstractDto;

import java.util.List;

@Service
public class AbstractDtoHandler {

    @Autowired
    private List<AnalyticsHandler> handlers;

    public void handle(AbstractDto dto) {
        handlers.forEach(handler -> handler.handle(dto));
    }

}
