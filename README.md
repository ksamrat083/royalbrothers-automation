# Royal Brothers Automation Assignment

## 📌 Project Overview
This project automates the bike booking flow on **https://www.royalbrothers.com/**
using **Java + Playwright + Cucumber (BDD)** with **Maven**.

The automation covers:
- City selection (dynamic)
- Date & time selection
- Search validation
- Location filter validation
- Data extraction and assertion

---

## 🛠 Tech Stack
- **Language:** Java
- **Automation Tool:** Playwright
- **BDD Framework:** Cucumber
- **Build Tool:** Maven
- **Assertions:** JUnit
- **IDE:** VS Code

---

## 📁 Project Structure

royalbrothers-automation/
│
├── pom.xml
│
├── src
│ └── test
│   └──java
│     ├── base
│     │ └── PlaywrightFactory.java
│     ├── runner
│     │ └── TestRunner.java
│     ├── stepdefinitions
│     │ └── BookingSteps.java
│
├── resources
│ └── features
│  └── booking.feature


---

## 🚀 Features Automated
- Navigate to Royal Brothers website
- Select city dynamically
- Select pickup and drop date & time
- Validate applied date & time filter
- Apply location filter dynamically
- Collect bike data:
  - **Bike Model**
  - **Available At**
- Validate all bikes belong to selected location
- Print extracted data in console

---

## ⚙️ Prerequisites
- Java 11 or higher
- Maven installed
- VS Code with:
  - Extension Pack for Java
  - Maven for Java

---

## 🔧 Setup Instructions

### 1️⃣ Clone / Open Project
Open the project root folder (where `pom.xml` exists) in VS Code.

---

### 2️⃣ Install Playwright Browsers (One-Time)
Run in VS Code terminal:

```bash
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```
3️⃣ Download Dependencies
```
mvn clean install
```

▶️ How to Run Tests
Option 1: Run via Maven (Recommended)
```
mvn test
```

Option 2: Run via VS Code

Open TestRunner.java

Click Run


✅ Validations Covered

-> Page navigation validation
-> Date & time filter visibility
-> Location filter applied correctly
-> All bike results belong to selected location
-> Assertions added for all validations
-> No try/catch blocks used

🧪 Sample Console Output
Bike Model: Royal Enfield Classic 350
Available At: Indiranagar
--------------------------
Bike Model: Honda Activa 6G
Available At: Indiranagar
--------------------------

📌 Notes
```
All inputs (city, date, time, location) are dynamic
Playwright auto-wait is used (no Thread.sleep)
BDD approach followed using Cucumber feature files
```

👨‍💻 Author
Samrat Kavide
