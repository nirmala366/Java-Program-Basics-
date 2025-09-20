
import java.util.Scanner;
public class FactorialNumber {
}
}
Input: 15786
Output: 68751
public static void main(String[] args) {
int no, rev=0,r,a;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter any number : ");
no = scanner.nextInt();
a = no;
while(no>0)
{
r = no%10;
rev = rev*10+r;
no=no/10;
}
System.out.println("Reverse : " +rev);

Input: 15786
Output: 68751
