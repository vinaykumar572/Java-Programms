import java.util.*;
public class Looping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=2,c=6;
        if(a%2==0){
        if(b<a && a<5){
            System.out.println("Not Weird");
        }
        else if(c<a && a<21){
            System.out.println("Weird");
            }
        else{
            System.out.println("Not Weird");
        }
        }
        else{
            System.out.println("Weird");
        }
        
    }
}
