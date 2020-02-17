package com.ustatunja.utility;

import com.ustatunja.entity.Pig;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RaisePig extends TimerTask {

    private final double WEIGHTMONTHONE = 20;
    private final double WEIGHTMONTHTWO = 40;
    private final double WEIGHTMONTHTHREE = 60;
    private final double WEIGHTMONTHFOUR = 80;
    private final double WEIGHTMONTHFIVE = 100;
    private final double WEIGHTMONTHSIX = 120;
    private Pig objPig;

    public RaisePig() {
        objPig = new Pig(10, 0);
    }

    public RaisePig(Pig objPig) {
        this.objPig = objPig;
    }

    public boolean isWeightIdealForMonth(double weight, int weightMonth) {

        if (weight >= WEIGHTMONTHONE && weightMonth == 1) {
            return true;
        } else {
            if (weight >= WEIGHTMONTHTWO && weightMonth == 2) {
                return true;
            } else {
                if (weight >= WEIGHTMONTHTHREE && weightMonth == 3) {
                    return true;
                } else {
                    if (weight >= WEIGHTMONTHFOUR && weightMonth == 4) {
                        return true;
                    } else {
                        if (weight >= WEIGHTMONTHFIVE && weightMonth == 5) {
                            return true;
                        } else {
                            if (weight >= WEIGHTMONTHSIX && weightMonth == 6) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * numero 1 concentrado que valdra 1 numero 2 desperdisio que valdra 0,5
     *
     * @return double el valor a aumentar el peso del cerdo
     */
    public double feedPig(int number) {
        double cont;
        cont = 0;
        if (number == 1) {
            cont += 1;
        } else {
            cont += 0.5;
        }

        return cont;
    }

    public void increaseFoodPig(boolean nurish, int numberFood) {
        double cont;
        cont = 0;
        if (!nurish) {
            cont = feedPig(numberFood);
            objPig.setWeight(cont);
        }
    }

    @Override
    public void run() {
        double countWeight;
        countWeight = objPig.getWeight();
        countWeight += feedPig(1);
        objPig.setWeight(countWeight);
    }

    public boolean sellPig() {
        if (objPig.getWeight() >= 120) {
            return true;
        } else {
            return false;
        }

    }

    public Pig getObjPig() {
        return objPig;
    }

    public void setObjPig(Pig objPig) {
        this.objPig = objPig;
    }

}
