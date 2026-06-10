# 🚀 Spring Boot User CRUD Application (JSP)

A simple User Management System built using Spring Boot, JSP, Spring MVC, and Spring Data JPA. This project demonstrates complete CRUD (Create, Read, Update, Delete) operations with a layered architecture.

---

## 📌 Features

✅ Add New User

✅ View All Users

✅ Update Existing User

✅ Delete User

✅ Spring MVC Architecture

✅ Service Layer Implementation

✅ Spring Data JPA

✅ JSP View Pages

✅ MySQL Database Integration

---

## 🛠️ Tech Stack

| Technology | Used |
|------------|------|
| Java | 17 |
| Spring Boot | 3.x |
| Spring MVC | ✔ |
| Spring Data JPA | ✔ |
| JSP | ✔ |
| Maven | ✔ |
| MySQL | ✔ |
| Eclipse IDE | ✔ |

---

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── UserController.java
│
├── service
│   ├── UserService.java
│   └── UserServiceImpl.java
│
├── dao
│   └── UserDao.java
│
├── model
│   └── User.java
│
└── UserCrudApplication.java

src/main/webapp
└── WEB-INF
    └── views
        ├── index.jsp
        └── edit.jsp
```

---

## 🗄️ Database Configuration

Update your `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ⚙️ How To Run

### Clone Repository

```bash
git clone https://github.com/gauri04k/springboot-user-crud-jsp.git
```

### Move Into Project

```bash
cd springboot-user-crud-jsp
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

---

## 🌐 Application URL

```text
http://localhost:8080/
```

---

## 📸 Screenshots

### Home Page

(Add Screenshot Here)

![Home Page](screenshots/home.png)

---

### Edit User Page

(Add Screenshot Here)

![Edit User](screenshots/edit.png)

---

## 🎯 Learning Outcomes

- Spring Boot Project Setup
- MVC Architecture
- Dependency Injection
- Spring Data JPA
- JSP Integration with Spring Boot
- CRUD Operations
- MySQL Database Connectivity

---

## 👨‍💻 Author

**Gauri Kapadnis**

Final Year B.Tech Student

Java Full Stack Developer

GitHub:
https://github.com/gauri04k

---

## ⭐ If you found this project useful

Give this repository a Star ⭐
