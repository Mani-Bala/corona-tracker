package com.dream.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CoronaTrackerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CoronaTrackerApplication.class, args);
  }

}
