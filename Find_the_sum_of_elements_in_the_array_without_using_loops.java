import java.util.*;
class solution
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a+1];
        for (int i=1; i<a+1; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=1; i<a+1; i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}