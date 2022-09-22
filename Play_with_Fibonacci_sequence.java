import java.util.*;
class solution{
    public static void main(String agrs[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (n>0){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
            n--;
        }
    }
}