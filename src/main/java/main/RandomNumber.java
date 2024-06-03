package main;

import java.util.Random;

public class RandomNumber {


    public static String generateRandomNumber(String value){
        Random random = new Random();
        int n = 0;
        String v;

        switch (value){
            case TableData.PRODUCT_LINE:
                n = random.nextInt(90);
                v = String.valueOf(n);
                return v;

            case TableData.PRODUCT_NAME:
                n = random.nextInt(9000) ;
                v = String.valueOf(n) +"00";
                return v;
        }
        return null;
    }
}
