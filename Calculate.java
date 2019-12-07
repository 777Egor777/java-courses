public class Calculate {
  private final double first;
  private final double second;
  
  public static void main(String[] args) {
    Calculate calc = new Calculate(args[0], args[1]);
    System.out.print(String.format("Sum: %f\nMultiply: %f\nPow: %f\nDivision: %f\n", calc.sum(), calc.multiply(), calc.pow(), calc.division()));
  }
  
  public Calculate(String first, String second) {
    this.first = Double.parseDouble(first);
    this.second = Double.parseDouble(second);
  }
  
  public double sum() {
    return first + second;
  }
  
  public double multiply() {
    return first * second;
  }
  
  public double pow() {
    int result = 1;
    for(int i = 0; i < (int)second; ++i) {
      result *= first;
    }
    return result;
  }
  
  public double division() {
    return first / second;
  }
}