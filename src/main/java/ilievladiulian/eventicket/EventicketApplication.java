package ilievladiulian.eventicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by Vlad on 27/05/2017.
 */
@SpringBootApplication
@EntityScan
public class EventicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventicketApplication.class, args);
    }

}
