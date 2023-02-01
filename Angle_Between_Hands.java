import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();

        int a  = (time.charAt(0) -'0');
        int aa = (time.charAt(1) -'0');
        int b  = (time.charAt(3) -'0');
        int bb = (time.charAt(4) -'0');

        int hour = a*10 + aa ;
        int mini = b*10 + bb ;
        
        double angle;
        if (mini%2==0){
            angle = 30*hour - 11*mini/2;
        }
        else{
            angle = 30*hour - 5.5*mini;
        }

        if (angle < 0){
            angle+=360;
        }
        if (angle > 180){
            angle = 360-angle;
        }
        System.out.format("%.1f",angle);
        sc.close();
    }
}