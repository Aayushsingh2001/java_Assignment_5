/* Write a program to print first 10 odd numbers in reverse order. */
public class Question_5 {
    public static void main(String[]args){
        System.out.println("First 10 odd numbers in reverse order is: ");
        for (int i=10; i>=1;i--)
        {
            System.out.print(2*i-1+ " ");
        }
    }
}
