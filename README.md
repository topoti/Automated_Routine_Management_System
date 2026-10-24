# Automated Routine Management System

A desktop application for managing a university department's class routine. It is built with **JavaFX 8** and uses an embedded **Apache Derby** database. Admins, teachers and students each have their own portal for viewing courses, teachers and the weekly class routine.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Option 1: Run the pre-built JAR](#option-1-run-the-pre-built-jar)
  - [Option 2: Open and run in NetBeans](#option-2-open-and-run-in-netbeans)
  - [Option 3: Build with Apache Ant](#option-3-build-with-apache-ant)
  - [Option 4: Compile and run from the command line](#option-4-compile-and-run-from-the-command-line)
- [How to Use](#how-to-use)
- [Database](#database)
- [Troubleshooting](#troubleshooting)
- [Known Limitations](#known-limitations)

---

## Features

- **Home page** with About, Services and Contact pages
- **Sign up and log in** with a username and password, stored in the database
- **Pick a role** after logging in: Admin, Teacher or Student
- **Admin page**
  - Create, view and modify the routine
  - Manage days, time slots and rooms
  - View departments, courses and teachers
- **Teacher page**: view courses, teachers and the routine
- **Student portal**
  - Register (ID, name, CGPA, contact)
  - Log in with a student ID
  - Student profile with links to courses, teachers and the routine
- **Course browser** covering all 8 semesters (1st year 1st semester → 4th year 2nd semester)
- **Weekly routine view**, Saturday to Wednesday, with time slots from 8:00 to 5:50 and a break

## Tech Stack

| Component     | Technology                                 |
|---------------|--------------------------------------------|
| Language      | Java 8                                     |
| UI            | JavaFX 8 (FXML + controllers)              |
| Database      | Apache Derby 10.12 (embedded mode)         |
| IDE / Build   | NetBeans (JavaFX project), Apache Ant      |

## Project Structure

```
.
├── src/automated/routine/management/system/
│   ├── AutomatedRoutineManagementSystem.java   # Application entry point (loads Main.fxml)
│   ├── *.fxml                                  # UI screens
│   ├── *Controller.java                        # Controller for each screen
│   ├── database/DBConnect.java                 # Derby connection and table setup
│   └── resources/Logo.png
├── Images/logo.png
├── database/                # Embedded Derby database files (do not edit by hand)
├── dist/                    # Pre-built application
│   ├── Automated Routine Management System.jar
│   └── lib/                 # derby.jar, derbyclient.jar
├── build/                   # Compiled classes (generated)
├── nbproject/               # NetBeans project configuration
├── build.xml                # Ant build script
└── manifest.mf
```

### Screens

| Screen (FXML)                     | Purpose                                         |
|-----------------------------------|-------------------------------------------------|
| `Main.fxml`                       | Home page (Home / About / Services / Contact / Login / Sign Up) |
| `Log In.fxml`, `SignUp.fxml`      | User login and registration                     |
| `User_Choice.fxml`                | Choose Admin, Teacher or Student                |
| `AdminPage.fxml`                  | Admin page                                      |
| `TeacherPage.fxml`                | Teacher page                                    |
| `Students.fxml`, `StudentsForm.fxml`, `StudentLogIn.fxml`, `StudentProfile.fxml` | Student portal |
| `Courses.fxml`                    | Semester selector                               |
| `first_first.fxml` … `Fourth_second.fxml` | Course list for each semester           |
| `Routine.fxml`                    | Weekly class routine                            |
| `DayManagement.fxml`, `TimeManagement.fxml`, `RoomManagement.fxml` | Day, time slot and room management |
| `Department.fxml`, `ViewTeachers.fxml` | Department and teacher information         |
| `About.fxml`, `Services.fxml`, `Contact.fxml` | Information pages                   |

## Prerequisites

- **Java 8 with JavaFX included.** JavaFX was removed from the JDK after Java 8, so use one of these:
  - Oracle JDK 8 (JavaFX is built in)
  - [Azul Zulu JDK 8 **FX**](https://www.azul.com/downloads/?version=java-8-lts&package=jdk-fx)
  - [BellSoft Liberica **Full** JDK 8](https://bell-sw.com/pages/downloads/#jdk-8-lts)
- **Apache Derby**: already included in `dist/lib/` (`derby.jar`, `derbyclient.jar`).
- *(Optional)* **NetBeans IDE** with Java SE / JavaFX support, or **Apache Ant**, if you want to rebuild the project.

Check your Java version:

```bash
java -version      # should report 1.8.x
```

## Getting Started

First, clone the repository:

```bash
git clone https://github.com/topoti/Automated_Routine_Management_System.git
cd Automated_Routine_Management_System
```

### Option 1: Run the pre-built JAR

This is the quickest way to start the app. Run the command **from the project root**, so the app finds the existing `database/` folder:

```bash
java -jar "dist/Automated Routine Management System.jar"
```

On Windows you can also double-click the JAR. However, the database is then created next to wherever the JAR was launched from. See [Database](#database).

### Option 2: Open and run in NetBeans

1. Open NetBeans and go to **File → Open Project**.
2. Select the `Automated_Routine_Management_System` folder.
3. **Fix the Derby library paths.** The project was set up with Derby JARs at `C:\Users\walton\Desktop\`, which won't exist on your machine:
   - Right-click the project → **Properties → Libraries**.
   - Remove the broken `derby.jar` and `derbyclient.jar` entries.
   - Click **Add JAR/Folder** and add `dist/lib/derby.jar` and `dist/lib/derbyclient.jar` from this repo.
4. Make sure the project uses a **JDK 8 with JavaFX** (Properties → Libraries → Java Platform).
5. Press **F6** (Run Project).

### Option 3: Build with Apache Ant

After fixing the Derby paths (step 3 above, or by editing `file.reference.derby.jar` and `file.reference.derbyclient.jar` in `nbproject/project.properties`), run:

```bash
ant clean jar     # builds into dist/
ant run           # builds and runs the app
```

### Option 4: Compile and run from the command line

No IDE or Ant is needed. Run these from the project root with a JavaFX-enabled JDK 8.

**Linux / macOS**

```bash
mkdir -p out
javac -cp "dist/lib/derby.jar" -d out $(find src -name "*.java")
cp src/automated/routine/management/system/*.fxml out/automated/routine/management/system/
cp -r src/automated/routine/management/system/resources out/automated/routine/management/system/
java -cp "out:dist/lib/derby.jar" automated.routine.management.system.AutomatedRoutineManagementSystem
```

**Windows (Command Prompt)**

```bat
mkdir out
dir /s /b src\*.java > sources.txt
javac -cp "dist\lib\derby.jar" -d out @sources.txt
xcopy /y src\automated\routine\management\system\*.fxml out\automated\routine\management\system\
xcopy /e /i /y src\automated\routine\management\system\resources out\automated\routine\management\system\resources
java -cp "out;dist\lib\derby.jar" automated.routine.management.system.AutomatedRoutineManagementSystem
```

## How to Use

1. **Start the app.** The home page opens.
2. **Sign up.** Click **Sign Up** and enter a username and password. You'll see "Registration Success." or "Username already taken."
3. **Log in.** Click **Login** and enter the same credentials.
4. **Choose a role** on the "Please Select the user" screen:
   - **Admin** opens the Admin page. Use **CreateRoutine / ModifyRoutine / ViewRoutine** for the routine, **DayManagement / TimeManagement / RoomManagement** for scheduling resources, and **ViewDepartment / ViewCourses / ViewTeachers** for information.
   - **Teacher** opens the Teacher page, with **View Courses**, **View Teachers** and **View Routine**.
   - **Student** opens the student portal:
     1. Enter your year and semester and click **Continue** to open the registration form.
     2. Fill in **ID, name, CGPA and contact** and submit. The data is saved to the `STUDENT` table.
     3. Log in with your **Student ID** to open your profile, then view courses, teachers or the routine.
5. **View courses.** Pick a semester (1st year 1st semester → 4th year 2nd semester) and click **Continue**.
6. **View the routine.** It shows the weekly timetable by day and time slot, for example `CSE3104(RAR)Lab-02`, meaning course code, teacher initials, then room.

## Database

The app uses **embedded Apache Derby**, so there's no separate database server to install or start.

- **Connection URL:** `jdbc:derby:database;create=true`
- **Location:** a folder called `database` **in the current working directory**. If it doesn't exist, it is created automatically on first run.
- **Tables:** created automatically when needed.

| Table       | Columns                                                  | Used by              |
|-------------|----------------------------------------------------------|----------------------|
| `USERTABLE` | `Username` (PK), `Password`                              | Sign up and log in   |
| `TEACHER`   | `id` (PK), `name`, `speciality`, `contact`               | Teacher records      |
| `STUDENT`   | `id` (PK), `name`, `CGPA`, `contact`                     | Student registration |

**Reset the database:** close the app, delete the `database/` folder (and `derby.log`), then start the app again. The tables are recreated empty.

**Inspect the database** with Derby's `ij` tool (included in the full Derby distribution) or any JDBC client, such as DBeaver or the NetBeans *Services → Databases* panel:

```
connect 'jdbc:derby:database';
SELECT * FROM USERTABLE;
```

> Only one process can open an embedded Derby database at a time. Close the app before inspecting the database with another tool.

## Troubleshooting

| Problem | Solution |
|---------|----------|
| `Error: JavaFX runtime components are missing` / `javafx.application.Application` not found | You're running Java 9+ or a JDK without JavaFX. Install one of the JDK 8 builds listed under [Prerequisites](#prerequisites). |
| `ClassNotFoundException: org.apache.derby.jdbc.EmbeddedDriver` | `derby.jar` isn't on the classpath. Keep `dist/lib/` next to the JAR, or add `dist/lib/derby.jar` to the classpath or project libraries. |
| `Another instance of Derby may have already booted the database` | Another copy of the app (or a DB tool) has the database open. Close it. If none is running, delete `database/db.lck`. |
| Login fails even after signing up | You probably started the app from a different folder, so it created a new, empty `database/`. Always run from the project root. |
| NetBeans shows "Reference problems" | Fix the Derby JAR paths as described in [Option 2](#option-2-open-and-run-in-netbeans). |

## Known Limitations

This is an academic project. Be aware of the following:

- **Student login** checks the ID against the `TEACHER` table instead of the `STUDENT` table (`DBConnect.userLoginStudent`).
- **Hard-coded routine data:** `RoutineController` defines the routine in code; it isn't generated from the database.
- **Missing screens:** `StudentsController` refers to `noProject.fxml`, `projectList21.fxml` and `projectList31.fxml`, which aren't in the project. Some year/semester combinations on the student screen will throw an error.
- **Security:** passwords are stored in plain text, and SQL queries are built by joining strings together, which leaves them open to SQL injection. Don't use this project with real credentials.
- **Stale NetBeans setting:** `nbproject/project.properties` still sets `dist.jar` to `Project Allocation Management.jar`.
