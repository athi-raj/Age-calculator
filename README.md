<h`>🧮 Java Age Calculator</h1>

This is a simple Java program to calculate a person’s exact age in years, months, and days based on their birth date and the current date.</br>
The logic takes into account adjustments for day and month differences, making the result more accurate even if the current day or month is earlier than the birth day/month.



📌 Features</br>
Calculates age in years, months, and days</br>
Handles real-world conditions like:
* Birth day > current day</br>

* Birth month > current month</br>





🛠️ How It Works</br>
The program works by following two key rules:
* If the birth date is greater than the current date, it "borrows" days from the previous month to ensure proper subtraction.

* If the birth month is greater than the current month, it "borrows" a year and adds 12 to the current month.

After these adjustments, it calculates the difference in days, months, and years accordingly.

