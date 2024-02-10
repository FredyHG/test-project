package dev.fredyhg.testproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@EnableScheduling
@SpringBootApplication
@Slf4j
public class TestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
    }

    @Scheduled(cron = "0 20 4 * * ?")
    public void testSchedule(){
        log.info(String.valueOf(new Date()));
    }

}
