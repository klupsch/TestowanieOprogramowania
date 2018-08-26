package com.klupsch.srd;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;

public class LiczeniePolFigurTest {


    @Test
    public void prostokat() {
        //given
        LiczeniePolFigur liczeniePolFigur = new LiczeniePolFigur();
        int a = 10;
        int b = 20;

        //when

        double result = liczeniePolFigur.prostokat(10, 20);
        //then

        assertThat(result, Matchers.is(Matchers.equalTo(200.0)));
        assertThat(result, Matchers.notNullValue());
        assertThat(result, Matchers.greaterThan(20.0));
    }

    @Test

    public void kwadrat() {
        //given
        LiczeniePolFigur liczeniePolFigur = new LiczeniePolFigur();
        int a = 10;
        int b = 10;
        //when

        double result = liczeniePolFigur.kwadrat(10, 10);

        //then
        assertThat(result, Matchers.greaterThan(10.0));
        assertThat(result, Matchers.notNullValue());
        assertThat(result, Matchers.is(Matchers.equalTo(100.0)));
    }

    @Test
    public void trapez() {
        //given
        LiczeniePolFigur liczeniePolFigur = new LiczeniePolFigur();
        int a= 5;
        int b= 20;
        int h = 30;


        //when
double result = liczeniePolFigur.trapez(5, 20, 30);

        //then
assertThat(result, Matchers.greaterThan(300.0));
assertThat(result, Matchers.notNullValue());
assertThat(result, Matchers.is(Matchers.equalTo(375.0)));


    }

    @Test
    public void kolo() {

        //given
        LiczeniePolFigur liczeniePolFigur = new LiczeniePolFigur();
        int r =10;
        //when
        double result = liczeniePolFigur.kolo(10);
        //then
   assertThat(result, Matchers.greaterThan(10.0));
   assertThat(result, Matchers.notNullValue());
   assertThat(result, Matchers.is(Matchers.equalTo(314.1592653589793)));

    }
}