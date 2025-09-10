/*
 ********** Java pyramide opgave - gruppe 7 *****
 *
 ********** Beskrivelse *************************
 * An application that calculates an estimate of how much,
 * by weight, of the pyramid was built each year, each hour,
 * and each minute as it was being built
 */

import java.io.*;

public class Pyramide {
    public static void main(String[] args) throws IOException {

        //Inputter til at håndtere inputs
        BufferedReader input =
                new BufferedReader(
                        new InputStreamReader( System.in ) );

        //Indtastning af antal sten
        System.out.print("Indtast antal sten i tons: ");
        double StonesUsed = Double.parseDouble(input.readLine());

        //Indtastning af gennemsnitsvægten
        System.out.print("Gennemsnits vægt i tons: ");
        double AverageWeightTon = Double.parseDouble(input.readLine());

        //Indtastning af antal 20 det tog at bygge
        System.out.print("Hvor mange år tog det at bygge: ");
        double YearsToBuild = Double.parseDouble(input.readLine());

        //Beregner af de forskellige værdier som ønskes og gemmes som variabler
        double prYear = StonesUsed * AverageWeightTon / YearsToBuild;
        double prHour = prYear / 365 / 24;
        double prMinute = prHour / 60;

        //Print af resultat
        System.out.println("stones Used(Tons): ");
        System.out.println("Pr year: " + prYear);
        System.out.println("Pr Hour: " + prHour);
        System.out.println("Pr Minute: " + prMinute);
    }
}
