package com.kodilla.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class KodillaHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(KodillaHibernateApplication.class, args);
    }

}

