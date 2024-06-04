## JDBC
### Explanation
Write a Java application that connects to a MySQL database using JDBC, retrieves data from a specific table, and prints the retrieved data to the screen. Operate in the database and create a table named "employees" and 4 columns for each employee: "id", "name", "position" and "salary". Manually record at least 5 employees in the employees table in the database.

Tip 1: First, you need to add your database driver to your project library. In this example, you can use the mysql-connector-java.jar file for MySQL.

Tip 2: You can connect to the database with JDBC using the java.sql package. This package includes classes such as DriverManager, Connection, Statement and ResultSet.

Tip 3: You can create a connection to the database using the DriverManager.getConnection() method. You will pass the database URL, username and password as parameters of this method.

Tip 4: You can create a SQL statement using the createStatement() method of the Connection object.

Tip 5: You can run a SQL query using the executeQuery() method of the Statement object and store the results in a ResultSet object.

Tip 6: You can loop through the ResultSet object, read each row, and get the value of each column.
