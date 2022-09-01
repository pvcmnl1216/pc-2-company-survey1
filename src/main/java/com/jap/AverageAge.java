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
            //Write the logic
            for (String ageRawDatum : ageRawData)
                sum += Double.parseDouble(ageRawDatum);

            return String.valueOf(sum / ageRawData.length);

            //Handle specific exception
        } catch (java.lang.NumberFormatException exception) {
            System.err.println("java.lang.NumberFormatException");

            return exception.toString();
        }
    }


}

