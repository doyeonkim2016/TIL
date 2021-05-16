#N, M, K를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())

#N 개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

data.sort()
first = data[n-1]
second = data [n-2]

result = 0

while True:
  for i in range(k): #가장 큰 수를 K 번 더하기
    
    if m == 0:
      break;
    result += first
    m -=1
  
  if(m ==0):
    break;
  result += second #두번째로 큰 수를 한번 더하기
  m-=1;
print(result);




############################################################################
#가장 큰 수가 더해는 횟수 = int =(M/(k+1)) *K+M%(K+1)


