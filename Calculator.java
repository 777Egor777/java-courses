/** 
    Класс реализует калькулятор
*/
public class Calculator {	
  private int result = 0;
  
  public void add(int a, int b) {
    this.result = a + b;
  }
  
  public void add(int a) {
    this.add(this.result, a);
  }
  
  public void sub(int a, int b) {
    this.result = a - b;
  }
  
  public void sub(int  a) {
    this.sub(this.result, a);
  }
  
  public void multiply(int a, int b) {
    this.result = a * b;
  }
  
  public void multiply(int a) {
    this.multiply(this.result, a);
  }
  
  public void div(int a, int b) {
    this.result = a / b;
  }
  
  public void div(int a) {
    this.div(this.result, a);
  }
  
  public void pow(int base, int exponent) {
    this.result = 1;
    for(int i = 0; i < exponent; ++i) {
        this.result *= base;
    }
  }
  
  public void pow(int exponent) {
    this.pow(this.result, exponent);
  }
  
  public void cleanResult() {
    this.result = 0;
  }
  
  public int getResult() {
    return result;
  }
}