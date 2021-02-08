package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sample.hello.HelloModules;

@SpringBootApplication
public class MainApp {
	
    public static void main(String[] args) {
    	
    	SpringApplication.run(MainApp.class, args);
    	
    	 
//        HelloModules.doSomething();
//        
//        Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
//        HelloInterface service = services.iterator().next();
//        service.sayHello();
    }
}
