package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void nextSecond() {
        //ARRANGE
        Time t = new Time(12,14,15);
        //ACT
        Time nextT = t.nextSecond();
        //ASSERT
        assertEquals(new Time(12,14,16), nextT);
    }

    @org.junit.jupiter.api.Test
    void nextSecond2(){
        //ARRANGE
        Time t2 = new Time(12,59,44);
        //ACT
        Time nextT2=t2.nextSecond();
        //ASSERT
        assertEquals(new Time(12,59,45), nextT2);
    }



}