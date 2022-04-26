package com.fakecompany.customers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase( CustomerRepository repository) {
      return args -> {
            log.info("Preloading " + repository.save(new Customer("Mario", "Alberto", "Torreblanca", "Sotelo", "2292507583", "Herradura 123", "Veracruz", "23445322", "12123456")));
            log.info("Preloading " + repository.save(new Customer("María", "Fernanda", "Torreblanca", "Sotelo", "2292507584", "Herradura 123", "Veracruz", "23445323", "12312457")));
            log.info("Preloading " + repository.save(new Customer("Jorge", "Alberto", "Torreblanca", "Sotelo", "2292507585", "Herradura 123", "Veracruz", "23445324", "12312458")));
        };
    }
}
