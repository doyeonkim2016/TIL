 public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
       while (d != 0) {
            arr.add(arr.remove(0));
            --d;
        }
        return arr;
    
    }
