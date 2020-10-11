#Tuple - No ordering, similar to list but cannot change the position once created
#Change the value of a and b
a=5
b=5
print (a,b)
a,b=b,a
print(a,b)

#Dictionary- Key and Values
#Keys are saved as hash values meaning no duplicates
#No ordering and index

a={'Korea':'Seoul','Canada','Ottawa'}
print(a['Korea'])

#adding values inside
a['Japan]='Tokyo'

#Check key values inside
#The speed of searching is O(1)
print('Korea' in a)

#Value access
#dict[key]

print(a)
print(list(a.keys())

#List of tuples with the value of key and value
print(list(a.items())


#Set
#No duplicates
a=set()
a={1,2,3}
b={2,3,4}
print(a.union(b))


