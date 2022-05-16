package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {


    @ParameterizedTest
    @CsvSource(
            value = {"square inside range ,200,300,3",
                    "square under range,100,199,5",
                    "square over range,301,400,3",
                    "zero range,0,0,0",
                    "interval border square number,225,225,1",
                    "invalid range,225,225,1"})
    void shouldSquareGivenNumbers(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareGivenNumbers(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}