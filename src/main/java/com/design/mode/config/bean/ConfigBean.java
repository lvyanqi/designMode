package com.design.mode.config.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
public class ConfigBean {
    @Value("${config.test.one}")
    private Integer one;

    @Value("$config.test.two")
    private Integer two;
}
