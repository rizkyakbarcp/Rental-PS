# RentalPS

RentalPS is a simple Java console application that allows users to rent a PlayStation (PS) for a specified duration and calculates the total income generated from these rentals.

## Features
- **PS Rental**: Users can rent a PS for a specified number of hours at a rate of Rp5000 per hour.
- **Income Tracking**: The application keeps track of the total income earned from all rentals.
- **Menu System**: A simple menu allows users to navigate the application easily.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed (version 8 or above recommended)

### Running the Application
1. Clone this repository or download the `.java` file.
2. Compile the `RentalPS.java` file:
    ```bash
    javac RentalPS.java
    ```
3. Run the application:
    ```bash
    java org.example.rentalps.RentalPS
    ```

### Usage
1. When the application starts, you will see a menu:
    ```
    ===== SISTEM RENTAL PS =====
    1. Sewa PS
    2. Lihat Total Pendapatan
    3. Keluar
    ```
2. Choose an option by entering the number:
    - **1**: Enter the number of hours to rent the PS. The application will calculate and display the rental cost.
    - **2**: View the total income generated from rentals so far.
    - **3**: Exit the application.

## Code Overview
The main class is `RentalPS`, which contains:
- **`rentPS(int hours)`**: Manages the rental process and calculates the rental cost.
- **`showTotalIncome()`**: Displays the current total income from rentals.
- **`displayMenu()`**: Shows the main menu options.
- **`getIntegerInput(Scanner scanner, String prompt)`**: Helper method to handle user input and ensure valid integer input.

## Error Handling
- The `rentPS` method throws an `IllegalArgumentException` if the rental duration is zero or negative.
- The `getIntegerInput` method ensures only valid integers are accepted for input.

## Example


