import java.io.*;
import java.util.*;

class Result {

    public static String timeConversion(String s) {

        String period = s.substring(8); 
        int hour = Integer.parseInt(s.substring(0,2));
        String rest = s.substring(2,8);

        if(period.equals("AM")){
            if(hour == 12){
                hour = 0;
            }
        }
        else{ // PM
            if(hour != 12){
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(Result.timeConversion(s));
    }
}
