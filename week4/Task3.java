import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alice=0,bob=0;
        int [] a=new int[3];
        int [] b=new int[3];
        for (int i = 0; i < 3; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i]=sc.nextInt();
        
        if(a[i]<b[i]){
            alice++;
        }
        else if(a[i]!=b[i]){
            bob++;
        }}
        System.out.println(alice + " " + bob);
    }
}