# Introduction
Showing Spring + Hibernate 4 integration of application in Managed Environment

- How to use:
    + Build: mvn clean install
    + Deploy to application server (JBOSS 7.1)

- Simple Model: Student
    + Name
    + Email
- Simple functions:
    + List all students: http://localhost:8080/spring-hibernate4-managed-env-v01/students 
    + Add new student: http://localhost:8080/spring-hibernate4-managed-env-v01/students/new
    + View Detail student: http://localhost:8080/spring-hibernate4-managed-env-v01/students/1
    + Update existing student: http://localhost:8080/spring-hibernate4-managed-env-v01/students/1/update
    + Delete existing student
    
    
# Hibernate Configuration

- dataSource: Using org.springframework.jndi.JndiObjectFactoryBean
    + Change: jndiName = java:jboss/datasources/deeDS that is created in Application Server
- sessionFactory: Using Hibernate Connection factory that corresponds to persistence technology (Hibernate4 for this case)
    + org.springframework.orm.hibernate4.LocalSessionFactoryBean

- transactionManager:
    + Enable transaction manager: tx:annotation-driven 
    + org.springframework.transaction.jta.JtaTransactionManager