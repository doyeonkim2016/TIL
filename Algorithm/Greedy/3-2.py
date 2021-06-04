# 이 문제를 해결하려면 입력값 중에서 가장 큰수와 두번째로 큰 수만 저장하면 된다.
# 연속으로 더할 수 있는 횟수는 최대 K번이므로 가장 큰수를 K번 더하고 두번째로 큰수를 한번 더하는 연산을 반복하면 된다.

n,m,k = map (int. input().split());
data = list(map(int,input().split());
            
       
data =list(map(int,input().split());
data.sort();
first =data[n-1];
second = data[n-2];
result = 0;
           
while True:
      for i i n range(k):
           if m ==0:
               break;
           result += first
           m-=1
      if m == 0 :
           break;
         result += second
         m-=1
