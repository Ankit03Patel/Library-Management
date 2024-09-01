This project is a simple Library Management System implemented in Java. It allows users to:

- **Add Books:** Add new books to the library with details like ISBN, title, author, and publication year.
- **Borrow Books:** Borrow books if they are available, updating the library's records accordingly.
- **Return Books:** Return borrowed books, making them available for others.
- **View Available Books:** List all the books currently available in the library.

The project follows Test-Driven Development (TDD) principles, ensuring high code quality and comprehensive test coverage.

## Setup Instructions

### Prerequisites

Before you begin, ensure you have the following installed:

- **Visual Studio Code**
- **Extension pack for java**(Install the plug in)
- **Git**((for version control))

### Project Setup

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
   cd Library_Management_System

   ```

2. **Open the project in VSCode:**

   - Launch VSCode.
   - Open the project folder (`Library_Management_System`) you just cloned.

## Running Tests

### Running Unit Tests in VSCode

To run the tests:

1. **Enable java tests**

   - Go to Testing Option (from sidebar), enable java tests and use junit jupiter.

2. **Run the tests:**

   - You should see a "Run Test" or "Debug Test" option above each test method. Click on "Run Test" to execute the test.

#### Design Decisions

## Project Structure

- **src/**
  - **main/**
    - **java/**
      - **Library.java**: Implementation of the Library class
      - **Book.java**: Implementation of the Book class
  - **test/**
    - **java/**
      - **LibraryTest.java**: Test cases for the Library functionality
- **README.md**: Project documentation


### **Test-Driven Development (TDD):**

- All features were developed following TDD practices. Tests were written before the implementation, ensuring each functionality is covered by tests.
- **SOLID Principles:** The code is designed with SOLID principles in mind, making it easy to maintain, extend, and refactor.
- **Modular Structure:** The code is organized into separate classes (`Library`, `Book`) to ensure clear separation of concerns and improve readability.
