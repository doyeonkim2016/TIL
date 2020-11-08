import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String a1= a.toLowerCase();
        String b1= b.toLowerCase();
        
        int num_a = a.length();
        int num_b = b.length();
        
        int count=0;
        
        java.util.HashMap<Character,Integer> hmap_a = new java.util.HashMap<>();
        java.util.HashMap<Character,Integer> hmap_b = new java.util.HashMap<>();
        
        if (num_a != num_b){
            return false;
        }else{
            for(int i = 0 ; i < num_a ;i++){
                if(!hmap_a.containsKey(a1.charAt(i))){
                    hmap_a.put(a1.charAt(i),1);
                }else{
                    hmap_a.put(a1.charAt(i),(Integer)hmap_a.get(a1.charAt(i))+1);
                }
                
                if(!hmap_b.containsKey(b1.charAt(i))){
                    hmap_b.put(b1.charAt(i),1);
                }else{
                    hmap_b.put(b1.charAt(i),(Integer)hmap_b.get(b1.charAt(i))+1);
                }
                
            }
            if(hmap_a.equals(hmap_b)){
                return true;
            }
            
        }
        
        
        
    return false;
        
    }

  public static void main(String[] args) {
