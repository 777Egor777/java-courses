/** 
    Класс реализует калькулятор
*/
public class Calculator {	
  /** 
    Результат вычисления
  */
  private int result = 0;
  
  /** 
    Суммируем аргументы
    @param params Аргументы суммирования
  */
  public void add(int ... params) {
    for(int param : params) {
        this.result += param;
    }
  }
  
  /** 
    Возвращаем результат суммирования
    @return результат суммирования
  */
  public int getResult() {
    return this.result;
  }
  /** 
    Очистить результат вычисления
  */
  public void cleanResult() {
    this.result = 0;
  }
}