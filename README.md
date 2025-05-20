# 🏫 Spring ORM Concel Based Application

This is a simple **Student Management System** built using **Spring ORM** and **Hibernate**, allowing users to perform CRUD (Create, Read, Update, Delete) operations on student records.

---

## 📌 Features

- ➕ Add a new student
- 🔍 Fetch student details by ID
- 📋 View all students
- ❌ Delete a student by ID
- 🔄 Update student information

---

## 🛠️ Technologies Used

- Java
- Spring Core
- Spring ORM
- Hibernate
- MySQL (or any other relational DB)
- Maven (for dependency management)
- XML-based configuration

---

## 🗃️ Database Table

Make sure you have a table in your database like below:

```sql
CREATE TABLE Student_details (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept VARCHAR(50)
);

```

---

## ⚙️ How to Run
## 📥 Clone this repository

```
git clone https://github.com/your-username/spring-orm-student-app.git
cd spring-orm-student-app

```
---


💾 Set up your MySQL database and create the required table.



## 🧾 Configure your database connection in config.xml:


```
<property name="hibernateProperties">
    <props>
        <prop key="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</prop>
        <prop key="hibernate.connection.username">your_username</prop>
        <prop key="hibernate.connection.password">your_password</prop>
        ...
    </props>
</property>

```
📦 Run the Main.java file from your IDE (e.g., IntelliJ or Eclipse).


## 🧪 Sample Run

***** Welcome to Student ORM App *****
-  Add Student
-  Get Student by ID
-  Get All Students
-  Delete Student
-  Update Student
-  Exit


## 📌 Author
- Rajni
- Backend Developer | Java Enthusiast


