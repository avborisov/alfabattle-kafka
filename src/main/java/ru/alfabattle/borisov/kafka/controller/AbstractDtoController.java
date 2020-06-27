package ru.alfabattle.borisov.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alfabattle.borisov.kafka.model.AbstractDto;
import ru.alfabattle.borisov.kafka.service.AbstractDtoService;

@RestController
@RequestMapping(value = "/kafka")
@Slf4j
public class AbstractDtoController {

    private final AbstractDtoService service;
    private final Environment env;

    @Autowired
    public AbstractDtoController(AbstractDtoService service, Environment env) {
        this.service = service;
        this.env = env;
    }

    @GetMapping(value = "get")
    public ResponseEntity<AbstractDto> getAbstract() {
        log.info("GET AbstractDto data invoked");
        return new ResponseEntity(HttpStatus.OK);
    }

}
