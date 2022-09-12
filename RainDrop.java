import java.util.*;
class solution
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if (s%3==0){
            System.out.print("Pling");
        }
        if (s%5==0){
            System.out.print("Plang");
        }
        if (s%7==0){
            System.out.print("Plong");
        }
        if (s%3!=0 && s%5!=0 && s%7!=0){
            System.out.print(s);
        }
    }
}