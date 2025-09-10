import java.io.*;

public class PengeVersion2 {
    public static void main(String[] args) throws IOException {
        //Input
        BufferedReader input =
                new BufferedReader(
                        new InputStreamReader( System.in ) );

        //Input til TotalAmount
        System.out.print("Indtast Beløb: ");
        double TotalAmount = Double.parseDouble(input.readLine());

        //Variables
        double[] Coins = {20,10,5,2,1,0.5};

        //For loop der køre igennem hver af mønterne
        for (int i = 0; i < Coins.length; i++) {
            double Temp = (int)(TotalAmount/Coins[i]);
            TotalAmount %= Coins[i];
            System.out.println(Coins[i] + ": " + (int)Temp);
        }
        //Rest beløb printes
        System.out.println("Rest beløb: " + TotalAmount);
    }
}
