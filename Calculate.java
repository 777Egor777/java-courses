public class Calculate {
  private final int first;
  private final int second;
  
  public static void main(String[] args) {
    Calculate calc = new Calculate(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
    System.out.print(String.format("Sum: %d\nMultiply: %d\nPow: %d\nDivision: %f\n", calc.sum(), calc.multiply(), calc.pow(), calc.division()));
  }
  
  public Calculate(int first, int second) {
    this.first = first;
    this.second = second;
  }
  
  public int sum() {
    return first + second;
  }
  
  public int multiply() {
    return first * second;
  }
  
  public int pow() {
    int result = 1;
    for(int i = 0; i < second; ++i) {
      result *= first;
    }
    return result;
  }
  
  public double division() {
    return (double)first / second;
  }
}