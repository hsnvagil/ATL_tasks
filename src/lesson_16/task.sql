CREATE TABLE Employees
(
    EmployeeID SERIAL PRIMARY KEY,
    FirstName  VARCHAR(50),
    LastName   VARCHAR(50),
    Position   VARCHAR(50),
    Salary     DECIMAL(10, 2)
);

CREATE TABLE Customers
(
    CustomerID SERIAL PRIMARY KEY,
    Name       VARCHAR(50),
    Email      VARCHAR(50),
    Phone      VARCHAR(20)
);

CREATE TABLE Orders
(
    OrderID     SERIAL PRIMARY KEY,
    OrderNumber VARCHAR(20),

    OrderDate   DATE,
    OrderPrice  DECIMAL(10, 2),
    Status      VARCHAR(20),
    CustomerID  INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers (CustomerID)
);

CREATE TABLE Products
(
    ProductID SERIAL PRIMARY KEY,
    Name      VARCHAR(50),
    Price     DECIMAL(10, 2),
    Category  VARCHAR(50)
);

CREATE TABLE Sales
(
    SaleID    SERIAL PRIMARY KEY,
    ProductID INT,
    Quantity  INT,
    Price     DECIMAL(10, 2),
    Revenue   DECIMAL(10, 2),
    FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

CREATE TABLE Inventory
(
    ProductID SERIAL PRIMARY KEY,
    Quantity  INT,
    FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

INSERT INTO Employees (FirstName, LastName, Position, Salary)
VALUES ('John', 'Doe', 'Manager', 5000.00),
       ('Jane', 'Smith', 'Salesperson', 3000.00),
       ('Mike', 'Johnson', 'Technician', 2500.00);
INSERT INTO Customers (Name, Email, Phone)
VALUES ('Acme Corp', 'info@acme.com', '123-456-7890'),
       ('XYZ Company', 'info@xyz.com', '987-654-3210'),

       ('ABC Enterprises', 'info@abc.com', '555-555-5555');
INSERT INTO Orders (OrderNumber, OrderDate, OrderPrice, Status, CustomerID)
VALUES ('ORD001', '2023-06-01', 1000.00, 'Completed', 1),
       ('ORD002', '2023-06-05', 500.00, 'Completed', 2),
       ('ORD003', '2023-06-10', 750.00, 'Pending', 3);
INSERT INTO Products (Name, Price, Category)
VALUES ('Product A', 10.99, 'Electronics'),
       ('Product B', 25.99, 'Home & Garden'),
       ('Product C', 5.99, 'Books');
INSERT INTO Sales (ProductID, Quantity, Price, Revenue)
VALUES (1, 10, 10.99, 109.90),
       (2, 5, 25.99, 129.95),
       (3, 20, 5.99, 119.80);
INSERT INTO Inventory (ProductID, Quantity)
VALUES (1, 100),
       (2, 50),
       (3, 200);

SELECT *
FROM Employees;

SELECT Name, Email
from Customers;

SELECT *
FROM Orders
WHERE Status = 'Completed';

SELECT Name, Price
FROM Products
WHERE Category = 'Electronics';

SELECT SUM(Revenue)
FROM Sales;

SELECT ProductID, SUM(Quantity)
FRom Inventory
group by ProductID;

SELECT CONCAT(FirstName, ' ', LastName) as FullName
FROM Employees
WHERE Position = 'Manager';

SELECT *
FROM Orders
WHERE CustomerID = 2;

SELECT *
FROM Sales
WHERE Quantity > 10;

SELECT *
FROM Products
WHERE Price = (SELECT MAX(Price) FROM Products);



select *
from Products
where length(Name) = (select max(length(Name)) from Products);
