package klambo.salesdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SalesDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesDbApplication.class, args);
    }

}
