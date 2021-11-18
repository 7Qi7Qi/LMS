package com.jlu.lmsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    public static Integer count = 1;


    @RequestMapping("")
    public ModelAndView home() {
        return new ModelAndView("home.html");
    }

    @RequestMapping("first")
    public String firstTest() {
        System.out.println("count++ = " + count++);
        return count.toString();
    }

    @RequestMapping("404")
    public String secondTest() {
        ModelAndView view = new ModelAndView();
        String s = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>404</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <h1>404</h1>\n"
                + "</body>\n"
                + "\n"
                + "<style>\n"
                + "  h1 {\n"
                + "    margin: auto;\n"
                + "    width: 50%;\n"
                + "    font-size: 200px;\n"
                + "    color: crimson;\n"
                + "    text-align: center;\n"
                + "    border: 3px solid green;\n"
                + "  }\n"
                + "</style>\n"
                + "</html>";
        return s;
    }
}
