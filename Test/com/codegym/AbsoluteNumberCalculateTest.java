package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculateTest {

    @Test
    void testFindAbsolute() {
        int number=0;//gtri đầu vào
        int expected=0;//giá trị mong muốn
        int result=AbsoluteNumberCalculate.findAbsolute(number);//giá trị thực tế
        assertEquals(expected,result);//so sánh bằng nhau);
    }

    @Test
    void testFindAbsolute1() {
        int number=-1;//gtri đầu vào
        int expected=1;//giá trị mong muốn
        int result=AbsoluteNumberCalculate.findAbsolute(number);//giá trị thực tế
        assertEquals(expected,result);//so sánh bằng nhau);
    }
    @Test
    void testFindAbsolute2() {
        int number=1;//gtri đầu vào
        int expected=1;//giá trị mong muốn
        int result=AbsoluteNumberCalculate.findAbsolute(number);//giá trị thực tế
        assertEquals(expected,result);//so sánh bằng nhau);
    }
}