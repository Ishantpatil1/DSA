import java.util.Scanner;

class printname{
    public static void printname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printname(name);
    }
}