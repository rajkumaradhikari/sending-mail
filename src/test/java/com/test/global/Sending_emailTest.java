package com.test.global;

import com.citytech.global.practice.AddTwoNumber;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;


@MicronautTest
class Sending_emailTest {

    @Inject
    EmbeddedApplication<?> application;

//    @Test
//    void testItWorks() {
//        Assertions.assertTrue(application.isRunning());
//    }

    Calculator underTest = new Calculator();
    AddTwoNumber testingAddTwoNumber = new AddTwoNumber();

    SumTwoNumber obj = new SumTwoNumber();




    @Test
    void itShouldAddTwoNumber()
    {
        int firstNumber = 10;
        int secondNumber = 20;

        int result = underTest.add(firstNumber,secondNumber);

        int expected = 300;

        Assertions.assertThat(result).isEqualTo(expected);


    }

    @Test
    void addTest()
    {
        int a = 55;
        int b = 5;
        int result1 = testingAddTwoNumber.add(a, b);
        int expected = 60;

        Assertions.assertThat(result1).isEqualTo(expected);
    }

    class Calculator{

        int add(int a, int b)
        {
            return a+b;
        }
    }

    @Test
    void test()
    {
        int first  = 10;
        int second = 5;

        int sum = obj.sum(first, second);

        int expected = 15;

        Assertions.assertThat(expected).isEqualTo(sum);


    }



}
