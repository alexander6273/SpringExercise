package com.example.springexercise.controllers;

import com.example.springexercise.services.CalculateWeekDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class firstControler
{
    @GetMapping("/hello")
    public String greatMessage(){
        return "Hello user";
    }

    @GetMapping("/echo")
    public String endpoint(@RequestParam String input){
        return input;
    }

    /*@GetMapping("/erDetFredag")
    public String endpoint(){
        Random ran = new Random();
        Date date = new Date();
        int q = ran.nextInt(31) + 1;
        int m = ran.nextInt(14) + 2;
        int k = date.getYear() / 100;
        int j = date.getYear() % 100;
        int h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) %7;
        int d = ((h + 5) % 7) + 1;
        if (d == 7){
            return "ja det er fredag ";
        } else {
            return "nej det er ikke fredag ";
        }
    }*/

    @GetMapping("/isItFriday")
    public String endpoint2()
    {
        CalculateWeekDay cal = new CalculateWeekDay();

        String result = "";
        switch (cal.calculateDay())
        {
            case 6 -> {
                result += "Yes it is friday";
            }
            case 5 -> {
                result += "no it is thursday";
            }
            case 4 -> {
                result += "no it is wednesday";
            }
            case 3 -> {
                result += "no it is tuesday";
            }
            case 2 -> {
                result += "no it is monday";
            }
            case 1 -> {
                result += "no it is sunday";
            }
            case 7 -> {
                result += "no it is saturday";
            }
        }
        return result;
    }
}
