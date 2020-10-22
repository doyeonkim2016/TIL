# Multivariable Linear Regression 

A linear regression simply shows the relationship between dependent variable and independent variable.In SLR, we build a model based on data.

In linear regression, we are trying to predict a continuous variable.

In a regression model, we are trying to minimise thes errors by finding the best line. (minimising mean squared error or sum of squares of error)


```python
#There are 2 main ways to perform linear regression in Python.
#Statsmodel and scikit-learn. 
#############################
#Stats model

import statsmodels,api as sm
from sklearn import datasets
import numpy as np
import pandas as pd

#Loads Boston dataset from datasets
data = datasets.load_boston()

#Define the data/predictors as the pre-set feature names
df= pd.DataFrame(data.data, columns=data.feature_names)

#Put the target in another df
target= pd.DataFrame(data.target,columns=["MEDV"]

X=df["RM"]
Y=target["MEDV"]

model =sm.OLS(y,X).fit()
predictions =model.predict(X)
model.summary()

#Lets add and intercept to our model
X= sm.add_constant(X)




```
