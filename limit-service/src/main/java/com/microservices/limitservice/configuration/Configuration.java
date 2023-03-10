package com.microservices.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limits-service")
@org.springframework.context.annotation.Configuration()
public class Configuration {

    private int minimum;
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
