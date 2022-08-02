package com.acmeflix.team7.config;

import com.acmeflix.team7.base.BaseComponent;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "myproperties")
@Data
public class GlobalYamlProperties extends BaseComponent {
    private int threadPool;
    private String email;
    private List<String> servers;
}