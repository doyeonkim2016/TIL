# Classification - Alternatives

## Underfitting 
When model is too simple, both training and test errors are large

## Overfitting
When model is over complex, small training error but large test error.

## Bias Variance Trade off
Bias - an error from errorneous assumptions in the learning algorithms

Variance- an error from sensitivity to small fluctuations in training set.

## How to address overfitting

### 1.Pre-pruning
Stop the algorithm before it becomes a fully grown tree.
Stop if all instances belong to the same class.
Stop if all attribute values are same.
Stop if expanding current node does not improve impurity measures.

### 2.Post-pruning
Grow decision tree entirely
Trim the nodes of decision tree in bottom up fashion
Class label of leaf node is determined from majoriry class of instances in subtree

## Instance Based Classifiers

Store the training ecords
Use training records directly to predict label of unknown

eg) Rote learner, KNN


=> Handling pruning with python and R will be done in 05

https://scikit-learn.org/stable/auto_examples/tree/plot_cost_complexity_pruning.html

https://medium.com/swlh/post-pruning-decision-trees-using-python-b5d4bcda8e23

