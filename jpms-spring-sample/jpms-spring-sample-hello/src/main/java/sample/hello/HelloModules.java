package sample.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloModules implements HelloInterface {
    public static void doSomething() {
        System.out.println("Hello, Modules!");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
