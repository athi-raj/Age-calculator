# <h1>  Age Calculator</h1>
![ Age Calculator](https://media0.giphy.com/media/v1.Y2lkPTc5MGI3NjExYjc2cmQwbzl6MDdpa3JhOGQ3aDQxOTdtcnVsMnZzYWI3aGEycHBkOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/CiC5N2o57QVmLInd4J/giphy.gif)

This is a simple Java program to calculate a person’s exact age in years, months, and days based on their birth date and the current date.</br>
The logic takes into account adjustments for day and month differences, making the result more accurate even if the current day or month is earlier than the birth day/month.



<h2>📌 Features</br></h2>
Calculates age in years, months, and days</br>

Handles real-world conditions like:

* Birth day > current day</br>

* Birth month > current month</br>




<h2>🛠️ How It Works</br></h2>
The program works by following two key rules:

* If the birth date is greater than the current date, it "borrows" days from the previous month to ensure proper subtraction.

* If the birth month is greater than the current month, it "borrows" a year and adds 12 to the current month.

After these adjustments, it calculates the difference in days, months, and years accordingly.

