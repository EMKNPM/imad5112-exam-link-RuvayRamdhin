[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/92arv5Vv)

# Campsite Commander

**Student Name:** RuvayRamdhin

**Student number:** ST10522098

## 🔗 GitHub Repository

**GitHub Repository Link:**  
[Insert GitHub Repository Link Here]


## 📌 Purpose of the Application
The purpose of the Campsite Commander is so that all users add the type of item they are bring, and the quantity of them and what extactly they are bringing. 

The application was developed using Kotlin in Android Studio. It demonstrates the use of arrays, loops, functions, screen navigation, data classes, input validation, and error handling.

The application allows users to:

- Enter the item they are bringing.

- The number of items they have brought.

- What extactly they have brought.

## 📱 Application Overview

The application contains three main screens:

### 1. Splash Screen

The **Splash Screen** is the first screen displayed when the application launches.

It includes:

- Application name
- Student name
- Student number
- Campsite Cammmander app logo
- Start button
- Exit button

The **Start** button allows the user to navigate to the Main Screen, while the **Exit** button closes the application.

### 2. Main Screen

The **Main Screen** is the main working screen of the application.

It includes:

- A Spinner to select the differnt category
- An input field to enter teh number of items
- An input field to enter what the item is extactly
- An button to save all the different gear
- An button to save the description
- An button to move the final screen

The Main screen stores all the user's data using an array. 

### 3. 📋 Detailed Screen

The **Detailed Screen** displays the information entered by the user.

It displays:

- All the info the user has entered

The screen also includes a **Back** button, allowing the user to return to the Main Screen.

## 🧠 Programming Concepts Used

| Concept | Explanation |
|---|---|
| Kotlin | Used as the main programming language |
| Android Studio | Used as the development environment |
| ConstraintLayout | Used to design the app screens |
| Spinner | Used to allow the user to select a day of the week |
| EditText | Used to capture user input |
| Button | Used to trigger app actions |
| TextView | Used to display headings, average temperature, and weather details |
| Arrays | Used to store weekly weather objects |
| Loops | Used to calculate averages and display detailed data |
| Functions | Used to organise app logic |
| Toast Messages | Used to display error and confirmation messages |
| Intents | Used to navigate between screens |

## 1. Splash Screen Pseudocode

```text
START

Display Splash Screen

Display application logo
Display application name
Display student name
Display student number

IF Start button is clicked THEN
    Navigate to Main Screen
ENDIF

IF Exit button is clicked THEN
    Close the application
ENDIF

STOP
```

---

## 2. 🏠 Main Screen Pseudocode

```text
START

Display Main Screen

Create array of campingstuff objects
Populate Shelter,Food, Safety

Display spinner with days of the week

Display input fields for:
    Amount of items
    Description of what the item is

Display buttons for:
    Add Gear
    Save description 
    See information

IF Add Gear button is clicked THEN
    Run Save Gear Data process
ENDIF

IF View Detailed button is clicked THEN
    IF all category have been entered THEN
        Navigate to Detailed  Screen
    ELSE
        Display error message
    ENDIF
ENDIF

IF Clear Data button is clicked THEN
    Run Clear Weather Data process
ENDIF


STOP
```

---

## 3. 💾 Save Data Pseudocode

```text
START

Get selected category from spinner
Get number if items input
Get Description of item input

IF number of items is empty OR desciptions is empty THEN
    Display error message: "Please complete all fields"
    STOP process
ENDIF

IF number of items are not a valid number THEN
    Display error message: "Temperatures must be valid numbers"
    STOP process
ENDIF

Store Number if items in selected WeatherDay object
Store Description of Item in selected WeatherDay object

STOP
```

---

## 7. 📋 Detailed Screen Pseudocode


```text
START

Display Detailed Screen

IF View gear loaded is clicked THEN
  Display Users input on screen
ENDIF

IF Back to main screen button is clicked THEN
    Return to Main Screen
ENDIF

STOP
```

---

# 📸 Screenshots

## Screenshot 1: Splash Screen

<img width="384" height="682" alt="image" src="https://github.com/user-attachments/assets/0836c303-8335-4bd0-9e9d-903c65247a09" />

---

## Screenshot 2: Main Screen


<img width="412" height="725" alt="image" src="https://github.com/user-attachments/assets/92cc2ba1-0ec5-44d5-9ee9-eb411ab5e93f" />

---

## Screenshot 3: Detailed Screen



<img width="383" height="687" alt="image" src="https://github.com/user-attachments/assets/f9baca6a-0d5e-4107-b48d-d9092d673083" />

# ⚠️ Error Handling

The application includes error handling for the following situations:

| Error | Message Displayed |
|---|---|
| Empty fields | Please complete all the fields |
| Invalid numbers | Temperatures must be valid numbers |
| Attempting to view the detail screen if they have not filled out all the categorys yet |

---

# ✅ Conclusion

The **Campsite Commanders"" application should meet all the requirements of the task allowing the user to enter the number of items they have and what extaxtly the item is and display all the infomation on the dtailed screen.

The app demonstrates the use of **Kotlin**, arrays, loops, functions, data classes, input validation, error handling, and screen navigation. It also includes a professional user interface with three main screens and a structured user experience.








