import numpy as np

#make into 2d
x=np.arange(15).reshape(3,5)
print(x)


#convert into 1d
d= np.ravel(x)
print(d)

#flatten 3d

x= np.arange(30).reshape(2,3,5)
e= np.ravel(x)
print(e)

#dimenstion check
print(x.ndim)

