[[/docker/automated/:user/:repo]]
/docker/automated/:user/:repo
- # docker
  - docker compose up grafana, mysql and other need or maybe not components.
- # for connect with mysql
  - mysql> create database statistic; -- Creates the new database
  - mysql> create user 'name'@'%' identified by 'password'; -- Creates the user
  - mysql> grant all on statistic.* to 'name'@'%'; -- Gives all privileges to the new user on the newly created database
