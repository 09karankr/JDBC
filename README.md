# JDBC Demo with PostgreSQL

This project demonstrates how to connect a Java application to a PostgreSQL database using JDBC and perform an `INSERT` operation.

## Prerequisites

- Java Development Kit (JDK) installed
- PostgreSQL database running
- PostgreSQL JDBC Driver (`org.postgresql.Driver`)
- Database credentials configured

## Setup

1. **Install PostgreSQL** (if not already installed).
2. **Create the Database**:  
   ```sql
   CREATE DATABASE demo;
   ```
3. **Create the Table**:  
   ```sql
   CREATE TABLE student (
       sid INT PRIMARY KEY,
       sname VARCHAR(100),
       marks INT
   );
   ```
4. **Update Database Credentials** in the Java code:
   ```java
   String url = "jdbc:postgresql://localhost:5432/demo";
   String uname = "postgres";
   String pass = "your_password";
   ```

## Running the Code

1. **Compile the Java Program**:
   ```sh
   javac DemoJdbc.java
   ```
2. **Run the Program**:
   ```sh
   java DemoJdbc
   ```

## Explanation of the Code

The program follows these **JDBC steps**:
1. **Import JDBC package**
2. **Load and register the driver**
3. **Establish a connection**
4. **Create a `PreparedStatement`**
5. **Execute the SQL statement**
6. **Process the results** (if applicable)
7. **Close the connection**

## Expected Output

If the program executes successfully, the student record will be inserted into the database. You can verify the data using:
```sql
SELECT * FROM student;
```

## Notes

- The code uses `PreparedStatement` for secure query execution.
- Ensure that the PostgreSQL JDBC driver is available in your classpath.
- Modify database credentials as needed before running the program.

## License

This project is open-source and free to use.

