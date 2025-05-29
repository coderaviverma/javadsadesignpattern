
--SELECT first_name,last_name,birth_date FROM patients where height > 160 and weight > 70 ;

--SELECT first_name,last_name,allergies FROM patients where allergies not null and city ='Hamilton' ;

--select distinct(year(birth_date)) as birth_year from patients order by birth_date;

-- select first_name from patients group by first_name having count(*) < 2;

--SELECT first_name,last_name,birth_date FROM patients where height > 160 and weight > 70 ;

--SELECT first_name,last_name,allergies FROM patients where allergies not null and city ='Hamilton' ;

--select distinct(year(birth_date)) as birth_year from patients order by birth_date;

-- select first_name from patients group by first_name having count(*) < 2;

-- select patient_id,first_name from patients where first_name like 's%s' and LENGTH(first_name)>=6;

-- select p.patient_id,p.first_name,p.last_name from patients p join admissions a on p.patient_id=a.patient_id where a.diagnosis = 'Dementia';

--select first_name from patients order by lenGTH(first_name), first_name;

--select
--(select count(*) from patients where gender='M') as male_count,
--(select count(*) from patients where gender='F') as female_count;

--SELECT first_name,last_name,allergies FROM patients where allergies in ('Penicillin','Morphine') order by allergies ASC,first_name ASC,last_name ASC ;

-- select patient_id,diagnosis from admissions group by patient_id ,diagnosis having count(*) >1;

-- select city, count(*) as num_patients from patients group by city order by num_patients desc,city asc;

--SELECT * FROM admissions;

--select CAST(strftime('%d', admission_date) AS INTEGER) as day_number, count(*) as number_of_admissions from admissions
--group by day_number order by number_of_admissions desc;

--select * from admissions where patient_id ='542' and admission_date =(
--  select max(admission_date) from admissions where patient_id = '542');

--select patient_id,attending_doctor_id,diagnosis from admissions
--where (patient_id%2=1 and attending_doctor_id in (1,5,19) )
--       or (attending_doctor_id like '%2%' and length(patient_id) = 3);

--select first_name,last_name,count(*) as admissions_total from admissions a join doctors d
--on a.attending_doctor_id = d.doctor_id group by a.attending_doctor_id;
--
--select d.doctor_id,concat(d.first_name,' ',d.last_name) as full_name, Min(a.admission_date) as first_admission_date
--,MAX(a.discharge_date) as last_admission_date from doctors d join admissions a on d.doctor_id=a.attending_doctor_id
--group by d.doctor_id,d.first_name,d.last_name ;
--
--SELECT
--  d.doctor_id,
--  d.first_name || ' ' || d.last_name AS full_name,
--  MIN(a.admission_date) AS first_admission_date,
--  MAX(a.admission_date) AS last_admission_date
--FROM doctors d
--JOIN admissions a ON d.doctor_id = a.attending_doctor_id
--GROUP BY d.doctor_id, d.first_name, d.last_name;


--select p.province_name, count(*) as patient_count  from province_names p
--join patients pa on p.province_id = pa.province_id group by p.province_name order by patient_count desc;

--select p.first_name || ' '|| p.last_name as patient_name, a.diagnosis,
--d.first_name || ' '|| d.last_name as docter_name from patients p join admissions a on p.patient_id=a.patient_id
-- join doctors d on a.attending_doctor_id = d.doctor_id;

-- select first_name,last_name, count(*) as num_of_duplicates from patients group by first_name, last_name having count(*) >1;


--SELECT
--  first_name || ' ' || last_name AS full_name,
--  round(height/30.48,1) AS height_in_feet,
--  round(weight*2.205, 0) AS weight_in_pounds,
--  birth_date,
--  case gender
--    when 'M' Then 'MALE'
--    WHEN 'F' THEN 'FEMALE'
--    else 'OTHER'
--  END as gender_type
--  from patients;
--
--
--SELECT p.patient_id, p.first_name, p.last_name
--FROM patients p
--LEFT JOIN admissions a ON p.patient_id = a.patient_id
--WHERE a.patient_id IS NULL;
--
--
--select max(daily_count) as max_visits,
--Min(daily_count) as min_visits,
--ROUND(AVG(daily_count), 2) as average_visits
--from (
--  select admission_date, count(*) as daily_count from
--  admissions group by admission_date );



--select (weight/10)*10 as weight_group,count(*) from patients group by weight_group order by weight_group desc;

--select patient_id,weight,height,
--CASE
--  WHEN weight/((height/100)*(height/100)) >=30 THEN 1
--  ELSE 0
--END as isObese
--from patients;


--select p.patient_id, p.first_name as patient_first_name,p.last_name as patient_last_name,
--d.specialty as attending_doctor_speciality from patients p join admissions a on p.patient_id = a.patient_id
--join doctors d on a.attending_doctor_id=d.doctor_id where d.first_name like '%LISA%' and a.diagnosis ='Epilepsy';


--select p.patient_id, concat(p.patient_id, len(p.last_name),year(p.birth_date) ) as temp_password from patients p
--join admissions a on p.patient_id = a.patient_id group by a.admission_date having count(*)<2;

--select p.patient_id, concat(p.patient_id, len(p.last_name),year(p.birth_date) ) as temp_password from patients p
--where p.patient_id in (
--	select distinct patient_id from admissions)


--select
--	case
--    	when a.patient_id%2=0 then 'Yes'
--        ELSE 'No'
--    END AS 'has_insurance',
--    sum(
--      case
--        when a.patient_id%2=0 then 10
--        ELSE 50
--      END
--      )as cost_after_insurance
--   from admissions a group by has_insurance;



--select pr.province_name from province_names pr join patients p on p.province_id = pr.province_id
--group by pr.province_name
--having
--sum(case when p.gender ='M' then 1 else 0 end) >
--sum(case when p.gender ='F' then 1 else 0 end) ;
--

--
--select * from patients
--where
--substr(first_name,3) like '%r%'
--AND gender = 'F'
--AND month(birth_date) in (2,5,12)
--AND weight between 60 and 80
--ANd patient_id%2=1
--AND city = 'Kingston';

--SELECT
--  ROUND(
--    100.0 * SUM(CASE WHEN gender = 'M' THEN 1 ELSE 0 END) / COUNT(*),
--    2
--  ) || '%' AS male_percentage
--FROM patients;

--
--select admission_date,
--count(*) as admission_day,
--count(*) - LAG(count(*)) OVER(order by admission_date) AS admission_count_change
--from admissions
--group by admission_date
--order by admission_date;
--

--SELECT province_name
--FROM province_names
--ORDER BY
--  CASE WHEN province_name = 'Ontario' THEN 0 ELSE 1 END,
--  province_name ASC;
--
--

--SELECT
--  d.doctor_id,
--  d.first_name || ' ' || d.last_name AS doctor_full_name,
--  d.specialty,
--  strftime('%Y', a.admission_date) AS year,
--  COUNT(*) AS total_admissions
--FROM admissions a
--JOIN doctors d ON a.attending_doctor_id = d.doctor_id
--GROUP BY d.doctor_id, year
--ORDER BY d.doctor_id, year;


--Question: Find the second highest salary from the Employee table.
--select * from employee e order by salary desc limit 1 offset 1;

--select Max(salary) as second_highest_salary from employee e
--    where salary < (select max(salary) from employee e);


--Question: Find duplicate email addresses in a Users table.
--select * from employee e group by email count(*) >1;


--✅ 3. Employees Earning More Than Their Manager
--select * from employee e join employee m on e.id=m.id where e.salary>m.salary;

--✅ 4. Nth Highest Salary Using DENSE_RANK()

--with salaryrank AS (
-- select salary, denserank( over( order by salary desc )) as rnk from employee
-- )
-- select salary from salaryrank where rnk ==3;

--✅ 5. Top 3 Salaries Per Department
--select * from (
--    select *, denserank() over( partition by department_id order by salary desc ) as rnk from employee
--) where rnk <=3;

--✅ 6. First Purchase Made by Each Customer
--select * from (
--    select *, rownumber() over(partition by customer_id order by purchase_date) as rn from orders
--) ranked where rn =1;

--✅ 7. Rolling 7-Day Transaction Total
--select user_id,transaction_data,amount,
--        Sum(amount) Over(
--            Partition by user_id
--            order by transaction_data
--            range between interval 6 day preceding and current row
--        ) as rolling_sum
--From transactions;


--✅ 8. Users Active in Last Month but Not This Month
--WITH last_month_users AS (
--  SELECT DISTINCT user_id FROM Logins
--  WHERE login_date BETWEEN '2024-03-01' AND '2024-03-31'
--),
--this_month_users AS (
--  SELECT DISTINCT user_id FROM Logins
--  WHERE login_date BETWEEN '2024-04-01' AND '2024-04-30'
--)
--select * from user_id
--from last_month_users
--where user_id not in (select user_id from this_month_users);























