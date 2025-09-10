/*
********** Java opgave møntdeling - gruppe 7 **************
*
********** Beskrivelse *************************
* Programmet skal lade brugeren indtaste et beløb som en værdi,
* der repræsenterer et totalbeløb i kroner og øre,
* og derefter udskrive en oversigt, der viser beløbet med den største enhed først (kroner),
* og går derefter videre til mindre enheder (øre)
* for at opnå det mindste samlede antal mønter.
 */
import java.io.*;

public class Penge {
    public static void main(String[] args) throws IOException{
        BufferedReader input =
                new BufferedReader(
                        new InputStreamReader( System.in ) );
        //Declaring variables
        double TotalAmount;
        int coin1 = 20;
        int coin2 = 10;
        int coin3 = 5;
        int coin4 = 2;
        int coin5 = 1;
        double coin6 = .5;
        double Rest;

        //Input til at indtaste beløb man ønsker fordelt
        System.out.print("Indtast Beløb: ");
        TotalAmount = Double.parseDouble(input.readLine());

        //Møntælling
        int Tyver = (int)(TotalAmount/coin1);
        Rest = TotalAmount % coin1;

        int Tier = (int)(Rest/coin2);
        Rest = Rest % coin2;

        int Femmer = (int)(Rest/coin3);
        Rest = Rest % coin3;

        int Toer = (int)(Rest/coin4);
        Rest = Rest % coin4;

        int Etter = (int)(Rest/coin5);
        Rest = Rest % coin5;

        int Halvkrone = (int)(Rest/coin6);
        Rest = Rest % coin6;

        //Outputs

        System.out.println("\n20: " + Tyver + " Stk");
        System.out.println("10: " + Tier + " Stk");
        System.out.println("5: " + Femmer + " Stk");
        System.out.println("2: " + Toer + " Stk");
        System.out.println("1: " + Etter + " Stk");
        System.out.println("0.5: " + Halvkrone + " Stk");
        System.out.println("Rest beløb: " + Rest);
    }
}
