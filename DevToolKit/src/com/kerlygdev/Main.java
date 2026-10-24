package com.kerlygdev;

import com.kerlygdev.managers.DailyManager;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DailyManager manager = new DailyManager();

        Scanner scanner = new Scanner(System.in);
        int option = -1;


        while (option != 0) {
            System.out.println("---MENU---");
            System.out.println("1 - Adicionar Log");
            System.out.println("2 - Listar Logs");
            System.out.println("0 - Sair");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                scanner.next();
                continue;

            }

            switch (option) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Qual assunto você estudou?");
                    String topic = scanner.nextLine();

                    System.out.println("Digite tudo o que você aprendeu:");
                    String text = scanner.nextLine();

                    manager.addLog(LocalDate.now(), topic, text);
                    System.out.println("Log adicionado com sucesso!");
                }
                case 2 -> manager.showLogs();
                case 0 -> System.out.println("Encerrando aplicação...");
                default -> System.out.println("Opção Inválida!");
            }
        }
        scanner.close();
    }
}