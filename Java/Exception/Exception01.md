# 예외 처리

## 프로그램에서의 오류

1. 컴파일 오류 
 
- 프로그램 코드 작성 중 발생하는 문법적 오류
- 최근에는 개발환경(이클립스)에서 대부분의 컴파일 오류는 detect됨

2. 실행 오류 (Runtime Error)

- 실행중인 프로그램이 의도 하지 않은 동작(BUG)을 하거나 프로그램이 중지되는 오류
- 실행 오류는 비정상 종료가 되는 경우 시스템의 심각한 장애를 발생할 수 있음

## 예외 처리의 중요성

- 프로그램의 비정상 종료를 피하여 시스템이 원할이 실행되도록 함
- 실행 오류가 발생한 경우 오류의 과정을 재현하는 것은 현실적으로 힘들다.
- 오류가 발생한 경우 로그를 남겨서 추후 로그 분석을 통해 그 원인을 파악하여 버그를 수정하는 것이 중요

## 오류와 예외 클래스

1. 시스템 오류 (Error) - 가상 머신에서 발생, 프로그래머가 처리 할 수 없는 오류
  동적 메모리가 없는 경우, 스택 메모리 오버플로우등
  
2. 예외 (Exception): 프로그램에서 제어할 수 있는 오류
  읽어 들이려는 파일이 존재하지 안거나, 네트워크나 DB연결이 안되는 경우 등
  
``` java

//try-catch

public static void main(String[] args){
  int[] arr ={1,2,3,4,5};
  try{
      for(int i= 0 ; i <= 5 ; i++){
        System.out.println(arr[i]);
      }
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e.getMessage());
    System.out.println(e.toString());
  }
}


//try with resource

  try(FileInputStream fis = new FileInputStream("a.txt");){
    System.out.println("read");
  }catch (FIleNotFoundException e){
    e.printStackTrace();
  }catch (IOExcpetion e){
    e.printStackTrac():
  }
  System.out.println("end");
  
  
 ``` 
 

