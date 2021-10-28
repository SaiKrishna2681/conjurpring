import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.cyberark.conjur.api.Conjur;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World - v3!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
        Conjur conjur = new Conjur();
		String secret = conjur.variables().retrieveSecret("jenkins-app/web_password");

        
    }

}
