package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale locale = new Locale("da", "DK");
        // from primitive to formatted string
        // underscores for readability, ignored by compiler
        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));

        // rounds off the value before displaying it
        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }

}
