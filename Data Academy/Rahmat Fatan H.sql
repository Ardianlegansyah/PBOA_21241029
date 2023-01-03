-- Perintah untuk membuat database
CREATE DATABASE dayat;

-- Perintah untuk membuat table
CREATE TABLE dayat.customers (
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR (16) NOT NULL,
	last_name VARCHAR (16) NOT NULL,
	email VARCHAR (32) UNIQUE NOT NULL,
	birth_date DATE,
	balance FLOAT DEFAULT 0.0
);

-- Memasukan data ke dalam table (sesuai urutan kolom)
INSERT INTO dayat.customers VALUES (
NULL,
	"Tony",
	"Stark",
	"ironman@gmail.com",
	"1990-12-06-07",
	70.312
);

-- Menampilkan data pada tabel
SELECT * FROM dayat.customers;

-- Memperbarui data
UPDATE dayat.customers SET
	email = "ironman@yahoo.com",
    birth_date = "1990-12-07",
    balance = 80.312
WHERE id = 1;

-- Menghapus data
DELETE FROM dayat.customers WHERE id = 1;

-- Menambahkan kolom pada tabel
ALTER TABLE dayat.customers ADD username TEXT NOT NULL;

-- Perintah untuk menampilkan informasi tabel
DESCRIBE dayat.customers;

-- Mengubah nama kolom
ALTER TABLE dayat.customers
CHANGE birth_date tanggal_lahir DATE; 

-- Menghapus kolom pada tabel
ALTER TABLE dayat.customers
DROP COLUMN username;

-- Mengubah tipe constraint
ALTER TABLE dayat.customers
CHANGE tanggal_lahir tanggal_lahir TEXT NOT NULL;

-- Menampilkan data pada tabel (seluruh kolom)
SELECT * FROM belajar.orderdetails;

-- Menampilkan data kolom tertentu
SELECT
	productcode,
    quantityOrdered,
    priceEach
FROM belajar.orderdetails;

-- Menarik data dengan jumlah tertentu
SELECT
	productcode,
    quantityOrdered,
    priceEach
FROM belajar.orderdetails
LIMIT 5;

-- Membuat alias pada kolom
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
LIMIT 5;

-- Sorting pada kolom (menurun)
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
ORDER BY quantityOrdered DESC;

-- Sorting pada kolom (menaik)
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
ORDER BY quantityOrdered ASC;

-- Filtering pada kolom angka
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
WHERE quantityOrdered > 50;

-- Filtering pada kolom karakter
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
WHERE productCode = "S10_1678";

-- Filtering pada kolom karakter
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan"
FROM belajar.orderdetails
WHERE productCode LIKE "S10_%";

-- Melakukan operasi antar kolom
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan",
    (quantityOrdered * priceEach) AS total
FROM belajar.orderdetails;

-- Melakukan filtering pada kolom operasi
SELECT
	productcode AS "kode produk",
    quantityOrdered AS jumlah,
    priceEach AS "harga satuan",
    (quantityOrdered * priceEach) AS total
FROM belajar.orderdetails
HAVING total > 2000;

-- Melakukan Agregasi
SELECT
	SUM(quantityOrdered) AS "total jumlah",
    AVG(quantityOrdered) AS "rata-rata jumlah",
    MIN(quantityOrdered) AS "pembelian terkecil",
    MAX(quantityOrdered) AS "pembelian terbesar",
    SUM(quantityOrdered * priceEach) AS "total revenue"
FROM belajar.orderdetails;

-- Melakukan grouping
SELECT
	productCode AS "kode produk",
    SUM(quantityOrdered * priceEach) AS total
FROM belajar.orderdetails
GROUP BY productCode
ORDER BY productCode DESC;

-- Challenge
SELECT
	productCode AS "kode produk",
	SUM(quantityOrdered * priceEach) AS total
FROM belajar.orderdetails
GROUP BY productCode
ORDER BY total DESC
LIMIT 10;

-- Menggunakan fungsi
SELECT
	paymentDate,
    YEAR(paymentDate),
    MONTH(paymentDate),
    DATE_FORMAT(paymentDate, "%d/%m/%Y"),
    amount
FROM belajar.payments;

-- Menghitung total transaksi berdasarkan tahun
SELECT
	YEAR(paymentDate) AS tahun,
    SUM(amount) AS total
FROM belajar.payments
GROUP BY tahun;

-- Melakukan join pada tabel
SELECT
	A.productCode AS "kode produk",
    B.productName AS "nama produk",
    SUM(A.quantityOrdered * A.priceEach) AS total
FROM belajar.orderdetails A 
INNER JOIN belajar.products B 
ON A.productCode = B.productCode
GROUP BY A.productCode
ORDER BY total DESC
LIMIT 10;

SELECT * FROM belajar.payments;
SELECT * FROM belajar.customers;
-- Challenge 
-- Tampilkan top 10 customerName berdasarkan SUM(amount)
-- Gabungkan antara tabel payments dan customers
-- ORDER BY SUM(amount) terbesar ke terkecil

SELECT
	A.customerNumber AS "Nomor Customer",
    B.customerName AS "Nama Customer",
    SUM(A.amount) AS Total
FROM belajar.payments A 
INNER JOIN belajar.customers B
ON A.customerNumber = B.customerNumber
GROUP BY A.customerNumber
ORDER BY Total DESC
LIMIT 10;




 






