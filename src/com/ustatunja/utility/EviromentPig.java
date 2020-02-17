package com.ustatunja.utility;

import static java.lang.Math.max;
import java.util.Random;

public class EviromentPig {

    private int temparature;

    public EviromentPig() {
    }

    public EviromentPig(int temparature) {
        this.temparature = temparature;
    }

    public int getTemparature() {
        return temparature;
    }

    public void setTemparature(int temparature) {
        this.temparature = temparature;
    }

    public void increaseTemperature() {
        this.temparature++;
    }

    public void reduceTemperature() {
        this.temparature--;
    }

    public void joinTemperature() {
        int max, min;
        max = 20;
        min = 4;
        int random_int = (int) (Math.random() * (max - min + 1) + min);
        this.setTemparature(random_int);

    }

    public void decorate() {
        boolean start;
        start = true;

        if (getTemparature() <= 7) {
            while (start) {
                increaseTemperature();
                if (getTemparature() == 12) {
                    start = false;
                } else {
                    start = true;
                }
            }
        } else {
            if (getTemparature() >= 20) {
                while (start) {
                    reduceTemperature();;
                    if (getTemparature() == 17) {
                        start = false;
                    } else {
                        start = true;
                    }
                }
            }

        }
    }
}
