#Q1.https://www.hackerrank.com/challenges/binary-search-tree-1/problem

SELECT CASE
    WHEN P IS NULL THEN CONCAT(N, ' Root')
    WHEN N IN (SELECT DISTINCT P FROM BST) THEN CONCAT(N, ' Inner')
    ELSE CONCAT(N, ' Leaf')
    END
FROM BST
ORDER BY N ASC

/*
#################################################Note#######################
Here I learnt that nothing equals null value in sql. Null is not a value, is it more like a concept.
To determine whether an expression is NULL, use IS NULL or IS NOT NULL instead of comparison operators (such as = or !=). 
Comparison operators return UNKNOWN when either or both arguments are NULL.
##########################################################################
*/
