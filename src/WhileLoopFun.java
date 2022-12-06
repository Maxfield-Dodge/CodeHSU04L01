
 /*
    Template for while loop

    //initialize loop control variable
    while ( some boolean expression) {
        //loop stuff accessed if boolean expression true
        //more loop stuff
        ...
        //update loop control variable
 */


 import java.sql.SQLOutput;

 public class WhileLoopFun {

    public static void main(String[] args) {
        //count to 10

        int count = 1;
        while(count<=10){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        //what does this code loop do? Do this without running it
        count = 2;
        while(count <= 100){
            System.out.print(count + " ");
            count *= 2;
        }
        System.out.println();

        //write a loop that counts by 5 until you get to 100
        int startCount = 0;
        while(startCount <= 100){
            System.out.print(startCount + " ");
            startCount += 5;
        }
        System.out.println();

        //write a loop that counts down from 10 to 1 then prints "Blast off!"
        int countdown = 10;
        while(countdown>=1){
            System.out.print(countdown + " ");
            if(countdown == 1) {
                System.out.println("Blast off!");
            }
            countdown--;
        }

        //loop mistakes and while vs do while loop
        //make an infinite loop happen
        int newCount = 5;
        while(newCount >= 10){
            System.out.println("This statement has executed.");
        }

        //outside of CS A scope
        do {
            System.out.println("This wil print at least once.");
        }while(newCount >= 10);

    }
}
