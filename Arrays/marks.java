import java.util.*;
class marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int [] marks = new int[3];
            marks[0]=a;
            marks[1]=b;
            marks[2]=c;

            for (int i = 0; i <=3; i++) {
                System.out.println(marks[i]);
            }
    }
}