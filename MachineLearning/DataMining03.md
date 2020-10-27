# Classification

## Decision Tree
Decision tree is a flowchart like tree structure where an internal node represents feature, the branch represents a decision rul and each leaf node represents the outcome.
Decision Tree is a white box type of ML algorith. It shares internal decision making logic which is not available in black box type of algorithm

### Basic Algorithm

1. Select the best attribute using Attribute Selection Measures (ASM) to split the records
2. Make that attribte a decision node and breaks the dataset into smaller subsets.
3. Starts tree building bt repeating this process recursively for each child until one of the condition will match:
    -All the tuples belong to the same attiritbue value.
    -There are no more remaining attritbues
    -There are no more instances

### Hunt's Algorithm

1. Let D(t) be the set of training record that reach a node (t)
2. General Procedure
  i) If D(t) contains records that belong the same class y(t), then t is a leaf node labeled as y(t)
  ii) If D(t) is an empty set, then t is a leaf node labeled by the default class y(d)
  iii) if D(t) contains records that belong to more than one class, use an attribute test to split data into smalled survey.
  
#### Advantages

1) Inexpensive to construct
2) Extremely fast at classifying unknown records
3) Easy to interpret for small sized trees
4) Accuracy is comparable to other classification techniques for many data sets.

```python
#load libraries
import pandas as pd
from sklearn.tree import DecisionTreeClassifier # Import Decision Tree Classifier
from sklearn.model_selection import train_test_split # Import train_test_split function
from sklearn import metrics #Import scikit-learn metrics module for accuracy calculation

#Loading data
col_names = ['pregnant', 'glucose', 'bp', 'skin', 'insulin', 'bmi', 'pedigree', 'age', 'label']
# load dataset
pima = pd.read_csv("pima-indians-diabetes.csv", header=None, names=col_names)


#Feature Selection
#Need to divide given columns into two types of variables {Dependent and Independent variables}. 
feature_cols = ['pregnant', 'insulin', 'bmi', 'age','glucose','bp','pedigree']
X = pima[feature_cols] # Features
y = pima.label # Target variable

#split dataset in features and target variable
#To understand model performance, dividing the dataset into a training set and a test set is a good strategy.
#To separate the dataset by using function train_test_split(). Youneed to pass 3 parameters : features,target and test_set size.
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=1)

# Create Decision Tree classifer object
clf = DecisionTreeClassifier()

# Train Decision Tree Classifer
clf = clf.fit(X_train,y_train)

#Predict the response for test dataset
y_pred = clf.predict(X_test)

print("Accuracy:",metrics.accuracy_score(y_test, y_pred))


```

Like this, you can get the classification rate with its accuracy. The model can be improved by tuning parameters in the Decision Tree Algorithm.

## Tuning
```python
# Create Decision Tree classifer object
clf = DecisionTreeClassifier(criterion="entropy", max_depth=3)

# Train Decision Tree Classifer
clf = clf.fit(X_train,y_train)

#Predict the response for test dataset
y_pred = clf.predict(X_test)

# Model Accuracy, how often is the classifier correct?
print("Accuracy:",metrics.accuracy_score(y_test, y_pred)

```



==============================================================================================================================

# Classification tree in r

```r
# Load the party package. It will automatically load other
# dependent packages.
library(party)

# Print some records from data set readingSkills.
print(head(readingSkills))

# Load the party package. It will automatically load other
# dependent packages.
library(party)

# Create the input data frame.
input.dat <- readingSkills[c(1:105),]

# Give the chart file a name.
png(file = "decision_tree.png")

# Create the tree.
  output.tree <- ctree(
  nativeSpeaker ~ age + shoeSize + score, 
  data = input.dat)

# Plot the tree.
plot(output.tree)

# Save the file.
dev.off()

```

