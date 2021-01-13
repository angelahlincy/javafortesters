package com.javafortesters.chap003myfirsttest.examples;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer=2+2;
        assertEquals("2+2=4", 4, answer);

    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int answer=2-2;
        assertEquals("2-2=0",0,answer);
    }

    @Test
    public void canDivideTwobyTwo(){
         int answer=2/2;
         assertEquals("2/2=1",1,answer);
    }

    @Test
    public void canMutiplyTwobyTwo(){
        int answer=2*2;
        assertEquals("2*2=4",4,answer);
    }
}
