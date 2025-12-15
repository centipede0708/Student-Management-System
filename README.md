# Student Management System (JDBC + MySQL)

A console-based **Student Management System** built using **Core Java, JDBC, and MySQL**.  
The project demonstrates clean JDBC architecture, database connectivity without Maven, and full CRUD operations on a relational database.

---

## 🚀 Features
- Add new student records
- View all students
- Update student marks
- Delete student records
- Uses **PreparedStatement** to prevent SQL injection
- Clean separation using **Model–DAO–Utility** pattern
- Manual JDBC driver management (no Maven)

---

## 🛠 Tech Stack
- **Java (Core Java)**
- **JDBC**
- **MySQL 9.x**
- **MySQL Connector/J**
- IDE: VS Code / IntelliJ / Eclipse

---

## 📁 Project Structure
<img width="478" height="632" alt="image" src="https://github.com/user-attachments/assets/780f6d0e-b440-4dd9-b381-76f55f3f783e" />


private static final String URL =
"jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
private static final String USER = "root";
private static final String PASS = "your_password";
