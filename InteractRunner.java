import java.util.Scanner;

public class InteractRunner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String finishStatus = "no";
      Calculator calc = new Calculator();
      while(!finishStatus.equals("yes")) {     
        System.out.println("Enter first arg:");
        int first = Integer.parseInt(sc.next());
        System.out.println("Enter second arg:");
        int second = Integer.parseInt(sc.next());
        calc.add(first, second);
        System.out.printf("Sum is: %d\nShould we finish? Enter yes/no\n", calc.getResult());
        calc.cleanResult();
        finishStatus = sc.next();
      }
      
    } finally {
      sc.close();
    }
  }
}