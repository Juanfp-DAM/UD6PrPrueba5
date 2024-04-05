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

    @org.junit.jupiter.api.Test
    void nextSecond3(){
        //ARRANGE
        Time t3 = new Time(1,9,59);
        //ACT
        Time nextT3=t3.nextSecond();
        //ASSERT
        assertEquals(new Time(1,10,0), nextT3);
    }

    

}