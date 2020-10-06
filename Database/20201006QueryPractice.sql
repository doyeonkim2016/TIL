#Q1.https://www.hackerrank.com/challenges/the-pads/problem

Select concat(name,'(',left(occupation,1),')') from occupations order by name asc;
select concat('There are a total of',' ',count(occupation),' ',lower(occupation),'s.') as total from occupations group by occupation order by total;

#Q2.https://www.hackerrank.com/challenges/occupations/problem?h_r=next-challenge&h_v=zen

set @r1=0, @r2=0, @r3=0, @r4=0;
select min(Doctor), min(Professor), min(Singer), min(Actor)
from(
  select case when Occupation='Doctor' then (@r1:=@r1+1)
            when Occupation='Professor' then (@r2:=@r2+1)
            when Occupation='Singer' then (@r3:=@r3+1)
            when Occupation='Actor' then (@r4:=@r4+1) end as RowNumber,
    case when Occupation='Doctor' then Name end as Doctor,
    case when Occupation='Professor' then Name end as Professor,
    case when Occupation='Singer' then Name end as Singer,
    case when Occupation='Actor' then Name end as Actor
  from OCCUPATIONS
  order by Name
) Temp
group by RowNumber
