import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
System.out.println("Original String is: "+ input);
separateCharacters(input);
}
public static void separateCharacters(String input)
{
StringBuilder lowerCase = new StringBuilder();
StringBuilder upperCase = new StringBuilder();
for(char ch : input.toCharArray())
{
if(Character.isLowerCase(ch))
{ }
else
{ }
lowerCase.append(ch);
upperCase.append(ch);
}
System.out.println("Output in lowercase: "+lowerCase);
System.out.println("Output in uppercase "+upperCase);
}

// Output 
Enter a string: aBACbcEDed
Output in lowercase: abced
Output in uppercase: ABCED
