create table Products
(
    ProductId   serial primary key,
    Name        varchar(50),
    Price       integer,
    Quantity    integer,
    Description varchar(50),
    CategoryId  integer,
    FOREIGN KEY (CategoryId) REFERENCES Categories (CategoryId)
);

create table Categories
(
    CategoryId serial primary key,
    Name       varchar(50)
);

create table Customers
(
    CustomerId  serial primary key,
    FirstName   varchar(25),
    LastName    varchar(25),
    Address     varchar(25),
    Email       varchar(30),
    PhoneNumber varchar(30)
);

create table Orders
(
    OrderId    serial primary key,
    CustomerId integer,
    OrderDate  date,
    FOREIGN KEY (CustomerId) REFERENCES Customers (CustomerId)
);

create table OrderDetails
(
    OrderDetailId serial primary key,
    OrderId       integer,
    ProductId     integer,
    Quantity      integer,
    FOREIGN KEY (OrderId) REFERENCES Orders (OrderId),
    FOREIGN KEY (ProductId) REFERENCES Products (ProductId)
);


INSERT INTO Products (Name, Price, Quantity, Description, CategoryId)
VALUES ('Product A', 10.99, 10, 'Modern'),
       ('Product B', 25.99, 20, 'New'),
       ('Product C', 5.99, 25, 'Ancient');

insert into Categories (Name)
values ('Electronics'),
       ('Home & Garden'),
       ('Books');

INSERT INTO Customers (FirstName, LastName, Address, Email, PhoneNumber)
VALUES ('Bob', 'Carlos', 'Germany', 'info@acme.com', 123 - 456 - 7890),
       ('John', 'Wilson', 'England', 'info@xyz.com', 987 - 654 - 3210),
       ('Mike', 'Corleone', 'Italy', 'info@abc.com', 555 - 555 - 5555);

insert into Orders (CustomerID, OrderDate)
values (1, '2023-06-01'),
       (2, '2023-06-05'),
       (3, '2023-06-10');

insert into OrderDetails (OrderID, ProductID, Quantity)
values (1, 3, 8),
       (2, 1, 5),
       (3, 1, 10);


-- Get a list of all products.
SELECT *
FROM Products;

-- Get a list of all categories of products.
SELECT *
FROM Products
         JOIN Categories C on Products.CategoryId = C.CategoryId;


-- Get a list of all customers.
SELECT *
FROM Customers;


-- Get a list of all orders.
SELECT *
FROM Orders;

-- Get a list of all order details.
SELECT *
FROM OrderDetails;


-- Get information about a specific product by its ID.
SELECT *
FROM Products
WHERE ProductId = 1;

-- Get a list of products in a specific category.
SELECT *
FROM Products as p
         JOIN Categories C on p.CategoryId = C.CategoryId
WHERE p.categoryid = 1;

-- Get information about a customer by their ID.
SELECT *
FROM Customers
WHERE CustomerId = 1;


-- Get a list of orders for a specific customer.
SELECT *
FROM Orders as o
         JOIN Customers C on C.CustomerId = o.CustomerId
WHERE o.CustomerId = 1;


-- Get a list of order details for a specific order.
SELECT *
FROM OrderDetails as od
         JOIN Orders O on od.OrderId = O.OrderId
WHERE od.orderid = 1;

-- Update the price of a product by its ID.
UPDATE Products
SET price=25
WHERE productid = 1;


-- Add a new product.
INSERT INTO Products (Name, Price, Quantity, Description, CategoryId)
VALUES ('Product 5', 20, 3, 'It is amazing products', 1);


-- Delete a product by its ID.
DELETE
FROM Products
WHERE productid = 1;