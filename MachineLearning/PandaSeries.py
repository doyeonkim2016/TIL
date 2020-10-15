#Series is like Array
a=np.array([2,2,2,2,np.Nan])
a.mean()

b= pd.Series(a)
b.mean()

s.mean()
s.value_counts()

#Can get multiple values using index.
s[[5,7,8,10]].value_counts()

s.head(n=7)
s.tail()

##############################################
#Series data calculation
s1=pd.Series([1,2,3,4],['a','b','c','d'])
s2=pd.Series([6,3,2,1],['d','c','b','a'])

#a adds up to a , b adds up to b it simply depends on the index

s1+s2

#index pair doesnt match then it will create NaN value.


##################################################
#Boolean Selectio using Series Data.
s=pd.Series(np.arange(10),np.arange(10)+1)

s>5

#Filtering
s[s>5]

s[s%2==0]

####################################################
#Series Data Transformation and Slicing

s=pd.Series(np.arange(100,105),['a','b','c','d','e'])

s['a']=200
s['k']=300

#There is no change in the values inside s unless you assign it.

s.drop('k')
s.drop('k',inplace=True)




