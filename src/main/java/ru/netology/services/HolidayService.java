package ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                System.out.println("Месяц. " + month + " Денег. " + money + " Можно отдыхать. " + "Потратил - " + expenses + " А затем еще " + ((money / 3) - money));
                money = money - expenses;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            }
            else {
                System.out.println("Месяц. " + month + " Денег. " + money + " Придется работать. Заработал +" + income + ". Потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
