package com.bruno.bancos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author bruno
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.zavala.bancos.customer")
public class JpaConfig {

}
