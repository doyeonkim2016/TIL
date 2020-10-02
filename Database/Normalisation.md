Database Fundamentals
SQL Normalisation 
->Processes of reducing the redundancy of data & It improves the data integrity.

Data Anomalies -Difficult to handle and update the db.

i)Insertion Anomaly
 => It occurs when we cannot insert data to the table without the presence of another attribute

ii)Update Anomaly
 =>It is data inconsistency that results from data redundancy and a partial update of data
 
iii)Deletion Anomaly 
 => It occurs when certain attributes are lost because of the deletion of other attributes

Normalisation in SQL will enhance the distribution of data.

1st Normal Form(1NF)
=> In this Normal Form, we tackle the problem of atomicity. The Atomicity means values in the table should not be further divided.
The table cell must hold single value.

2nd Normal Form(2NF)
=> The first condition in the 2nd Nf is that the table has to be in the 1st NF. The table also should not contain partial dependency.
Here,partial dependency means the proper subset of candidate key determines a non-prime attribtue.Check which is the primary key.

3rd Normal Form(3NF)
=>The table has to be in 2NF before proceeding to 3NF.There should be no transitive dependency for non-prime attributes.

Boyce Codd Normal Form(BCNF)
Check the dependenct is find out the super key of the particular table.
