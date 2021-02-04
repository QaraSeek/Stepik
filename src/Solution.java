import java.util.Scanner;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while(console.hasNextInt()){
            int intInput = console.nextInt();
            sum += intInput;
        }
        System.out.println(sum);

    }
}