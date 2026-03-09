<p align="center">
  <img src="https://www.especial.gr/wp-content/uploads/2019/03/panepisthmio-dut-attikhs.png" alt="University of West Attica" width="150"/>
</p>

<p align="center">
  <strong>UNIVERSITY OF WEST ATTICA</strong><br/>
  SCHOOL OF ENGINEERING<br/>
  DEPARTMENT OF COMPUTER ENGINEERING AND INFORMATICS
</p>

<p align="center">
  <a href="https://www.uniwa.gr" target="_blank">University of West Attica</a> ·
  <a href="https://ice.uniwa.gr" target="_blank">Department of Computer Engineering and Informatics</a>
</p>

<hr/>

<p align="center">
  <strong>Software Development Methodologies</strong>
</p>

<h1 align="center" style="letter-spacing: 1px;">
  Java I/O
</h1>

<p align="center">
  <strong>Vasileios Evangelos Athanasiou</strong><br/>
  Student ID: 19390005
</p>

<p align="center">
  <a href="https://github.com/Ath21" target="_blank">GitHub</a> ·
  <a href="https://www.linkedin.com/in/vasilis-athanasiou-7036b53a4/" target="_blank">LinkedIn</a>
</p>

<hr/>

<p align="center">
  <strong>Supervision</strong>
</p>

<p align="center">
  Supervisor: Georgios Prezerakos, Professor
</p>
<p align="center">
  <a href="https://ice.uniwa.gr/en/emd_person/george-prezerakos/" target="_blank">UNIWA Profile</a> ·
  <a href="https://www.linkedin.com/in/georgenprezerakos/" target="_blank">LinkedIn</a>
</p>

<p align="center">
  Co-supervisor: Angelos Georgoulas, Assistant Professor<br>
</p>

<p align="center">
  <a href=https://scholar.google.com/citations?user=Djium2IAAAAJ&hl=en" target="_blank">Scholar</a> ·
  <a href="https://www.linkedin.com/in/aggelos-georgoulas/?originalSubdomain=uk" target="_blank">LinkedIn</a>
</p>

</hr>

---

<p align="center">
  Athens, April 2023
</p>

---

<p align="center">
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20191126125125/Java-Input-Output-Stream.jpg" width="250"/>
</p>

---

# INSTALL

## Java I/O

This guide explains how to set up, build, and run the project on your local machine.

---

## 1. Prerequisites

Before you begin, ensure the following software is installed on your system:

- **Java Development Kit (JDK):** Version 8 or higher is recommended.
- **Integrated Development Environment (IDE):**  
  NetBeans is recommended for this course. However, any simple editor such as **VS Code** or **Notepad++** can also be used.

---

## 2. Project Structure

Organize your project so that each exercise corresponds to a separate program.

### 2.1 Exercises Included
- **Exercise 2.1:** Standard Input/Output logic (student grades).
- **Exercise 2.2:** File Copying utility.
- **Exercise 2.3:** Character statistics analyzer.
- **Exercise 2.4:** Fibonacci generator and reader.

---

## 3. Building the Project

### 3.1 Using NetBeans
1. Create a new **Java Ant Project**
2. Copy the source code into the generated `.java` files.
3. Click the **Clean and Build** button (hammer and broom icon).

---

## 4. Using Command Line

Navigate to the project directory and compile all Java files:
```bash
javac *.java
```

---

## 5. Running the Exercises
Each exercise can be executed independently from the command line.

| Exercise           | Run Command           | Expected Input                                               |
|--------------------|-----------------------|--------------------------------------------------------------|
| 2.1 – Grades       | java GradeProcessor   | Student ID, Course Name, Grade (type 000000 to exit)        |
| 2.2 – Copy         | java FileCopy         | Source file path and destination file path                  |
| 2.3 – Stats        | java FileStats        | Full path of the text file to analyze                       |
| 2.4 – Fibonacci    | java FibonacciTask    | No input required (file generated automatically)            |

---

## 6. Development Notes

### 6.1 NetBeans Users
If text files are located in the Project Root directory, only the filename needs to be provided.

Example:
```bash
input.txt
```

### 6.2 Editor Users
If files are located in the same folder as the `.class` files, the filename alone is sufficient.

---

## 7. Exception Handling
- The programs rely on exception handling rather than pre-validating file paths.
- If a file cannot be found, the program will display a clear error message in the console.

Example:
```bash
Error: File not found
```

---

## 8. Character Encoding
For Exercise 2.3, ensure the text file encoding supports Greek characters, including:
```bash
Alpha (Α, α)

Gamma (Γ, γ)

Omega (Ω, ω)
```

Using UTF-8 encoding is recommended to ensure accurate character statistics.