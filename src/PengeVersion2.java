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
        double Rest = TotalAmount;

        //For loop der køre igennem hver af mønterne
        for (int i = 0; i < Coins.length; i++) {
            double Temp = (int)(Rest/Coins[i]);
            Rest = Rest % Coins[i];
            System.out.println(Coins[i] + ": " + (int)Temp);
        }
        System.out.println("Rest beløb: " + Rest);
    }
}
