import java.util.Random;
public class AirPurifier {
    boolean power;
    String year;
    String serialNum;    //like QWEQWDASD584 QWEASD5656
    int pMValue =0 ;     // 0-299 random
    int model;       //    0   ,1   ,2

    public AirPurifier(int model,String year,String serialNum) {
        this.year=year;
        this.serialNum=serialNum;
        this.model=model%3;

        allVolume++;
        modelsVolume[this.model]++;
    }
    public AirPurifier(String serialNum) {
        this.year="2005";
        this.model=2;
        this.serialNum=serialNum;
        allVolume++;
        modelsVolume[this.model]++;
    }

    void On(){
        power=true;
        Random random = new Random();
        pMValue = random.nextInt(300);
    }
    void Off(){
        power=false;
        pMValue=0;
    }

    static int[] modelsVolume ={0,0,0};

    static  int mostSelModel(){
        int key= modelsVolume[0];
        int maxModelSel = 0;
        for(int i = 0; i< modelsVolume.length; i++){
            if(modelsVolume[i]>key) {
                key = modelsVolume[i];
                maxModelSel = i;
            }
        }
        return maxModelSel;
    }
    static  int allVolume;

    static void manufacDisplay(){
        System.out.println("----------------------------------------");
        System.out.println("Current all volume : "+allVolume);
        int i=0;
        for (int model:modelsVolume ){
            System.out.println("Model "+ (i++) +" : "+model);
        }
        System.out.println("Most popular model : Model "+mostSelModel());
        System.out.println("----------------------------------------");
    }

    void displayPrint(){
        System.out.println("Model :"+model+"\tSerialNum :"+serialNum+"\tYear :"+year);
        System.out.println("Current PM: "+pMValue+"\tStatus :"+(power?"On":"Off\n"));
    }
}
