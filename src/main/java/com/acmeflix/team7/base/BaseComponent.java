package com.acmeflix.team7.base;

import lombok.extern.slf4j.Slf4j;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class BaseComponent {
    @PostConstruct
    private void init() {
        log.trace("Loaded {}.", getClass().getName());
    }

    @PreDestroy
    private void destroy() {
        log.trace("Ready to shutdown {}.", getClass().getName());
    }
}
