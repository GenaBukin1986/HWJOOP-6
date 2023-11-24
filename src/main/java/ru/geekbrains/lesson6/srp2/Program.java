package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        InputFromConsole inputFromConsole = new InputFromConsole(order);
        inputFromConsole.inputFromOutside();
        SaveToJson saveToJson = new SaveToJson(order,"info");
        saveToJson.saveToFile();
        System.out.println(order);

    }

}
