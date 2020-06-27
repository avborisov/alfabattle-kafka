package ru.alfabattle.borisov.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.alfabattle.borisov.kafka.model.AbstractDto;

@Service
@Slf4j
public class AbstractDtoServiceImpl implements AbstractDtoService {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    @KafkaListener(id = "AbstractDto", topics = {"server.abstractTopic"}, containerFactory = "singleFactory")
    public void consume(AbstractDto dto) {
        log.info("=> consumed {}", writeValueAsString(dto));
    }

    private String writeValueAsString(AbstractDto dto) {
        try {
            return objectMapper.writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            log.error("Writing value to JSON failed: {}", dto.toString());
            log.error("Stacktrace: ", e);
            throw new RuntimeException("Writing value to JSON failed: " + dto.toString());
        }
    }

}
