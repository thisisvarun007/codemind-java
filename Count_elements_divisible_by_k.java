import java.util.*;
class solution{
    public static void main(String agrs[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0; i<n; i++){
            if (arr[i]%k==0){
                count++;
            }
        }
        System.out.print(count);
    }
}