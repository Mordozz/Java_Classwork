import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addNotebook(new Notebook("HP", "Intel i5", 16, 1000, 2.3, 1000));
        shop.addNotebook(new Notebook("Lenovo", "Intel i7", 32, 2000, 2.5, 1500));
        shop.addNotebook(new Notebook("Apple", "Apple M1", 16, 500, 3.2, 2000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер необходимого критерия:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Частота процессора");

        int choice = scanner.nextInt();
        System.out.println("Введите минимальное значение для указанного критерия:");
        int minValue = scanner.nextInt();

        List<Notebook> filteredNotebooks;
        switch (choice) {
            case 1:
                filteredNotebooks = shop.filterByRam(minValue);
                break;
            case 2:
                filteredNotebooks = shop.filterByHdd(minValue);
                break;
            case 3:
                filteredNotebooks = shop.filterByCpuFrequency(minValue);
                break;
            default:
                filteredNotebooks = new ArrayList<>();
        }

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel());
        }
    }
}