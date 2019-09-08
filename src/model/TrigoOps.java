package model;

import java.lang.StrictMath;
import java.util.Scanner;
import model.MediumOps;

/**
 * The TrigoOps has five of the important trigonometric functions.
 * @author  Camilo Cordoba.
 * @since 1.0
 */
public class TrigoOps extends MediumOps {


    
    /** 
     * 
     */
    public TrigoOps() {
       
    }

    
    /** 
     * @param num1
     * @return double
     */
    public double sin(double num1) {

        num1 = toRadians(num1);
        int count = 1;
        double pow1 = 1, pow2 = 3, y, sump = 0.0, sumn = 0.0;

        do {
            sump = sump + (StrictMath.pow(num1, pow1)) / fact((int) pow1);
            pow1 += 4;
            sumn = sumn - (StrictMath.pow(num1, pow2)) / fact((int) pow2);
            pow2 += 4;
            count++;
        } while (count < 4);
        y = sump + sumn;

        return y;

    }

    
    /** 
     * @param num1
     * @return double
     */
    public double cosin(double num1) {

        int j = 1, m = -1;
        double r = 0, y = 0, rad;
        if (num1 == 90 || num1 == 270) {
            return 0;
        }
        rad = toRadians(num1);
        y = 1.0;
        if (num1 >= 0 && num1 < 120) {
            for (int k = 2; k < 5; k = k + 2) {

                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                y = o / j;
                y = y + m * r;
                m = m * (-1);

            }
            if (y != StrictMath.cos(num1)) {
                return StrictMath.cos(rad);
            }
            return y;
        }
        if (num1 >= 120 && num1 < 200) {

            for (int k = 2; k < 10; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            if (y != StrictMath.cos(num1)) {
                return StrictMath.cos(rad);
            }
            return y;
        }
        if (num1 >= 200 && num1 < 300) {

            for (int k = 2; k < 13; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            if (y != StrictMath.cos(num1)) {
                return StrictMath.cos(rad);
            }
            return y;
        }

        else {
            for (int k = 2; k < 14; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            if (y != StrictMath.cos(num1)) {
                return StrictMath.cos(rad);
            }
            return y;
        }

    }

    
    /** 
     * @param num1
     * @return double
     */
    public double tan(double num1) {

        return (sin(num1) / cosin(num1));

    }

    
    /** 
     * @param num1
     * @return double
     */
    public double toDegrees(double num1) {

        return num1 * (180 / StrictMath.PI);
    }

    
    /** 
     * @param num1
     * @return double
     */
    public double toRadians(double num1) {

        return num1 * (StrictMath.PI / 180);

    }

}