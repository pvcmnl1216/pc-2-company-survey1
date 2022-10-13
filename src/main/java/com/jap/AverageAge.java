/*
 * Author Name: Philip Meshach
 * Date: 01-09-2022
 * Praise The Lord
 */
package com.jap;

public class AverageAge {
    public String averageAgeCalculator(String[] ageRawData) {

        try {
            double sum = 0.0;
            double avg = 0.0;
            //Write the logic
            for (int i = 0; i < ageRawData.length; i++) {
                sum = sum+Double.parseDouble(ageRawData[i]);
                avg = sum / ageRawData.length;
            }
            return String.valueOf(avg);

            //Handle specific exception
        } catch (java.lang.NumberFormatException exception) {
            System.err.println("java.lang.NumberFormatException");

            return exception.toString();
        }
    }
}

