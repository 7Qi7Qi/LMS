package com.jlu.lmsweb;

import com.jlu.lmsweb.utils.ProgressBarUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);

        ProgressBarUtil barUtil = new ProgressBarUtil.Builder().speed(10).interval(200).builder();
        for (int i = 0; i <= 10; i++) {
            barUtil.printProgress(i);
        }
        System.out.println("\n*****************************************LMS Started*****************************************");
    }

}
