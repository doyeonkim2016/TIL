//콜 센터 : 고객 응대 담당자,관리자,감독관 이렇게 세 부류의 직원들로 구성됨. 서로 처리 못 할 경우 다음 관리자,감독관에게 넘긴다. 응대 가능한 첫번째 직원에게 전화를 연결시키는 dispatchCall() method
//구현하라.

public class Call Handler{
  private fina int LEVELS = 3;
  
  private final int NUM_RESPONDENTS =10;
  private final int NUM_MANAGERS =4;
  private final int NUM_DIRECTOS =2;
  
 List<List<Employee>> employeeLeevels;
 List<List<Call>> callQueues;
  
 public CallHandler(){//
 }
  
  public Employee getHandlerForCall(
}
