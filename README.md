# Student Management System

A Java application for managing student records with custom validation and exception handling. This system allows for adding and displaying student information while ensuring data validity through custom exceptions.

## Features

- Add students with validation for all fields
- Display all student records
- Custom exception handling for data validation
- Support for multiple branches (CSE, AIML, ENTC, MECH, CIVIL)

## Project Structure

```
Assignment8/
├── Main.java                       # Entry point with console interface
├── Student.java                    # Student entity class with validation
├── StudentOperations.java          # Operations/management for student records
├── exceptions/                     # Custom exceptions package
│   ├── InvalidBranchException.java
│   ├── InvalidCGPAException.java
│   ├── InvalidNameException.java
│   ├── InvalidPRNException.java
│   ├── StudentAlreadyExistsException.java
│   └── StudentNotFoundException.java
└── .gitignore                      # Git ignore file for Java binaries
```

## Validation Rules

- **Name**: Cannot be null or empty
- **PRN**: Must be 11 digits and positive
- **CGPA**: Must be between 0 and 10
- **Branch**: Must be one of: CSE, AIML, ENTC, MECH, CIVIL

## How to Compile

```bash
javac *.java exceptions/*.java
```

## How to Run

```bash
java Main
```

## Usage

1. Enter the number of students you want to add
2. For each student, provide:
   - Name
   - PRN (11-digit number)
   - CGPA (between 0 and 10)
   - Branch (one of the valid options)
3. If any input is invalid, you'll be prompted to re-enter that student's information
4. After all students are added, the program will display all student records

## Requirements

- Java Development Kit (JDK) 8 or higher

## Future Enhancements

- Student record persistence to file/database
- Search functionality
- Update and delete operations
- Graphical user interface