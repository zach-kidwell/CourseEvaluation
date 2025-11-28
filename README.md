***Course Evaluation System***

A polished, full-stack Java web application that demonstrates building a course evaluation platform using JSF for the frontend, JDBC for data access, and MySQL as the persistence layer. This repository contains the application source, the database schema, and instructions to run the project locally or deploy to a Jakarta EE/Tomcat server.

**Table of Contents**
- [Demo](#demo)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Configuration](#configuration)

## Features

- Clean JSF-based survey UI with server-side validation
- JDBC data access using prepared statements (prevents SQL injection)
- DAO-style architecture for separation of concerns
- Full CRUD for surveys, submissions, and summaries
- MySQL schema included for easy setup (`courseevaluation.sql`)

## Tech Stack

- Java (JDK 8+ recommended)
- JavaServer Faces (JSF)
- JDBC (PreparedStatement)
- MySQL
- Maven
- Tomcat / Jakarta EE compatible server

## Project Structure

```
/src
  /controller   - JSF managed beans and controllers
  /dao          - Data access objects (JDBC)
  /model        - POJOs / domain models
  /webapp       - JSF XHTML pages, resources
courseevaluation.sql - Database schema and seed data
```

## Database Schema

The repository includes `courseevaluation.sql`, the SQL script used to create the `course_evaluation` database and the `evaluation` table that stores each completed survey.

You can import it with the MySQL client:

```sql
-- Author: Zach Kidwell

-- Drop old db (for testing)
DROP DATABASE IF EXISTS course_evaluation;
CREATE DATABASE course_evaluation;
USE course_evaluation;

-- Table: evaluation
-- Purpose: Stores all survey responses for each student
-- Each record corresponds to one completed evaluation form.

CREATE TABLE evaluation (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'Unique evaluation ID',
    q1 VARCHAR(10) COMMENT 'Instructor stimulated interest in the subject',
    q2 VARCHAR(10) COMMENT 'Instructor managed time and pace well',
    q3 VARCHAR(10) COMMENT 'Instructor was organized and prepared',
    q4 VARCHAR(10) COMMENT 'Instructor encouraged discussions',
    q5 VARCHAR(10) COMMENT 'Instructor demonstrated knowledge',
    q6 VARCHAR(10) COMMENT 'Instructor appeared enthusiastic',
    q7 VARCHAR(10) COMMENT 'Instructor used various teaching methods',
    q8 VARCHAR(10) COMMENT 'Instructor challenged students to do their best',
    q9 VARCHAR(10) COMMENT 'Instructor was accessible outside class',
    q10 VARCHAR(10) COMMENT 'Instructor prevented cheating',
    c2 VARCHAR(255) COMMENT 'Comments on Teaching Approaches',
    q11 VARCHAR(10) COMMENT 'Assessment info communicated clearly',
    q12 VARCHAR(10) COMMENT 'Feedback provided on time',
    q13 VARCHAR(10) COMMENT 'Feedback helped improve work',
    c3 VARCHAR(255) COMMENT 'Comments on Feedback and Assessment',
    q14 VARCHAR(10) COMMENT 'Course supported by library resources',
    q15 VARCHAR(10) COMMENT 'Blackboard resources were useful',
    q16 VARCHAR(10) COMMENT 'Instructor guided on finding resources',
    c4 VARCHAR(255) COMMENT 'Comments on Resources and Administration',
    q17 VARCHAR(10) COMMENT 'Syllabus explained at start',
    q18 VARCHAR(10) COMMENT 'Course delivered as outlined',
    q19 VARCHAR(10) COMMENT 'Grading criteria explained',
    q20 VARCHAR(10) COMMENT 'Exams related to learning outcomes',
    q21 VARCHAR(10) COMMENT 'Projects related to learning outcomes',
    c5 VARCHAR(255) COMMENT 'Comments on Additional Questions',
    q22 VARCHAR(10) COMMENT 'Course was worthwhile',
    q23 VARCHAR(10) COMMENT 'Would recommend to other students',
    q24 VARCHAR(10) COMMENT 'Overall rating of experience',
    q25 VARCHAR(10) COMMENT 'Hours spent per week on homework',
    c6 VARCHAR(255) COMMENT 'Comments on Overall Experience',
    q26 VARCHAR(10) COMMENT 'Contributed constructively during class',
    q27 VARCHAR(10) COMMENT 'Achieved learning outcomes',
    s_best VARCHAR(255) COMMENT 'What student liked best',
    s_least VARCHAR(255) COMMENT 'What student liked least',
    i_changes VARCHAR(255) COMMENT 'Recommended changes',
    i_more VARCHAR(255) COMMENT 'Additional comments'
);
```

## Getting Started

### Prerequisites

- Java JDK (8 or later)
- Maven
- MySQL server
- Tomcat / Jakarta EE server (for deployment)

### Quick setup

1. Clone the repository:

```bash
git clone <repo-url>
cd <repo-folder>
```

2. Create the database and import schema:

```bash
mysql -u <user> -p
CREATE DATABASE course_evaluation;
USE course_evaluation;
SOURCE courseevaluation.sql;
```

3. Configure database credentials (see Configuration below).
4. Build the project with Maven:

```bash
mvn clean package
```

5. Deploy the generated WAR to Tomcat (or run via your IDE).

## Configuration

- Update the database connection settings in `DBConnection.java` (or externalize to a properties file / environment variables):

```
DB_URL, DB_USER, DB_PASSWORD
```

Tip: For production deployments, prefer environment variables or a container-managed datasource.

## Running the App (IDE)

- Import the project as a Maven project in your IDE (IntelliJ/Eclipse).
- Ensure the server runtime (Tomcat) is configured and run the application.

## Contributing

- Fork the repo and open a pull request with descriptive changes.
- Follow the existing code style and include tests where appropriate.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---
