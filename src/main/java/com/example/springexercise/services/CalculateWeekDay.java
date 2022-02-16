package com.example.springexercise.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class CalculateWeekDay
{
    public int calculateDay(){
        Random ran = new Random();
        Date date = new Date();
        int q = 18;
        int m = 14;
        int k = 20;
        int j = 22;
        int h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) %7;
        return ((h + 5) % 7) + 1;
    }
}
