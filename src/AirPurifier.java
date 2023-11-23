import java.sql.SQLOutput;

public class AirPurifier {
    String name;
    Int year;
    boolean power;
    public AirPurifier(String Name,String year){
        this.name=Name;
        this.year=year;
    }

    public void On(){
        power=true;
    }

    public void Off(){
        power=false;
    }

    public void printAir(){
        System.out.println(name +  year +"Mode : "+power);
    }

}
