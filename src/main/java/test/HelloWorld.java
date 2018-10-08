package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

	public String sayHello(){
		System.out.println("哈哈哈哈");
		return "Hello World!";
	}
	
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
        System.out.println(new HelloWorld().sayHello());
        
    }
}
