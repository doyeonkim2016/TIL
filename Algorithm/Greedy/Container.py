#IDEA
#1. Widiest container is a good candidate, because of its width. Its water level is the height of the smaller one of the first and last line
#2. All other containers are less wide and thus would need a higher water level in order to hold more water.
#3. The smaller one of the first and last line doesnt support a higher water level and can thus be safely removed from further consideration.


class Solution :
  def maxAread(self, height):
    i, j = 0 ,len(height) -1
    water =0
    while i <j:
      water = max(water,(j-i) *min(height[i],height[j]))
      if(height [i] <height[j]):
        i+=1 ;
      else:
        j -= 1;
      return water;
