# 🍔 Burger Restaurant Ordering System (Java OOP Project)

A console-based Java application that simulates a burger restaurant ordering system using core object-oriented programming concepts like inheritance, composition, and encapsulation.

---

## 🚀 Features

- 🍔 Choose from multiple burgers (Aloo Tikki, Spicy Paneer, Veg Surprise, Maharaja)
- ➕ Add optional toppings (up to 3)
- 🥤 Order individual drinks or sides with size options (Small/Medium/Large)
- 🍟 Combine burger + drink + side into a full meal
- 🧾 Automatic price calculation and itemized bill display
- 🧠 OOP concepts: Classes, Inheritance, Polymorphism, Composition

---

## 🛠 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/BurgerRestaurant.git
   cd BurgerRestaurant
   ```

2. **Compile the Java files**
   ```bash
   javac Main.java
   ```

3. **Run the program**
   ```bash
   java Main
   ```

---

## 📷 Example Output

```
Hello Sir,Welcome to the Tom Burger
What would you like to have:
1) Burger
2) Drink
3) Side
4) Meal

BURGER
Please select the burger:
1) Aloo Tikki
2) Spicy Paneer
3) Veg Surprise
SPICY PANEER

Sir do you want extra toppings (YES/NO): YES

Here are the toppings:
1) CHEESE,TOMATO,LETTUCE -> 18
2) MAYO,CHILLI,TANDORI -> 16
3) PATTY,KETCHUP -> 20
CHEESE

Do you want more toppings (YES/NO): NO

Sir do you want to convert it into a meal (YES/NO): YES

SPICY PANEER BURGER : 130.00
CHEESE : 18.00
MEDIUM COKE : 90.00
MEDIUM FRIES : 100.00
------------------------------
Total Price : 338.00
```

---

## 🧠 Concepts Used

- `Items` base class for all products (burgers, drinks, sides, toppings)
- `Burger` extends `Items` and supports extra toppings
- `MealOrder` composes a full meal (burger + drink + side)
- Use of dynamic `ArrayList` for flexible topping selection
- Switch-case based pricing with real-time totals

---

## 📁 Folder Structure

```
BurgerRestaurant/
├── Main.java
├── Burger.java
├── Items.java
├── MealOrder.java
├── README.md
```

---

## 📜 License

This project is open-source and free to use under the [MIT License](https://choosealicense.com/licenses/mit/).

---

## 💡 Future Improvements

- Add order history or receipt ID
- Support saving orders to file
- Add GUI using JavaFX or Swing

---

## 👨‍💻 Author

**Shravan Suthar**

If you like this project, give it a ⭐ on GitHub!
