#Creating,Readiing and Writing in Pandas

import pandas as pd

#There are 2 core objects in pandas: Dataframe and Series
#DataFrame is a table. It contains an array of individual entries, each of which has a certain value.

pd.DataFrame({'Yes':[50,21],'No':[131,2]})

#Series
#A Series is a sequence of data values. If a DataFrame is a table, a Series is a list. 

pd.Series([1,2,3,4,5])

###############
#Reading data files

#wine_revies =pd.read_csv("...../.../.../.csv")
#wine_revies.shape
#(122971,14)
#Our new DataFrame has 130,000 records split across 14 different columns. 2mil entries.
#win_revies.head()

