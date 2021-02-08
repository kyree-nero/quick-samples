package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sample.hello.HelloModules;

@Component
public class AppRunner implements CommandLineRunner{
	@Autowired HelloModules helloService;
	
	
	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello();
	}

}
