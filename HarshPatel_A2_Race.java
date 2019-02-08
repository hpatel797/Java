package harshpatel_a2_race.java;
import java.util.Random;

public class HarshPatel_A2_Race {
    Random rand = new Random();
    private int posTor = 1;
    private int posHar = 1;
    private int rollTor;
    private int rollHar;
    
    public int get_posTor() {
        rollTor = rand.nextInt(10) + 1;
        if (rollTor >= 1 && rollTor <= 5)
                posTor+=3;
        if (rollTor >= 6 && rollTor <=7)
                posTor-=6;
        if (rollTor >=8 && rollTor <= 10)
                posTor+=1;
        if (posTor < 1) //if negative position, assign 1
                posTor = 1; 
        
      return posTor;
}
    public int get_posHar() {
        
        rollHar = rand.nextInt(10) + 1;
        if (rollHar >= 1 && rollHar <=2)
                posHar = posHar;
        if (rollHar >=3 && rollHar <=4)
               posHar+=9;
        if (rollHar == 5)
                posHar-=12;
        if (rollHar >= 6 && rollHar <= 8)
                posHar+=1;
        if (rollHar >= 9 && rollHar <= 10)
                posHar-=2;
        if (posHar < 1) // if negative position, assign 1
                posHar = 1; 
        
        return posHar;       
    }
}
