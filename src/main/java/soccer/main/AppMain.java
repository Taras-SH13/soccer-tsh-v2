package soccer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "soccer")
@EnableJpaRepositories(basePackages = "soccer.db")
@EntityScan(basePackages = "soccer.db.entity")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }
}
