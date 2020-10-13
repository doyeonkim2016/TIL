import numpy as np

#Axis is none by default
x=np.arange(15)
s=np.sum(x)
print(s)

#Axis in 2d
y=x.reshape(3,5)
print(y)

s1=np.sum(y)
s2=np.sum(y,axis=0)
s3=np.sum(y,axis=1)
print(s1)
print(s2)
print(s3)

#Axis in 3d
z= np.arange(36).reshape(3,4,3)
print(z)

print(np.sum(z))

print(np.sum(z,axis=0))
print(np.sum(z,axis=1))
print(np.sum(z,axis=2))

#What is axis is tuple

s4=np.sum(z,axis=(0,1))
print(s4)
