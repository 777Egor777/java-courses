import java.util.Scanner;

public class InteractRunner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String exit = "no";
    Calculator calc = new Calculator();
    try {
        while(!exit.equals("yes")) {
            String operation;
            do {
                System.out.println("Please, enter correct operation(+, -, *, /, ^):");
                operation = sc.nextLine();
            } while(!correctOperation(operation));
            String arguments;
            do {
                System.out.println("Enter 1 or 2 arguments separated with space");
                arguments = sc.nextLine();
            } while(!correctArguments(arguments));
            String[] argss = arguments.split(" ");
            
            int first = Integer.parseInt(argss[0]);
            int second = 0;
            if (argss.length == 2) {
                second = Integer.parseInt(argss[1]);
            }
            
            if (operation.equals("+")) {
                if (argss.length == 1) {
                    calc.add(first);
                } else {
                    calc.add(first, second);
                }
            }
            
            if (operation.equals("-")) {
                if (argss.length == 1) {
                    calc.sub(first);
                } else {
                    calc.sub(first, second);
                }
            }
            
            if (operation.equals("*")) {
                if (argss.length == 1) {
                    calc.multiply(first);
                } else {
                    calc.multiply(first, second);
                }
            }
            
            if (operation.equals("/")) {
                if (argss.length == 1) {
                    calc.div(first);
                } else {
                    calc.div(first, second);
                }
            }
            
            if (operation.equals("^")) {
                if (argss.length == 1) {
                    calc.pow(first);
                } else {
                    calc.pow(first, second);
                }
            }
            
            System.out.println(String.format("Result of the operation: %d", calc.getResult()));
            
            System.out.println("Should we finish? Enter yes/no");
            exit = sc.nextLine();
        }
    } finally {
        sc.close();
    }
  }
  
  private static boolean correctOperation(String operation) {
    return operation.equals("+") || operation.equals("-") || operation.equals("*") ||
            operation.equals("/") || operation.equals("^");
  }
  
  private static boolean correctArguments(String arguments) {
    String [] args = arguments.split(" ");
    if (args.length == 0 || args.length > 2) {
        return false;
    }
    
    for(String arg : args) {
        try {
            Integer.parseInt(arg);
        } catch(Exception ex) {
            return false;
        }
    }
    
    return true;
  }
}