package examples;

/* this is a program that squares numbers input by a user */
// this is a program for squares, by squares, for squaring

public class Squares {
  public static void main(String[] args) {
    // Use a scanner to read from standard in
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // scanner is a utility that detects keyboard input
    int num = 0;
    int result = 0;
    int count = 0;
    // int is where variables are created. num, result, and count are our variables
    for (count = 0; count < 5; count = count + 1) {
    // for is used here for iterating (i.e. repeating). here we are asking the program to repeat itself five times.
      System.out.print("Please enter a number less than 46341:");
      num = scanner.nextInt();
      // here we assign the variable num with the scanner value (key)
      if (num < 46341) {
      // if statements (aka conditionals) check various conditions to and help decide what to do next.
      // this if statement is saying that if the number is less than 46341 then continue on with business as usual
      // but note the else statement further down
        result = num * num;
        System.out.println("The result of squaring " + num + " is \t" + result + "\n");
      }
      else {
      // this else statement is saying that if the if statement is untrue then do this instead
        System.err.println("Input # " + num + " is too large." + "\n");
      }
    }
    scanner.close();
  }
}
