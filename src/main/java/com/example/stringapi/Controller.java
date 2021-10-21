package com.example.stringapi;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @RequestMapping("/lowerCase/{string}")
    public int lowerCase(@PathVariable String string){
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) number++;
        }
        return number;
    }

}