package ru.geekbrains.lesson6.srp2;

public class Order {
    //    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    public Order(){}

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*
        public void inputFromConsole(){
            clientName = promt("Имя клиента: ");
            product = promt("Продукт: ");
            qnt = Integer.parseInt(promt("Количество: "));
            price = Integer.parseInt(promt("Цена: "));
        }
        public String promt(String message){
            System.out.print(message);
            return scanner.nextLine();
        }
        */
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Имя клиента: %s\nПродукт: %s\nКоличество: %d\nЦена: %d",
                clientName,product,qnt,price);
    }

    /*
    public void saveToJson(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName,false)){
            writer.write("{\n");
            writer.write("\"ClientName\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"qnt\":\"" + qnt + "\",\n");
            writer.write("\"price\":\"" + price + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

     */
}
