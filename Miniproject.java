import java.util.Scanner;;
public class Miniproject{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int userInput = 0;
        do{
            System.out.println("Guess myNumber");
             userInput = obj.nextInt();

            if(userInput==myNumber){
                System.out.println("WOW,correct guess ");
                break;
            }else if(userInput > myNumber){
                System.out.println("Number is too large");
            }
            else{
                System.out.println("Number is too small");
            }

        }while(userInput>=0);
        System.out.print("My number was");
        System.out.println(myNumber);

       
    }
}