
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class FekrBekr {
    public static int [] randarray = new int[4];
    /*public static boolean[]guessarray = new boolean[4];*/
    public static int [] userarray = new int[4];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random(); 
    public static void play(){
       
        boolean keepplay = true;
        boolean istrue = false;
        String answer;
    while(keepplay){
        /* for(int b=0;b<4;b++){
            guessarray[b] = false;
        }*/
        System.out.println("lets play !!!");
        System.out.println("im thinking of some number between 1 to 10 \nyou should to guess thats number and thats order");
        for(int i =0;i<4;i++){
            randarray[i]=rand.nextInt(10)+1;
            for(int j=0; j<i;j++){
                if(randarray[i]==randarray[j]){
                    randarray[i] = rand.nextInt(10)+1;
                       i--;
                }
            }
        }
        System.out.println("you have Ten chance to guess it Lets go !");
        System.out.println("please Enter your numbers ");
        for(int i=0;i<10;i++){
            for(int j= 0;j<4;j++){
                userarray[j] = sc.nextInt();
            }
            for(int k = 0;k<4;k++){
                if (userarray[k]==randarray[k]){
                 /*  guessarray[k]=true;*/
                 System.out.println("You entered "+userarray[k] +"that was true ");
                   
                }
            }
            if(Arrays.equals(userarray, randarray))
                istrue=true;
            if(istrue){
            System.out.println("Wow You win ");
                break;
            }
            else
                System.out.println("So bad You wrong try again");
        }
        System.out.println("Do You want to play again (Y or N)");
        answer = sc.next();
        if(answer.equalsIgnoreCase("Y"))
            keepplay=true;
        else if(answer.equalsIgnoreCase("N"))
            keepplay =false;
    }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        play();
    }
    
}
