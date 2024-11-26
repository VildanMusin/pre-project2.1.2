import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }


    @Bean
    @Scope("prototype") // Каждый раз создается новый экземпляр
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Barsik");
        return cat;
    }

}