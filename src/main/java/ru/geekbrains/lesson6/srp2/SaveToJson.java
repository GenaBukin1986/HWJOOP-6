package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson implements ModelSave{
    Order order;
    String nameFile;

    public SaveToJson(Order order, String nameFile) {
        this.order = order;
        this.nameFile = nameFile;
    }

    @Override
    public void saveToFile() {
        String fileName = nameFile + ".json";
        try (FileWriter writer = new FileWriter(fileName,false)){
            writer.write("{\n");
            writer.write("\"ClientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":\"" + order.getQnt() + "\",\n");
            writer.write("\"price\":\"" + order.getPrice() + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
