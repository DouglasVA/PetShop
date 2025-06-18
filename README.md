# Pet Shop Management

This is a simple Java console application for managing pet records in a pet shop.  
The program allows registering pets, updating their vaccine count, and listing all pets with their current information.

## 💡 About the Project

This challenge was proposed by ChatGPT and manually implemented by me for learning purposes.  
It reinforces object-oriented programming concepts, list manipulation, and user input handling in Java.

## 🚀 Features

- Register pets with unique IDs
- Prevent duplicate pet registration
- Update the number of vaccines applied to a pet
- Display a summary of all registered pets

## 🧰 Technologies and Concepts Used

- Java (JDK 17+ recommended)
- Object-Oriented Programming (OOP)
- Classes and encapsulation
- Lists (`ArrayList`)
- User input with `Scanner`
- Conditional logic and loops
- Input validation

## 📂 Project Structure

```text
src/
└── com.douglasva.petshop
    ├── application/
    │   └── Main.java
    └── entities/
        └── Pet.java
```


---

## 📚 Skills Practiced

- Creating and managing Java classes
- Using `ArrayList` to store and search objects
- Implementing helper methods for validation
- Applying encapsulation and separation of concerns
- Working with console input/output
- Building simple, structured console applications

---

## ✅ Example Output

```text
How many pets will be registered? 2

Pet #1
ID: 1
Name: Rex
Species: Dog
Number of vaccines already taken: 2

Pet #2
ID: 2
Name: Mimi
Species: Cat
Number of vaccines already taken: 1

Enter the pet ID to apply a vaccine: 2
How many vaccines to add? 1

List of pets:
ID: 1, Name: Rex, Species: Dog, Vaccines: 2
ID: 2, Name: Mimi, Species: Cat, Vaccines: 2
```

## 🧪 How to Run

1. Clone the repository or copy the files into your Java IDE.
2. Compile and run `Main.java`.
3. Follow the instructions in the console.

---

## 🧠 Author's Note

This exercise was part of my Java learning journey.

If you're also learning Java, feel free to reuse and modify the code for practice!
