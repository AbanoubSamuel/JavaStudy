# Core Java Study Project

This repository contains various topics and concepts related to Core Java. Each topic is organized into its own folder, and the project is structured to help you study and practice these concepts.

## Project Structure

The project is divided into the following folders:

- **collections**: Examples and exercises on Java Collections Framework (List, Set, Map, etc.).
- **core**: Core Java fundamentals such as data types, control structures, and basic I/O.
- **dsa**: Data Structures and Algorithms implementations and practice.
- **exceptions**: Handling exceptions and creating custom exceptions in Java.
- **generics**: Understanding and using Java Generics.
- **oop**: Object-Oriented Programming principles such as inheritance, polymorphism, encapsulation, and abstraction.
- **patterns**: Design Patterns in Java (Singleton, Factory, Observer, etc.).
- **ps**: Problem-solving exercises and coding challenges.

## Setup and Usage

This project uses Maven for build and dependency management. The code is based on Java 21 LTS.

### Prerequisites

- **Java JDK 21**: Ensure you have Java JDK 21 LTS installed.
- **Maven**: Make sure Maven is installed and configured on your system.

### Cloning the Repository

```bash
git clone git@github.com:AbanoubSamuel/JavaStudy.git
cd JavaStudy
```
### Building the Project

```bash
mvn clean install
```
### Running a Specific Module

```bash
mvn exec:java -Dexec.mainClass="package.path.MainClass"
```
### Running Tests

```bash
mvn test
```

### Clean the project

```bash
mvn clean
```

### Package the project

```bash
mvn package
```

### Install dependencies

```bash
mvn dependency:resolve
```