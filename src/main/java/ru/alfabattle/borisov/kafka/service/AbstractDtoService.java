package ru.alfabattle.borisov.kafka.service;

import ru.alfabattle.borisov.kafka.model.AbstractDto;

public interface AbstractDtoService {

    void consume(AbstractDto dto);

}
