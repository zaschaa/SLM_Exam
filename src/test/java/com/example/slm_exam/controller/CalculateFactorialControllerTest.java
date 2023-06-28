package com.example.slm_exam.controller;

import com.example.slm_exam.service.CalculateFactorialService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class CalculateFactorialControllerTest {

    @Mock
    private CalculateFactorialService factorialService;

    @InjectMocks
    private CalculateFactorialController messageController;

    @Test
    void shouldCallCalculateFactorialValueFromService() {

        messageController.calculateFactorialValue(19);

        Mockito.verify(factorialService, times(1)).calculateFactorialValue(19);
    }
    @Test
    void shouldCallGetTotalFactorialValueFromService() {

        messageController.getTotalFactorialValue();

        Mockito.verify(factorialService, times(1)).getTotalFactorialValue();
    }
}
