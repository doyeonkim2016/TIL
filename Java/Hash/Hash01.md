```java

public class MemberHashMap{
    private HashMap<Integer, Member> hashMap;
  
    public MemberHashMap(){
        hashMap = new HashMap<>();
    }
  
    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }
  
    public boolean removemember(int memberid){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
        }
      
        System.out.println("no elelmenr")'
        return false;
    }
  
    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator()
          
        while (ir.hasNext()){
          int key = ir.next();
          Member member =hashMap.get(key);
          System.out.println(member);
        }
    }
  
