public class 90degrees{

    public static void main(String []args){
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
        System.out.println(a.length);
        System.out.println(rotate(a));
        
        
    }
    
    static boolean rotate(int[][] matrix){
        if (matrix.length==0 || matrix.length != matrix[0].length){
            return false;
        }
        
        int n= matrix.length;
        for(int layer =0; layer <n/2 ; layer++){
            int first =layer;
            int last =n-1-layer;
            for(int i =first; i <last; i++){
                int offset =i-first;
                int top = matrix[first][i];
                matrix[first][i] =matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset] =matrix[i][last];
                matrix[i][last]=top;
            }
            
            
        }
        System.out.println(matrix.length);
        return true;
    }
     
     
}
