n,k = map(int, inpu().split())
result =0

#N이 K이상이라면 계속 K로 나누기

While n >= k:
   while n % k  !=0:
      n-=1 
      result += 1
      
    n/= k
    result +=1
    
    
while n > 1:
  n -= 1
  result += 1
  
print(result)
