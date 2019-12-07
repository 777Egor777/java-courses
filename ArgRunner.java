public class ArgRunner {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    if (args.length < 2 || args.length > 3) 
    {
        System.out.println("Incorrect arguments");
    } else {
        String operation = args[0];
        String arguments = "";
        for(int i = 1; i < args.length; ++i) {
            arguments += args[i] + " ";
        }
        arguments = arguments.trim();
        
        if (correctOperation(operation) && correctArguments(arguments)) 
        {
            int first = Integer.parseInt(args[1]);
            int second = 0;
            if (args.length == 3) {
                second = Integer.parseInt(args[2]);
            }
            
            if (operation.equals("+")) {
                if (args.length == 2) {
                    calc.add(first);
                } else {
                    calc.add(first, second);
                }
            }
            
            if (operation.equals("-")) {
                if (args.length == 2) {
                    calc.sub(first);
                } else {
                    calc.sub(first, second);
                }
            }
            
            if (operation.equals("*")) {
                if (args.length == 2) {
                    calc.multiply(first);
                } else  {
                    calc.multiply(first, second);
                }
            }
            
            if (operation.equals("/")) {
                if (args.length == 2) {
                    calc.div(first);
                } else {
                    calc.div(first, second);
                }
            }
            
            if (operation.equals("^")) {
                if (args.length == 2) {
                    calc.pow(first);
                } else {
                    calc.pow(first, second);
                }
            }
            
            System.out.println(String.format("Result of the operation: %d", calc.getResult()));
        } else {
            System.out.println("Incorrrect arguments");
        }
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