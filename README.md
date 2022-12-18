for connect with mysql

mysql> create database statistic; -- Creates the new database
mysql> create user 'name'@'%' identified by 'password'; -- Creates the user
mysql> grant all on statistic.* to 'name'@'%'; -- Gives all privileges to the new user on the newly created database