package org.example.rentalps;

import java.util.Scanner;

public class RentalPS {
    private static final int RATE_PER_HOUR = 5000; // Tarif per jam (konstanta)
    private int totalIncome = 0;                   // Pendapatan total dari rental

    // Method untuk menyewa PS
    public void rentPS(int hours) throws IllegalArgumentException {
        if (hours <= 0) {
            throw new IllegalArgumentException("Durasi sewa harus lebih dari 0 jam.");
        }
        int cost = hours * RATE_PER_HOUR;
        totalIncome += cost;
        System.out.println("Anda menyewa PS selama " + hours + " jam. Biaya: Rp" + cost);
    }

    // Method untuk menampilkan total pendapatan
    public void showTotalIncome() {
        System.out.println("Total pendapatan saat ini: Rp" + totalIncome);
    }

    // Menampilkan menu
    private void displayMenu() {
        System.out.println("\n===== SISTEM RENTAL PS =====");
        System.out.println("1. Sewa PS");
        System.out.println("2. Lihat Total Pendapatan");
        System.out.println("3. Keluar");
    }

    // Method untuk mengambil input angka
    private int getIntegerInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
            }
        }
    }

    // Method untuk menampilkan menu utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalPS rental = new RentalPS();

        while (true) {
            rental.displayMenu();
            System.out.print("Pilih opsi (1/2/3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    int hours = rental.getIntegerInput(scanner, "Berapa jam ingin menyewa PS? ");
                    try {
                        rental.rentPS(hours);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    rental.showTotalIncome();
                    break;
                case "3":
                    System.out.println("Terima kasih telah menggunakan layanan rental kami!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}

