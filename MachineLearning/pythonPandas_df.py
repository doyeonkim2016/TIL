#Add New Column

train_data['Age_double'] =train_data['Age']*2
train_data.head()


#Categorising numbers

import math
def age_categorise(age):
  if math.isnan(age):
    return -1
  return math.floor(age/10)*10
  
  
#Dataframe group by

  
 
