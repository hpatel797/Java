
package harshpatel_a2_race.java;

import java.util.Scanner;

public class Demo2 {
    
    public static void main(String[] args) {
        boolean replay = true;
        int tracklength = 75;
        while (replay){
            HarshPatel_A2_Race positions = new HarshPatel_A2_Race();
            System.out.print("BANG !!!! \nAND THEY'RE OFF!!!!!\n");
            int TorPos = 1;  //both start at square 1
            int HarPos = 1;
            System.out.print("\nTort Progress: T"); //the starting position
            System.out.print("\nHare Progress: H"); // for both is the same

            while (TorPos < tracklength && HarPos < tracklength){
                TorPos = positions.get_posTor();
                HarPos = positions.get_posHar();
            
                System.out.print("\n\nTort Progress: ");
                for (int i = 1; i <= tracklength; ++i){
                    if ( i == TorPos && HarPos != TorPos){
                        System.out.print("T");
                    }
                    else if (i == TorPos && HarPos == TorPos){ 
                        System.out.print("OUCH"); // print ouch when same position
                    }
                    else 
                        System.out.print(" ");   
                }
                System.out.print("\nHare Progress: ");
                for (int i = 1; i <= tracklength; ++i){
                    if ( i == HarPos && HarPos != TorPos){
                        System.out.print("H"); 
                    }
                    else if (i == HarPos && HarPos == TorPos){
                        System.out.print("OUCH"); //same position --> print ouch
                    }
                    else 
                        System.out.print(" ");   
                    }      
            } // end of while loop -- meaning someone has won
                    
            if (TorPos >= tracklength && HarPos >= tracklength)  //both passed tracklengt
                System.out.print("\n\nIts a tie!\n\n");   
            else if (TorPos >= tracklength)
                System.out.print("\n\nTortoise Wins!!! YAY!!!\n\n");  
            else if (HarPos >= tracklength)
                System.out.print("\n\nHare Wins. Yuch.\n\n");

            System.out.print("\nPlay again? (Enter Y or N): "); // ability to replay
            Scanner input = new Scanner(System.in);
            String ans = input.next();
            if ("y".equals(ans) || "Y".equals(ans)){
                System.out.print("\nEnter new track length: "); //set new squares
                tracklength = input.nextInt();      
            }
            else
                replay = false;
            
        }
    }
}