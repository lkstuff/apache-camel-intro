package com.lkstuff.orderfulfillment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Main application configuration for the order fulfillment processor.
 */

@Configuration
@ComponentScan(basePackages = "com.lkstuff.orderfulfillment")
@PropertySource("classpath:order-fulfillment.properties")
public class Application{
}
