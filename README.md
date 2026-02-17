# coffee-shop-rewards2

Triple C's

## Objective

Build a Java console application that manages a coffee shop’s menu and a customer loyalty program. You will practice **Object-Oriented Programming (OOP)** by creating custom classes, managing data with loops, and using logic to award free drinks.

## Core Requirements

### 1. The `CoffeeItem` Class

This class represents a drink on the menu.

* **Attributes:** Name and price.
* **Encapsulation:** Use `private` fields with **Getters and Setters**.
* **Constructor:** Initialize the name and price when a new drink is created.

### 2. The `Customer` Class

This class tracks individual shoppers and their progress toward a reward.

* **Attributes:** Name, email, and `drinksPurchased` (an integer).
* **Methods:** * Create a method to increment the drink count.
* Create a method to check if the customer is eligible for a **Reward** (e.g., if they have bought 5 drinks, the next one is free).



### 3. The Shop Logic (`Main.java`)

This is where your program runs. You should:

* **Instantiate Objects:** Create at least three different `CoffeeItem` objects.
* **Control Flow:** Use an `if-else` statement to determine if a customer pays full price or $0 based on their reward status.
* **Loops:** Use a `while` or `for` loop to simulate a "Daily Sales" cycle, allowing multiple customers to buy drinks until the shop closes.

---

## The Challenge

1. **The "Golden Ticket":** Add logic so that if a customer spends over $20 in a single transaction, they get a "bonus" point toward their rewards.
2. **Input Validation:** Use a `Scanner` to take user input. Ensure the program doesn't crash if someone enters a negative number or an invalid menu selection.

## Example Output

```text
Welcome to Triple Cs!
Customer: Alex | Drinks toward reward: 4
Alex purchased a Latte ($4.50).
CONGRATS! Reward reached. Next drink is on us!


