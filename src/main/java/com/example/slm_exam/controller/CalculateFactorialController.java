package com.example.slm_exam.controller;

import com.example.slm_exam.service.CalculateFactorialService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api", method = {RequestMethod.GET})
public class CalculateFactorialController {

    private CalculateFactorialService factorialService;

    @GetMapping(path = "/factorial")
    public Integer calculateFactorialValue(@RequestParam int number) {

        return factorialService.calculateFactorialValue(number);
    }
}
