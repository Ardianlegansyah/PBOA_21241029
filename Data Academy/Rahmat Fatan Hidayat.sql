-- Melakukan Subquery
SELECT
	productCode,
    AVG(quantityOrdered) AS avg_qty
FROM belajar.orderdetails
GROUP BY productCode
HAVING avg_qty > (SELECT AVG(quantityOrdered) FROM belajar.orderdetails);

-- Membuat tabel total product orders
CREATE TABLE belajar.products_total (
	productCode VARCHAR(32),
    productName VARCHAR(50),
    total FLOAT
);

SELECT
	A.productCode,
    B.productName,
    SUM(A.quantityOrdered * A.priceEach) AS total
FROM belajar.orderdetails A 
JOIN belajar.products B
ON A.productCode = B.productCode
GROUP BY A.productCode
ORDER BY total DESC;

-- Memasukan data ke tabel menggunakan subquery
INSERT INTO belajar.products_total
	SELECT 
    A.productCode,
    B.productName,
    SUM(A.quantityOrdered * A.priceEach) AS total
FROM belajar.orderdetails A 
JOIN belajar.products B
ON A.productCode = B.productCode
GROUP BY A.productCode
ORDER BY total DESC;

-- Menampilkan data pada tabel
SELECT * FROM belajar.products_total;

-- Membuat view table
CREATE VIEW belajar.summary_products_total AS
	SELECT 
    A.productCode,
    B.productName,
    SUM(A.quantityOrdered * A.priceEach) AS total
FROM belajar.orderdetails A 
JOIN belajar.products B
ON A.productCode = B.productCode
GROUP BY A.productCode
ORDER BY total DESC;

-- Menampilkan data pada view table
SELECT * FROM belajar.summary_products_total;

-- Melakukan subquery pada perintah from
	SELECT 
    A.productCode,
    B.productName,
    SUM(A.quantityOrdered * A.priceEach) AS total
FROM (SELECT * FROM (SELECT * FROM belajar.orderdetails) Aa) A 
JOIN (SELECT * FROM belajar.products) B
ON A.productCode = B.productCode
GROUP BY A.productCode
ORDER BY total DESC;

SELECT
	A.customerNumber,
    B.customerName,
    AVG(A.amount) AS avg_amount
FROM belajar.payments A
JOIN belajar.customers B
ON A.customerNumber = B.customerNumber
GROUP BY A.customerNumber
HAVING avg_amount > (SELECT AVG(amount) FROM belajar.payments)
ORDER BY avg_amount DESC;

-- Buatkan view table summary_customers_avg_amount
CREATE VIEW belajar.summary_customers_avg_amount AS
	SELECT 
	A.customerNumber,
    B.customerName,
    AVG(A.amount) AS avg_amount
FROM belajar.payments A
JOIN belajar.customers B
ON A.customerNumber = B.customerNumber
GROUP BY A.customerNumber
HAVING avg_amount > (SELECT AVG(amount) FROM belajar.payments)
ORDER BY avg_amount DESC;

-- Menambahkan kolom customer level
ALTER TABLE belajar.customers
ADD customer_level VARCHAR(32);

SELECT
	customerName,
    phone,
    customer_level
FROM belajar.customers;

SELECT
	customerNumber
FROM belajar.payments
GROUP BY customerNumber
HAVING AVG(amount) > 32431.64;

-- Melakukan subquery menggunakan update
SET SQL_SAFE_UPDATES = 0;
UPDATE belajar.customers SET
 	customer_level = "High Level Customer"
WHERE customerNumber IN (
	SELECT
	customerNumber
	FROM belajar.payments
	GROUP BY customerNumber
	Having AVG(amount) > 32431.64
);

SET SQL_SAFE_UPDATES = 0;
UPDATE belajar.customers SET
 	customer_level = "Low Level Customer"
WHERE customerNumber IN (
	SELECT
	customersNumber
	FROM belajar.payments
	GROUP BY customerNumber
	Having AVG(amount) > 32431.64
);

UPDATE belajar.customers SET
	customer_level = "Mid Level Customer"
WHERE customer_level IS NULL;

-- Membuat tabel backup
CREATE TABLE belajar.customer_backup (
	customerNumber INT,
    customerName TEXT,
    phone TEXT,
    addressLine1 TEXT,
    creditLimit FLOAT 
);

-- Memasukan data ke tabel backup
INSERT INTO belajar.customer_backup
	SELECT
		customerNumber,
		customerName,
		phone,
		addressLine1,
		creditLimit
    FROM belajar.customers;
    
-- Melakukan delete menggunakan subquery 
DELETE FROM belajar.customer_backup
WHERE customerNumber IN (
	SELECT
		customerNumber
	FROM belajar.payments
    GROUP BY customerNUmber
    HAVING AVG(amount) > (
		SELECT AVG(amount) FROM belajar.payments
    )
);

SELECT * FROM belajar.customer_backup;

-- CHALLENGE

ALTER TABLE belajar.products
ADD product_level TEXT;

SELECT AVG(quantityOrdered) FROM belajar.orderdetails;

UPDATE belajar.products
	SET product_level = "High Level Product"
WHERE productCode IN (
	SELECT
		productCode
	FROM belajar.orderdetails
	GROUP BY productCode
	HAVING AVG(quantityOrdered) > (
		SELECT AVG(quantityOrdered) FROM belajar.orderdetails
	)
);

UPDATE belajar.products
	SET product_level = "Low Level Product"
WHERE productCode IN (
	SELECT
		productCode
	FROM belajar.orderdetails
	GROUP BY productCode
	HAVING AVG(quantityOrdered) < (
		SELECT AVG(quantityOrdered) FROM belajar.orderdetails
	)
);









    