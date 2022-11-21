-- create the databases
CREATE DATABASE IF NOT EXISTS testusers;

-- create the users for each database
CREATE USER 'myadmin'@'localhost' IDENTIFIED WITH mysql_native_password BY 'LetMeIn';
GRANT all privileges ON 'testusers'.* TO 'myadmin'@'localhost'; 
GRANT all privileges ON 'testusers'.* TO 'myadmin'@'%';

FLUSH PRIVILEGES;
