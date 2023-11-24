package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class InputFromConsole implements InputFromOutside{
    Order order;
    private Scanner scanner = new Scanner(System.in);

    public InputFromConsole(Order order) {
        this.order = order;
    }


    public void inputFromOutside() {
        String clientName = promt("Имя клиента: ");
        order.setClientName(clientName);
        String product = promt("Продукт: ");
        order.setProduct(product);
        int qnt = Integer.parseInt(promt("Количество: "));
        order.setQnt(qnt);
        int price = Integer.parseInt(promt("Цена: "));
        order.setPrice(price);
    }

    public String promt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}