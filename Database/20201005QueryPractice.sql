#Q1.https://www.hackerrank.com/challenges/weather-observation-station-15/problem

Select round(long_w,4) from station where lat_n < 137.2345 order by lat_n desc limit 1;

#Q2.https://www.hackerrank.com/challenges/weather-observation-station-16/problem?h_r=next-challenge&h_v=zen

select round(lat_n,4) from station where lat_n >38.7780 order by lat_n asc limit 1;

#Q3.https://www.hackerrank.com/challenges/weather-observation-station-17/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

select round(long_w,4) from station where lat_n > 38.7780 order by lat_n asc limit 1;

#Q4.https://www.hackerrank.com/challenges/what-type-of-triangle/problem
************************************************************************
SELECT CASE             
            WHEN A + B > C AND B + C > A AND A + C > B THEN
                CASE 
                    WHEN A = B AND B = C THEN 'Equilateral'
                    WHEN A = B OR B = C OR A = C THEN 'Isosceles'
                    ELSE 'Scalene'
                END
            ELSE 'Not A Triangle'
        END
FROM TRIANGLES;
************************************************************************

#Q5.https://www.hackerrank.com/challenges/asian-population/problem

select sum(city.population)from city,country  where cITY.COUNTRYCODE = COUNTRY.CODE  and country.continent= "Asia";

#Q6.https://www.hackerrank.com/challenges/african-cities/problem

select  city.name from city, country where city.countrycode = country.code and country.continent = 'Africa'

#Q7.https://www.hackerrank.com/challenges/average-population-of-each-continent/problem

SELECT COUNTRY.CONTINENT, FLOOR(AVG(CITY.POPULATION))
FROM CITY INNER JOIN COUNTRY
ON CITY.COUNTRYCODE = COUNTRY.CODE
GROUP BY COUNTRY.CONTINENT;
