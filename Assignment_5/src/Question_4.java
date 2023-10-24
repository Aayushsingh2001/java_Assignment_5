/* Write a program to print First 10 Odd natural numbers. */
public class Question_4 {
    public static void main(String[] args) {
        int x, i;
        System.out.println("First 10 Odd numbers is: ");
        for (i = 1; i <= 10; i++) {
            x = (2*i-1);
            System.out.print(+x+" ");
        }
    }
}
