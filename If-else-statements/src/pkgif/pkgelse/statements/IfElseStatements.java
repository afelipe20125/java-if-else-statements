
package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;


/**
 *
 * Name:
 * Period:
 * Project Name:
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        
        
    }
    
    
    public static void question1(){
        System.out.println("print a number");
        int x = kb.nextInt();
        if(x >= 70)
        {
               System.out.println("Passing");
        }
        else
        {
            System.out.println("not passing");
        }
        
    }
    
    public static void question2(){
        System.out.println("print a number");
        int x = kb.nextInt();
        if(x <= 50)
        {
            System.out.println("Go");
            
        }
        else
        {
            System.out.println("stop");
        }
    }
    
    public static void question3(){
        System.out.println("print a number");
        int x = kb.nextInt();
        if(x % 2 == 0)
        {
            System.out.println("even number");
            
        }
        if(x % 2 != 0)
        {
            System.out.println("odd number");
        }
    }
    
    public static void question4(){
        System.out.println("print a number");
        int x = kb.nextInt();
        if(x % 5 == 0)
        {
            System.out.println("multiple of 5");
        }
        else
        {
            System.out.println("not a multiple of 5");
        }
    }
    
    public static void question5(){
        System.out.println("print a number ");
        int x = kb.nextInt();
        if(x < 10)
        {
            System.out.println("ONE digit");
        }       
        else if(x > 99)
        {
            System.out.println("THREE digits");
        }
        else
        {
            System.out.println("TWO digits");
        }
    }
    
    public static void question6(){
        System.out.println("print a number");
        int x = kb.nextInt();
        if(x == 71)
        {
            System.out.println("That number is retired from the Seattle Seahawks");
        }
        else if(x == 12)
        {
            System.out.println("That number is retired from the Seattle Seahawks");
        }
        else if(x == 80)
        {
            System.out.println("That number is retired from the Seattle Seahawks");
        }
    }
   
    
    public static void question7(){
        System.out.println("pick a state");
        String x = kb.nextLine();
        if(x.equals("Washington"))
        {
            System.out.println("This state is in the PNW");
        }
        else if(x.equals("Oregon"))
        {
            System.out.println("This state is in the PNW");
        }
        else if(x.equals("Idaho"))
        {
            System.out.println("This state is in the PNW");
        }
        else
                {
                    System.out.println("YOu should move to the PNW");
                }
    }
    
    
    public static void question8(){
        
    }
    
    public static void question9(){
        
    }
    
    public static void question10(){
        
    }
    
}
