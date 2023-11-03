package com.example.dummy.dataloader;

import com.example.dummy.entity.Employee;
import com.example.dummy.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Marto Parto", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Ivan Ivanov", "thief")));
        };
    }
}