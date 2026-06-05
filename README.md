# 📦 File Compression Simulator

![Java](https://img.shields.io/badge/Java-17-orange)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue)
![Status](https://img.shields.io/badge/Project-Completed-green)

A console-based Java application that simulates file compression and decompression using the Run-Length Encoding (RLE) algorithm.

---

## 📸 Project Preview

### Compression Process

```text
Original String
     │
     ▼
  aaaabbc
     │
     ▼
Compression (RLE)
     │
     ▼
  a4b2c1
     │
     ▼
Decompression
     │
     ▼
  aaaabbc
```

---

## 🚀 Features

✅ User Input Handling

✅ String Compression

✅ String Decompression

✅ Validation of Output

✅ Object-Oriented Design

✅ StringBuilder Optimization

---

## 🛠 Technologies Used

| Technology    | Purpose                       |
| ------------- | ----------------------------- |
| Java          | Programming Language          |
| OOP           | Project Structure             |
| Scanner       | User Input                    |
| StringBuilder | Efficient String Manipulation |

---

## 📊 Compression Example

| Original  | Compressed |
| --------- | ---------- |
| aaaabbc   | a4b2c1     |
| aaaaaa    | a6         |
| aaabbbccc | a3b3c3     |

---

## 📈 Compression Ratio Example

Compression Efficiency for Sample Inputs

```text
Input        Original Size    Compressed Size
--------------------------------------------
aaaabbc           7                 6
aaaaaa            6                 2
aaabbbccc         9                 6
```

---

## 📊 Sample Chart

---

## 📂 Project Structure

```text
FileCompressionSimulator/
│
├── CompressionDemo.java
├── README.md
└── screenshots/
    ├── input.png
    ├── output.png
    └── flowchart.png
```

---

## ▶️ How to Run

Compile:

```bash
javac CompressionDemo.java
```

Run:

```bash
java CompressionDemo
```

---

## 🖥 Sample Output

```text
Enter String: aaaabbc

===== FILE COMPRESSION SIMULATOR =====

Original String     : aaaabbc
Compressed String   : a4b2c1
Decompressed String : aaaabbc

Status: Decompression Successful!
```

---

## 🔄 Algorithm Used

### Run-Length Encoding (RLE)

RLE replaces consecutive repeating characters with:

Character + Frequency

Example:

```text
aaaabbc

↓

a4b2c1
```

---

## 📚 OOP Concepts Demonstrated

* Classes and Objects
* Methods
* Encapsulation
* String Manipulation
* Loops
* Conditional Statements
* StringBuilder

---

## 🔮 Future Enhancements

* File Handling Support
* GUI Version using Java Swing
* Compression Ratio Calculator
* Support for Special Characters
* Menu Driven Program
* Invalid Input Handling

---
Java Mini Project – File Compression Simulator
