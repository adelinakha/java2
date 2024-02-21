package org.ru.netology.khairullina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Здравствуйте! Меня зовут Аделина!");

        // Задание №2
        Scanner scanner = new Scanner(System.in);

        // Переменные для хранения информации о транзакции
        int transactionId;
        double amount;
        String transactionDate;

        // Ввод информации о транзакции
        System.out.println("Введите идентификатор транзакции:");
        transactionId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите сумму транзакции:");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите дату транзакции (например, 2023-02-22):");
        transactionDate = scanner.nextLine();

        // Вывод информации о транзакции
        System.out.println("Идентификатор транзакции: " + transactionId + ", Сумма: " + amount + ", Дата: " + transactionDate);

        scanner.close();
    }
}
