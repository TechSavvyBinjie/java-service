package top.yf.javaservice_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@SpringBootApplication
public class JavaService001Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaService001Application.class, args);
    }
     @GetMapping("/list")
    public List<String> getList(){
        return List.of("niko","simon","smmogy");
    }
}
