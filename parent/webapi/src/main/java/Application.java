import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by luyh on 16/4/27.
 */

@SpringBootApplication
@ComponentScan("com.karlc.pro")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }
}
