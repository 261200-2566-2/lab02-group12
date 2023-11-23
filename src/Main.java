import java.util.Random;
public class Main {
    public static void main(String[] args) {
        AirPurifier A1=new AirPurifier("DQWEQD45");  //construc set year 2005 model 2
        AirPurifier.manufacDisplay();

        //make Air by loop = amount
        int  amount = 7;
        AirPurifier[] B = new AirPurifier[amount];
        for (int i =0;i< B.length;i++){
            Random random = new Random();
            B[i] = new AirPurifier(random.nextInt(3),"2004","DQWEQD45"+i);

            System.out.println("DQWEQD45"+i+" Have been created!!");
            B[i].displayPrint();
        }

        //show all the products and detail each model and most popular
        AirPurifier.manufacDisplay();
        //show Air_A1 On and Off
        A1.On();  //show PM and detail Airpurify
        A1.displayPrint();
        A1.Off();
        A1.displayPrint();
    }
}