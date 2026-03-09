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

# README

## Java I/O

The purpose of this exercise set is to practice core **Java Input/Output (I/O)** operations, file handling, and basic programming structures.  
It covers reading from standard input, file manipulation (reading/writing), and exception handling.

---

## Table of Contents

| Section | Folder/File | Description |
|------:|-------------|-------------|
| 1 | `INSTALL.md` | Installation and execution instructions |
| 2 | `README.md` | Project overview and usage guide |
| 3 | `assign/` | Assignment description documents |
| 3.1 | `assign/SDM Exercise 2 (Input & Output).pdf` | Assignment description (English) |
| 3.2 | `assign/ΜΑΕ Ασκήση 2 (Input & Output).pdf` | Assignment description (Greek) |
| 4 | `src/` | Java source code projects demonstrating input/output operations |
| 4.1 | `src/CopyFiles/` | Java project for copying the contents of files |
| 4.1.1 | `src/CopyFiles/build/` | Compiled build output |
| 4.1.2 | `src/CopyFiles/build.xml` | Apache Ant build configuration |
| 4.1.3 | `src/CopyFiles/manifest.mf` | Application manifest file |
| 4.1.4 | `src/CopyFiles/myfile.txt` | Example input file |
| 4.1.5 | `src/CopyFiles/myfile2.txt` | Example output/second file |
| 4.1.6 | `src/CopyFiles/nbproject/` | NetBeans project configuration files |
| 4.1.7 | `src/CopyFiles/src/copyfiles/` | Java source code package |
| 4.2 | `src/CountStatistics/` | Java project that calculates statistics from file data |
| 4.2.1 | `src/CountStatistics/build/` | Compiled build output |
| 4.2.2 | `src/CountStatistics/build.xml` | Apache Ant build configuration |
| 4.2.3 | `src/CountStatistics/manifest.mf` | Application manifest file |
| 4.2.4 | `src/CountStatistics/myfile.txt` | Example input file |
| 4.2.5 | `src/CountStatistics/nbproject/` | NetBeans project configuration files |
| 4.2.6 | `src/CountStatistics/src/countstatistics/` | Java source code package |
| 4.3 | `src/Fibonacci/` | Java project that generates Fibonacci numbers and writes them to a file |
| 4.3.1 | `src/Fibonacci/build/` | Compiled build output |
| 4.3.2 | `src/Fibonacci/build.xml` | Apache Ant build configuration |
| 4.3.3 | `src/Fibonacci/manifest.mf` | Application manifest file |
| 4.3.4 | `src/Fibonacci/fib50.txt` | Example file containing Fibonacci numbers |
| 4.3.5 | `src/Fibonacci/nbproject/` | NetBeans project configuration files |
| 4.3.6 | `src/Fibonacci/src/fibonacci/` | Java source code package |
| 4.4 | `src/ScannerExercise/` | Java project demonstrating the use of the `Scanner` class |
| 4.4.1 | `src/ScannerExercise/build/` | Compiled build output |
| 4.4.2 | `src/ScannerExercise/build.xml` | Apache Ant build configuration |
| 4.4.3 | `src/ScannerExercise/manifest.mf` | Application manifest file |
| 4.4.4 | `src/ScannerExercise/nbproject/` | NetBeans project configuration files |
| 4.4.5 | `src/ScannerExercise/src/scannerexercise/` | Java source code package |

---

## 1. Key Subjects Covered

- **Data Reading:** Handling bytes and characters from standard input.
- **File Streams:** Utilizing `FileStreams` for read/write operations.
- **Exception Handling:** Managing runtime errors using `try-catch` blocks.
- **Logic Structures:** Implementing `if-else` and `while` loops.
- **String & Scanner:** String manipulation and using the `Scanner` class.

---

## 2. Exercises Description

### 2.1: Student Grade Processor

Create a console program that calculates the **average grade for students** based on standard input.

#### 2.1.1 Input Format
- Student registration number followed by pairs of:  
  `[Course Name] [Grade]`

#### 2.1.2 Termination Rules
- Enter `end` to finish entering grades for a specific student.
- Enter `000000` as a registration number to **exit the program**.

#### 2.1.3 Output
- Prints the **student registration number** and their **calculated average grade**.

### 2.2: File Copy Utility

Develop a program that **copies the contents of one text file to another**.

#### 2.2.1 Process
- The user provides:
  - The **full path of the source file**
  - The **destination (copy) file path**

#### 2.2.2 Implementation Note
- Use `FileWriter` and `FileReader` wrapped in **Buffered Streams** for better efficiency.

#### 2.2.3 Error Handling
- Use `try-catch` blocks to handle:
  - Invalid file paths
  - Missing files
  - Read/write errors

### 2.3: Text Statistics Analyzer

A program that **reads a text file, displays its content, and calculates specific character statistics**.

#### 2.3.1 Statistics Tracked

- **Greek characters:**
  - Alpha (Α, α)
  - Gamma (Γ, γ)
  - Omega (Ω, ω)

- **Odd digits:**
  - `1, 3, 5, 7, 9`

#### 2.3.2 Implementation Tip
Use the `read()` method to process the file **character by character**.

### 2.4: Fibonacci Sequence to File

This program calculates the **first 50 terms of the Fibonacci sequence** and saves them to a text file.

#### 2.4.1 File Format

Each term should appear on a **new line**:
```bash
F(0) = 0
F(1) = 1
F(2) = 1
...
```

#### 2.4.2 Phase 2
Include an additional method that:
1. Reads the generated Fibonacci file.
2. Prints **only the numerical values** to the console.