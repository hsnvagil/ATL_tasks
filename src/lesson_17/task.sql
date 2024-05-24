CREATE TABLE Sales
(
    ID       serial primary key,
    Product  varchar(50),
    Quantity integer,
    Price    decimal
);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (1, 'Product 1', 20, 250);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (3, 'Product 1', 18, 120);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (4, 'Product 1', 22, 103);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (5, 'Product 2', 18, 140);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (6, 'Product 2', 24, 139);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (7, 'Product 2', 20, 170);

INSERT INTO Sales (ID, Product, Quantity, Price)
VALUES (2, 'Product 2', 10, 200);

SELECT Product, SUM(Quantity), AVG(Price)
FROM Sales
GROUP BY Product;

----------------------------------------------------------

-- SUM, AVG, MIN, MAX, COUNT

SELECT count(Quantity)
FROM Sales;

SELECT min(Price)
FROM Sales;

SELECT max(Price)
FROM Sales;

----------------------------------------------------------

CREATE TABLE Expenses
(
    ID       serial,
    Category varchar,
    Amount   decimal
);


INSERT INTO Expenses (ID, Category, Amount)
VALUES (1, 'Category 1', 200.15);

INSERT INTO Expenses (ID, Category, Amount)
VALUES (2, 'Category 2', 120.40);

INSERT INTO Expenses (ID, Category, Amount)
VALUES (3, 'Category 3', 100.25);

SELECT Category, SUM(Amount), AVG(Amount)
FROM Expenses
GROUP BY Category;

-----------------------------------------------

CREATE TABLE Products
(
    ID    serial,
    Name  varchar,
    Price decimal
);

INSERT INTO Products (ID, Name, Price)
VALUES (1, 'Prod 1', 200.25);

INSERT INTO Products (ID, Name, Price)
VALUES (2, 'Prod 2', 140.25);

INSERT INTO Products (ID, Name, Price)
VALUES (3, 'Prod 3', 100.20);

SELECT MIN(Price) as MinumumPrice, max(Price) as MaximumPrice
FROM Products;

--------------------------------------------------

CREATE TABLE Students (
                          Id serial,
                          Name varchar,
                          AvgGrade decimal
);

INSERT INTO Students (Id, Name, AvgGrade)
VALUES (1, 'Agil', 15.50);

INSERT INTO Students (Id, Name, AvgGrade)
VALUES (2, 'Rza', 23.50);

INSERT INTO Students (Id, Name, AvgGrade)
VALUES (3, 'Ali', 18.50);

INSERT INTO Students (Id, Name, AvgGrade)
VALUES (4, 'Laman', 17.50);

INSERT INTO Students (Id, Name, AvgGrade)
VALUES (5, 'Durna', 19.50);


SELECT * FROM Students WHERE AvgGrade > (SELECT avg(AvgGrade) FROM Students);

---------------------------------------------------

CREATE TABLE FemaleStudents(
                               Id serial primary key,
                               Name varchar(25)
);

CREATE TABLE MaleStudents(
                             Id serial primary key,
                             Name varchar(25)
);

INSERT INTO MaleStudents (Name)
VALUES ('ZZ');

INSERT INTO FemaleStudents (Name)
VALUES  ('FF');

INSERT INTO MaleStudents (Name)
VALUES ('AZ');

INSERT INTO FemaleStudents (Name)
VALUES ('QZ');

INSERT INTO MaleStudents (Name)
VALUES ('RZ');

INSERT INTO FemaleStudents (Name)
VALUES ('LZ');

INSERT INTO MaleStudents (Name)
VALUES ('IZ');

INSERT INTO FemaleStudents (Name)
VALUES ('QZ');

INSERT INTO FemaleStudents (Name)
VALUES ('RZ');


SELECT Name FROM MaleStudents
UNION
SELECT Name From FemaleStudents

SELECT Name FROM MaleStudents
EXCEPT
SELECT Name FROM FemaleStudents;

SELECT Name From MaleStudents
INTERSECT
SELECT Name FROM FemaleStudents;


