import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b ");
        int b = sc.nextInt();

        System.out.println("enter method");
        String c= sc.next();

        int d = a+b;
        int e = a-b;
        int f = a*b;
        int g = a/b;

        if(c.equals("addition")){
              System.out.println("addition is "+d);
        }
        else if (c.equals("substraction")) {
            System.out.println("substraction is "+e);
            
        }
        else if (c.equals("multiplication")) {
            System.out.println("multiplication is "+f);
 
        }
        else{
            System.out.println("division is "+g);
        }


        
    }
}
