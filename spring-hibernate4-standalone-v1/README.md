# Introduction
Showing Spring + Hibernate 4 integration of Standalone application

- How to use:
    + Build: mvn clean install
    + Start: 
        * Jetty:    mvn jetty:run
        * Tomcat:   mvn tomcat7:run

- Simple Model: Student
    + Name
    + Email
- Simple functions:
    + List all students: http://localhost:8080/spring-hibernate4-standalone-v01/students 
    + Add new student: http://localhost:8080/spring-hibernate4-standalone-v01/students/new
    + View Detail student: http://localhost:8080/spring-hibernate4-standalone-v01/students/1
    + Update existing student: http://localhost:8080/spring-hibernate4-standalone-v01/students/1/update
    + Delete existing student
    
    
# Hibernate Configuration

- dataSource: Using org.apache.commons.dbcp2.BasicDataSource as ConnectionPool
- sessionFactory: Using Hibernate Connection factory that corresponds to persistence technology (Hibernate4 for this case)
    + org.springframework.orm.hibernate4.LocalSessionFactoryBean

- transactionManager:
    + Enable transaction manager: tx:annotation-driven 
    + org.springframework.orm.hibernate4.HibernateTransactionManager