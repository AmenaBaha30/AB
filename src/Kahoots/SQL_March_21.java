package Kahoots;

public class SQL_March_21 {

    /*
        Q1: What does SQL primarily enable users to do with databases?

Answer: Communicate and manage data within databases



Q2: What kind of operations can SQL perform on data within a database?

Answer: Queries, updates, and data management



Q3: What is the primary function of an RDBMS in data management?

Answer: To manage, query, and organize data across tables



Q4: Why are RDBMS considered 'relational'?

Answer: Because they use relationships to connect data across tables



Q5: How does an RDBMS enhance data retrieval efficiency?

Answer: By linking data via primary and foreign keys



Q6: What role does a foreign key play in a database?

Answer: Links records between two tables



Q7: Why is the "Not Null" constraint important for a primary key?

Answer: Prevents missing values in the key column



Q8: How does a primary key enhance database search efficiency?

Answer: By optimizing search operations



Q9: What role does a foreign key play in relational databases?

Answer: Links two tables together



Q10: How do foreign keys and primary keys work together?

Answer: Facilitating relationships between tables



Q11: What does the SELECT statement do in SQL?

Answer: Retrieves data from a database



Q12: How do you specify which data to retrieve using SELECT in SQL?

Answer: SELECT * FROM tableName



Q13: What is the result of using the SELECT * command in SQL?

Answer: Retrieves all columns from a table



Q14: How do you start a single-line comment in SQL?

Answer: --



Q15: What symbol ends a multi-line comment in SQL?

Answer: */



   /* Q16: Which of the following is a correct way to comment out SQL code?

    Answer: Both A and B (/* Comment *//* SELECT * FROM table) (-- SELECT * FROM table😉



    Q17: What does an Entity in an ERD represent?

    Answer: A table in a database



    Q18: What symbol is commonly used to represent entities in an ERD?

    Answer: Rectangles



    Q19: In an ERD, what does a "crow's foot" notation signify?

    Answer: A one-to-many relationship, A one-to-one relationship, A many-to-one relationship



    Q20: What does SQL stand for?

    Answer: Structured Query Language



    Q21: What is DDL used for in SQL?

    Answer: Data definition



    Q22: Which of the following is NOT a type of DBMS?

    Answer: CDBMS



    Q23: Which NoSQL database type stores data as key-value pairs?

    Answer: Key-Value Stores



    Q24: Which DML command should be used to add a new smoothie item to the menu in a database?

    Answer: INSERT



    Q25: I can use "Add" command to insert a new record into table

            Answer: False



    Q26: What does the UPDATE command in DML do?

    Answer: Modifies existing data in a table



    Q27: What is the purpose of using IS NULL in a SQL query?

    Answer: To find rows with NULL values



    Q28: How do you filter out rows with any NULL values in a specified column?

    Answer: WHERE column_name IS NULL



    Q29: What does the SQL operator "AND" require to return "TRUE"?

    Answer: All conditions are true.



    Q30: Which SQL query correctly finds employees in the 'Sales' department with a salary over 50000?

    Answer: SELECT * FROM Employees WHERE Department = 'Sales' AND Salary > 50000;



    Q31: How do you select records where the department is either 'Sales' or 'Marketing'?

    Answer: SELECT * FROMEmployees WHERE Department='Sales' OR Department= 'Marketing';



    Q32: Which query correctly excludes employees from the 'Sales' department?

    Answer: SELECT * FROM Employees WHERE Department <> 'Sales'; , SELECT * FROM Employees WHERE NOT Department = 'Sales';



    Q33: Which SQL function calculates the total value of a numeric column?

    Answer: SUM()



    Q34: To find the highest salary from the 'employees' table, which SQL function is used?

    Answer: MAX(salary)



    Q35: Which function counts the total number of entries in the 'employees' where 'job_title' is 'Manager'?

    Answer: COUNT()



    Q36: For calculating the average 'id' value from the 'primary_person' table, which SQL function would

    Answer: AVG(id)



    Q37: What does the ORDER BY clause in SQL do?

    Answer: Sorts the query results based on one or more columns.



    Q38: How do you sort books by author (A-Z) then by oldest publication?

    Answer: ORDER BY author ASC, date ASC



    Q39: What does the '%' wildcard in a LIKE clause represent in SQL?

    Answer: Any sequence of characters



    Q40: How would you write a SQL query to find titles that start with "choco" and end with "late"?

    Answer: SELECT * FROM Recipes WHERE Title LIKE 'choco%late%';



    Q41: Which SQL query correctly finds recipes with "chocolate" in any part of the title?

    Answer: SELECT * FROM Recipes WHERE Title LIKE '%chocolate%';



    Q42: What is the purpose of the HAVING clause in SQL?

    Answer: To filter groups of records based on an aggregate condition



    Q43: Which statement best describes a one-to-many relationship in SQL?

    Answer: Each row in Table A can relate to many rows in Table B.



            Q44: What does a foreign key in SQL do?

    Answer: Links a row to another row in a different table.



    Q45: How are many-to-many relationships implemented in SQL?

    Answer: Through a junction table that connects foreign keys from two tables.
     */
}
