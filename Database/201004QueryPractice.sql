##HackerRank SQL Questions 

#Q1.Select average number of people where the district is California
Select avg(population) from city where city.district ="California";

#Q2.Query the average population for all cities in city rounded down to the nearest integer.
select floor(avg(population)) from city;

#Q3.Query the sum of the populations for all Japanese cities in CITY. The CountryCode for Japan is JPN.
select sum(population) from City where city.countrycode ="JPN"

#Q4.Query the difference between the maximum and minimum populations in City.
Select max(population)-min(population) from City;

#Q5. https://www.hackerrank.com/challenges/occupations/problem (Pivot)

Pivot Syntax

SELECT <non-pivoted column>,  
    [first pivoted column] AS <column name>,  
    [second pivoted column] AS <column name>,  
    ...  
    [last pivoted column] AS <column name>  
FROM  
    (<SELECT query that produces the data>)   
    AS <alias for the source query>  
PIVOT  
(  
    <aggregation function>(<column being aggregated>)  
FOR   
[<column that contains the values that will become column headers>]   
    IN ( [first pivoted column], [second pivoted column],  
    ... [last pivoted column])  
) AS <alias for the pivot table>  
<optional ORDER BY clause>;







