package Kahoots;

public class SQL_March_14 {
    /*
    Q1: Which SDLC phase focuses on defining the project's goals and feasibility?

Answer: Planning



Q2: In which SDLC stage are software bugs identified and corrected?

Answer: Test



Q3: How does SDLC improve the software development process?

Answer: By reducing waste and increasing efficiency



Q4: During which SDLC phase are project costs and timelines primarily evaluated?

Answer: Planning



Q5: What is the primary focus of the 'Define Requirements' phase in SDLC?

Answer: Determining what the application is supposed to do



Q6: Which SDLC phase involves creating early versions of the software for feedback?

Answer: Prototyping



Q7: In SDLC, what is the main goal of the 'Software Development' phase?

Answer: Writing the actual program code



Q8: What is the significance of the 'Testing' phase in SDLC?

Answer: Reducing bugs and improving user satisfaction



Q9: During which phase are software bugs most commonly addressed post-deployment?

Answer: Operations and Maintenance



Q10: What characterizes the planning phase in Scrum?

Answer: Minimal planning to start building, testing, and reviewing



Q11: What is a Sprint in the Scrum Framework?

Answer: An iteration that lasts 2-4 weeks where a potentially shippable



Q12: In Scrum, requirements are broken down into large chunks to ensure comprehensive planning before the start of the project

Answer: False



Q13: Scrum is a highly complex framework that makes it challenging for teams to collaborate effectively.

Answer: False



Q14: What is the first step in manual testing?

Answer: Analyzing requirements



Q15: What should QA do after finding bugs in manual testing?

Answer: Report Bug



Q16: Which of the following is a key activity in manual testing?

Answer: Writing and executing test cases based on requirements



Q17: What role does the QA lead play in manual testing?

Answer: Reviews and approves test cases



Q18: Why is Agile preferred over conventional models in rapidly changing environments?

Answer: Agile embraces incremental development for quick adaptation.



Q19: What is a key principle of Agile methodology?

Answer: Frequent delivery of incremental software versions.



Q20: How does Agile methodology ensure customer satisfaction throughout the development process?

Answer: Through unremitting delivery and incorporating feedback.



Q21: Which Agile practice aims to enhance team communication and coding quality?

Answer: Pair Programming.



Q22: What challenge is commonly associated with Agile methodology?

Answer: It may lead to projects with ever-evolving features.



Q23: Agile methodology simplifies the estimation of resources and effort for complex projects.

Answer: False



Q24: Agile development strictly requires a large team for effective implementation.

Answer: False



Q25: What is a fundamental characteristic of the Waterfall Model's approach to project management?

Answer: Sequential completion of project phases



Q26: Which phase in the Waterfall Model primarily focuses on identifying project risks and dependencies?

Answer: Requirements



Q27: How does the Waterfall Model ensure project predictability and planning efficiency?

Answer: Through fixed timelines and budgets established at the start



Q28: In which way can the Waterfall Model's linear approach pose a challenge?

Answer: Unexpected problems in later phases may require revisiting earlier phases



Q29: The Waterfall Model encourages regular iteration on project deliverables throughout all phases.

Answer: False



Q30: The Design phase in the Waterfall Model includes developing a detailed project schedule and budget.

Answer: True



Q31: Why is exhaustive testing considered impossible in software testing?

Answer: It requires unlimited resources and time



Q32: What is the significance of 'Early Testing' in the software development life cycle?

Answer: Defects found early are less expensive to fix



Q33: The 'Absence of Errors Fallacy' suggests software is usable if it is 99% bug-free.

Answer: False



Q34: According to software testing principles, testing should start only after the software development is complete.

Answer: False



Q35: Why should the development team not test the software themselves?

Answer: To avoid bias and ensure an objective testing process



Q36: Which guideline emphasizes the importance of testing both valid and invalid inputs?

Answer: Testing must be done with unexpected and negative inputs



Q37: What does the guideline 'The time available is limited' imply for software testing?

Answer: Effective test planning is crucial due to finite testing time



Q38: Primary difference between Verification and Validation?

Answer: Verification meets specs; Validation meets user needs



Q39: Purpose of automated testing?

Answer: Quick repeat of scenarios, more coverage



Q40: Role of exploratory testing in manual testing?

Answer: Identifies errors without scripts



Q41: What role does SQL play in database interaction?

Answer: Functions like a librarian querying data



Q42: Which action is NOT directly achievable with SQL?

Answer: Changing the database's graphical interface



Q43: SQL is most similar to:

Answer: A query language for communicating with databases



Q44: What function does the central system in the library analogy represent in an RDBMS?

Answer: Management and querying of data



Q45: How do tables in an RDBMS compare to the libraries in the analogy?

Answer: Tables are equivalent to individual libraries



Q46: Why is an RDBMS called 'relational'?

Answer: It forms relationships between tables



Q47: In the context of an RDBMS, what would 'rows' in a table represent using the library analogy?

Answer: Individual books



Q48: How does an RDBMS enhance data management over a non-relational system?

Answer: By enabling complex queries across multiple tables



Q49: What is the purpose of a primary key in a database table?

Answer: To uniquely identify each record in a table



Q50: How does a foreign key in the 'Guest List' table relate to the concept of primary and foreign keys?

Answer: It links guests to their tables, 'Table Number' from another table



Q51: What is the role of a foreign key in a relational database?

Answer: To establish a relationship between two tables



Q52: How does a foreign key contribute to data organization in a database?

Answer: By ensuring data integrity and linking related records across tables



Q53: What is the primary purpose of the SELECT statement in SQL?

Answer: To retrieve data from one or more tables



Q54: Query for desserts under 30 mins in 'Recipes'?

Answer: SELECT RecipeName...Category = 'Dessert' AND PrepTime < 30;



Q55: What starts a single-line comment in SQL?

Answer: --



Q56: Which query returns all information from users table?

Answer: SELECT * FROM users



Q57: Which of the following is the a multi-line comment?

Answer: /* -- -- / * * / */



    /*Q58: Which query finds rows where country_code is NULL?

    Answer: SELECT id FROM address WHERE country_code IS NULL;



    Q59: Which query excludes rows with NULL address_id?

    Answer: SELECT * FROM plan WHERE address_id IS NOT NULL;



    Q60: Which statement best describes the AND operator in SQL?

    Answer: Returns true only if all conditions are true



    Q61: Select cars not from 2022 and made before 2015.

    Answer: SELECT * WHERE NOT (year = 2022 OR year >= 2015);



    Q62: What does the ORDER BY clause default to when not specified?

    Answer: Sorts in ascending order



    Q63: How to sort books by author name alphabetically, then by publication year?

    Answer: ...ORDER BY author ASC, year ASC;



    Q64: What does the following SQL query return? SELECT MIN(salary) FROM employees;

    Answer: The lowest salary in the employees table



    Q65: The SQL query SELECT MAX(salary) FROM employees; is used to:

    Answer: Determine the highest salary



    Q66: What result is expected from SELECT COUNT(*) FROM employees WHERE department = 'HR';?

    Answer: The number of employees in the HR department



    Q67: The purpose of SELECT AVG(salary) FROM employees WHERE department = 'Sales'; is to:

    Answer: Determine the average salary in Sales department



    Q68: SELECT SUM(salary) FROM employees; calculates:

    Answer: The total sum of salaries for all employees



    Q69: Which query counts employees named 'John'?

    Answer: SELECT COUNT(name) FROM employees WHERE first_name='John';



    Q70: Which query sums salaries over 50k?

    Answer: SELECT SUM(salary) FROM employees WHERE salary > 50000;
     */
}
