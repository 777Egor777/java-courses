/** 
    ����� ��������� �����������
*/
public class Calculator {	
  /** 
    ��������� ����������
  */
  private int result = 0;
  
  /** 
    ��������� ���������
    @param params ��������� ������������
  */
  public void add(int ... params) {
    for(int param : params) {
        this.result += param;
    }
  }
  
  /** 
    ���������� ��������� ������������
    @return ��������� ������������
  */
  public int getResult() {
    return this.result;
  }
  /** 
    �������� ��������� ����������
  */
  public void cleanResult() {
    this.result = 0;
  }
}