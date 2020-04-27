package com.git.zxxxd.demomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
	}
    @RequestMapping("/")
  public String hello() {
      return "Hello World!";
  }

}
