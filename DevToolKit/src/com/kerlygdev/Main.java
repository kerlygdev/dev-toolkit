package com.kerlygdev;

import com.kerlygdev.managers.DailyManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DailyManager manager = new DailyManager();
        manager.addLog(LocalDate.now(), "ESTRUTURA DE CLASSE GERENCIADORA", "Hoje eu criei uma classe para gerenciar o meu diário técnico,");
        manager.addLog(LocalDate.of(2026,10,20), "CLASSE PRINCIPAL DA FUNÇÃO DIÁRIO TÉCNICO", "Criei uma classe para guardar os textos do diário");
        manager.showLogs();

    }
}