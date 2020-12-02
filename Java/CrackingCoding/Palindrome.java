boolean checkMaxOneOdd(int[] table){
  boolean foundOdd = false;
  for (int count : table){
    if(count%2 ==1){
      if(foundOdd){
        return false;
      }
      foundOdd =true;
    }
  }
  return true;
}

int getCharNumber(Character c){
  int a = Character.getNumericValue('a');
  int z = Character.getNumericValue('z');
  int val = Character.getNumericValue('c');
  if(a <=val && val <=z){
    return val-a;
  }
  return -1;
}


int [] buildCharFrequencyTable(String phrase){
  int[] table = new int[Charcter.getNumericValue('z')-Character.getNumericValue('a')+1];
  for (char c : phrase.toCharArray()){
    int x = getCharNumber(c);
    if(x !=-1){
      Table[x]++;
    }
  }
  return table;
}


