##HackerRank SQL Questions 

#Q1.Select average number of people where the district is California
Select avg(population) from city where city.district ="California";

#Q2.Query the average population for all cities in city rounded down to the nearest integer.
select floor(avg(population)) from city;

#Q3.Query the sum of the populations for all Japanese cities in CITY. The CountryCode for Japan is JPN.
select sum(population) from City where city.countrycode ="JPN"

#Q4.Query the difference between the maximum and minimum populations in City.
Select max(population)-min(population) from City;


         
#Q5.https://www.hackerrank.com/challenges/the-blunder/problem
         
#Be aware of the Ceil function
         #SQL CEIL() function is used to get the smallest integer which is greater tham or equal to, the specified numeric expression.

Select CEIL(AVG(Salary)-AVG(Replace (Salary,'0',''))) FROM EMPLOYEES;
        







