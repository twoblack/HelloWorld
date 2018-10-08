package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

	public String sayHello(){
		return "Hello World!";
	}
	
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
        System.out.println(new HelloWorld().sayHello());
    }
}
