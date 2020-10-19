# Regression Analysis -2020.10.19

Regression Analysis - 입력 변수인 X의 정보를 활용하여 출력 변수인 Y를 예측하는 방법

<b>Simple Linear Regression with scikit-learn</b><br>
1.Import the packages and class<br>
2.Provide data to work with and eventually to do proper transformation<br>
3.Create a regression model and firt existing data<br>
4.Check the results of model fitting to know whether the model is satisfactory.<br>
5.Apply the model for prediction<br>


```python
import numpy as np
from sklearn.linear_model import LinearRegression

x=np.array([5,15,25,35,45,55]).reshape((-1,1))
y=np.array([5,20,14,32,22,,3)]

model =LinearRegression()

#Wtih .fit(), you caluculate the optimal values of the weights b0 and b1 using the existing input and output

model.fit(x,y)

r_s1=model.score(x,y)
print('coefficient of determination:' ,r_sq)

y_pred=model.predict(x)

```

<h3>회귀계수추정</h3>
실제값과 우리가 추정한 값이 적을수록 좋다.

선형회귀는 잔차의 제곱함 (SSE : Error sum of squares)를 최소하는 방법으로 회귀계수를 추정.

Lab
```python
import statsModel.api as sm

boston=pd.read_csv(...../.csv)
boston.head()

#변수 설정 target/crim/rm/lstat

#sm.OLS 적합시키기
model1=sm.OLS(target,crim)
fitted_model1=model1.fit()

fitted_model1.summary()

fitted.model1.params

np.dot(crim1,fitted_model1.params)

pred1=fitted_model1.predict(crim1)


#DATA VISUALISATION]
import matplotlib.pyplot as plt

plt.scatter(crim,target,label="data")
plt.legend()
plt.show()

#residual 
fitted_model1.resid.plot()

#Almost 0 for the residual
#means the vertical distance between a data point and the regression line is 0.
np.sum(fitted_model1.resid) 


```
