import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    mathFunction();
  }

  private static void mathFunction() {
    String valid_operators = "";

    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter 3 Integers");
    // Numerical input
    int Number1 = myObj.nextInt();
    int Number2 = myObj.nextInt();
    int Number3 = myObj.nextInt();

    // check addition
    if (Number1 + Number2 == Number3) {
      valid_operators += "+";
    }
    // check subtraction
    if (Number1 - Number2 == Number3) {
        valid_operators += "-";
    }
    // check multiplication
    if (Number1 * Number2 == Number3) {
      valid_operators += "*";
    }
    // check for division and potential divide by zero error
    if (Number2 != 0 && Number1 / Number2 == Number3) {
      valid_operators += "/";
    }

    int operators_length = valid_operators.length();

    // check for existence of valid operators, return valid operators if any.
    if (operators_length == 0){
        System.out.println("None");
    } else {
      System.out.println(valid_operators);
    }
  }
}