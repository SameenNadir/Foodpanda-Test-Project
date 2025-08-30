# 🍔 Foodpanda QA Test Project

**Purpose:** A professional QA portfolio project demonstrating manual and automation testing on Foodpanda-like flows.  
This repository contains structured manual test cases, professional bug reports, and a Selenium Java automation project with modular test methods.

**Contents**
- `TestCases.md` — 12+ manual test cases (Pass / Fail).
- `BugReports.md` — Professional bug reports with severity and reproduction steps.
- `src/com/foodpanda/tests/FoodpandaAutomation.java` — Selenium Java script (modular methods):
  - `testLogin()`
  - `testSearch()`
  - `testOrderFlow()`
- `.gitignore` — to avoid committing build artifacts or credentials.

**How to run (local machine)**
1. Install Java JDK (8+) and Maven or use your IDE (IntelliJ/Eclipse).
2. Install Chrome browser and download ChromeDriver matching your Chrome version.
3. Place `chromedriver` in `drivers/` folder (path: `drivers/chromedriver.exe` for Windows or `drivers/chromedriver` for macOS/Linux).
4. Open the project in your IDE and run `FoodpandaAutomation` (or compile & run via `javac`/`java`).

**Notes & Safety**
- The automation uses **dummy credentials** (testuser@example.com / test123) — do NOT use real account credentials.
- The script uses a relative driver path: `drivers/chromedriver.exe` — update it as needed for your OS.
- This project is for learning and portfolio purposes only.

**Contact**
- LinkedIn: https://www.linkedin.com/in/your-handle
- GitHub: https://github.com/your-handle