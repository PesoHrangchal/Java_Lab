#Lab Assignment-4
use lab_db;

#1.Creating Coustomer table with Cust_id as primary key
create table Coustomer (Cust_id varchar(10)primary key,
Fname varchar(20) not null,
Lname varchar(20) ,
Area varchar(5) not null,
phone bigint(11));

#inserting th values to the respctive entites of the Coustomer tables.
insert into Coustomer values
('A01','Ivan', 'Ross', 'SA', 6125467),
('A02','Vandana', 'Ray', 'MU', 5560379),
('A03','Pramada', 'Jaugste', 'DA', 4560389),
('A04','Basu', 'Navindi', 'BA', 6125401),
('A05','Ravi', 'Shridhar', 'NA', NULL),
('A06','Rukmini', 'Aiyer', 'GH', 5125274);

#Creating the 2nd table Movie table with movie name as the Primary key and Cust_id as the foreign key'
create table Movie(
Mv_no int(3) primary key,
Cust_id varchar (20),foreign key(Cust_id) references Coustomer(Cust_id),
Title varchar(20) not null,
Star varchar(5) not null,
Price int Check (price>100 and price<250));

#inserting the values to their respective Entities of the Movie Table.
insert into Movie values
('1','A02', 'Bloody', 'JC', 181),
('2','A04', 'The Frim', 'TC', 200),
('3','A01', 'Preety Woman', 'RG', 151),
('4','A06', 'Home Alone', 'MC', 150),
('5','A05', 'The Fugitive', 'MF', 200),
('6','A03', 'Coma', 'MD', 100),
('7','A02', 'Dracula', 'GO', 150),
('8','A06', 'Quick Change', 'BM', 100),
('9','A03', 'Gone with the wind', 'CB', 200),
('10','A05', 'Carry on Doctor', 'LP', 100);

#5.Display the movie titles, whose price is greater than 100 but less than 200.
select Title from Movie where Price>100 and price<200;

#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select Cust_id from Movie where Star = 'JC' or Star = 'TC' or Star = 'MC';

#7. Display the details of those customers who have an A in their area name.
select * from Coustomer where Area Like '%A%';

#8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 Character
select Title from Movie where Price <= 180 and length(Title)=6;

#9. Display the movie name, their original prices and the prices after 10% increment. 
#Give alias name to the incremented price column.
select Title,Price,(Price+0.1*price) as Price_Increased_by_10Percent from Movie;

#10.Display all the customer details in the following way:
# ‘Ivan Ross stays in SA and his phone number is 6125467.’


#11.Add a not null constraint to the Lname field in Customer.
alter table Coustomer modify Lname varchar(20) not null;

#12.Display the customer’s name whose phone number is not recorded.
select Fname,Lname from Coustomer where Phone is null;

#13.Add the phone number according to your own wish for the person mentioned in problem no 12.
update Coustomer set Phone = 123456 where phone is null;

#14.Display the unique customer ids from movie table.
select Cust_id as 'Coustomers ids' FROM Movie group by Cust_id; 

#15.Remove the not null constraint from Star column in movie table.
alter table Movie modify Star varchar(5);

#16.Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from Coustomer where Cust_id ='A01';

#17.Delete any row from the Movie table. If you cannot delete, then note the error message displayed
delete from Movie where Price = 151;

#18.Drop the Customer table. If you cannot drop, then note the error message displayed
Drop table Coustomer;
#Error Code: 3730. Cannot drop table 'coustomer' referenced by a foreign key constraint 'movie_ibfk_1' on table 'movie'.	0.000 sec

#19.Drop the Movie table. If you cannot drop, then note the error message displayed
Drop table Movie;

#20.Drop the foreign key from Movie table
