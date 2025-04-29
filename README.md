# Student Course Registration System

A simple Java-based Student Registration System using JDBC and MySQL to register students and manage course enrollments.

---

# Features

- Student Registration
- Course Creation
- Course Enrollment
- MySQL Database Integration
- JDBC Connectivity

---

# Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA / Eclipse

---
# Project Structure

  StudentCourseRegistrationSystem/ │ ├── src/ │ ├── CourseDAO.java │ ├── DatabaseConnection.java │ ├── Main.java │ ├── RegistrationDAO.java │ └── StudentDAO.java │ ├── sql/ │ └── database_setup.sql │ ├── screenshots/ │ ├── database-tables.png │ └── console-output.png │ ├── config.properties └── README.md

---

## 🧰 Setup Instructions

1. **Clone the repository**
```bash
git clone https://github.com/Gagant23/StudentCourseRegistrationSystem.git
cd StudentCourseRegistrationSystem

2. **Import the project into your IDE (IntelliJ or Eclipse)**
   - Make sure the `src` folder is marked as the source root.

3 Set up MySQL database

  Create a database and run the script from sql/database_setup.sql.

4 Configure DB connection

  Edit config.properties with your DB username and password.

5 Run Main.java to start the application
