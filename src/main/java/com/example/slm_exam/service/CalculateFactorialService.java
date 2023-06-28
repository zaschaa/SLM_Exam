package com.example.slm_exam.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateFactorialService {

    private int total = 0;

    public Integer calculateFactorialValue(int input) {
        // when input is invalid, aka negative, return 0
        if (input < 0) {
            return 0;
        }

        int fact = 1;
        for (int i = 1; i <= input; i++) {
            fact = fact * i;
        }
        total += fact;
        return fact;
    }

    public Integer getTotalFactorialValue() {
        return total;
    }
}
