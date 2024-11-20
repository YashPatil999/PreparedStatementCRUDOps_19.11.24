CRUD Operations Using Prepared Statements in Java

This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using JDBC and MySQL with a personDetails table. It highlights the usage of Prepared Statements where the data is predifind to interact with the database securely and efficiently.

Features:

Insert Data: Add a new record with details (ID, Name, Address) into the database.
Update Data: Modify the Name and Address of an existing record using the ID.
Delete Data: Remove a record from the database by its ID.
Retrieve Data: Fetch and display all records from the personDetails table.

Files:

Person.java :

Contains methods to perform CRUD operations:
Insert(int pId, String pName, String pAddress) - Adds a new record.
Update(int pId, String pName, String pAddress) - Updates an existing record.
Delete(int pId) - Deletes a record by its ID.
GetAllData() - Retrieves and displays all records from the table.
Establishes a connection with the MySQL database and uses Prepared Statements for SQL queries.

PersonManagement.java : 

Contains the main method to demonstrate the usage of CRUD operations sequentially:
Insert a new record.
Update the record.
Delete the record.
Retrieve all remaining records.
