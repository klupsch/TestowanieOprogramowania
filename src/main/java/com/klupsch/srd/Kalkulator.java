package com.klupsch.srd;

import com.klupsch.srd.Exceptions.KalkulatorException;

public class Kalkulator {

    public  double dodaj (int a, int b) {
        return a + b;

    }

    public  double dzielenie (int a, int b) throws KalkulatorException {
        if (b == 0) {
            throw new KalkulatorException("nie dziel przez 0");
        }

        return a/b;

    }
}
