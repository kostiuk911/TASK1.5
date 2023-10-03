import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Отримання даних відправника
        System.out.print("Введіть ім'я відправника: ");
        String senderName = scanner.nextLine();
        System.out.print("Введіть адресу відправника: ");
        String senderAddress = scanner.nextLine();
        Customer sender = new Customer(1, senderName, senderAddress);

        // Отримання даних точки отримувача
        System.out.print("Введіть адресу точки отримувача: ");
        String receiverAddress = scanner.nextLine();
        ReceivePoint receiver = new ReceivePoint(1, receiverAddress);

        // Отримання даних посилок
        List<Item> items = new ArrayList<>();
        System.out.print("Скільки посилок ви хочете відправити? ");
        int numItems = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numItems; i++) {
            System.out.print("Введіть опис посилки: ");
            String description = scanner.nextLine();

            System.out.print("Введіть довжину посилки (в см): ");
            double length = scanner.nextDouble();

            System.out.print("Введіть ширину посилки (в см): ");
            double width = scanner.nextDouble();

            System.out.print("Введіть вагу посилки (в кг): ");
            double weight = scanner.nextDouble();

            Item item = new Item(i + 1, length, width, weight, description);
            items.add(item);
        }

        // Отримання методу доставки
        scanner.nextLine();
        System.out.println("Виберіть метод доставки (літак, фура, мотоцикл, кінь): ");
        String deliveryMethod = scanner.nextLine();

        // Перевірка на валідність введеного методу доставки
        if (!deliveryMethod.equals("літак") && !deliveryMethod.equals("фура") &&
                !deliveryMethod.equals("мотоцикл") && !deliveryMethod.equals("кінь")) {
            System.out.println("Ви ввели невірний метод доставки. Доступні варіанти: літак, фура, мотоцикл, кінь");
            scanner.close();
            return;
        }

        Shipment shipment = new Shipment(sender, receiver, items, deliveryMethod);

        System.out.println("Відправлення створено:");
        System.out.println("Ідентифікатор відправлення: " + shipment.getId());
        System.out.println("Вага посилки: " + shipment.getItems().get(0).getWeight() + " кг");
        System.out.println("Розміри посилки (довжина x ширина): " + shipment.getItems().get(0).getLength() +
                " см x " + shipment.getItems().get(0).getWidth() + " см");
        System.out.println("Точка відправлення: " + sender.getAddress());
        System.out.println("Адреса отримувача: " + receiver.getAddress());
        System.out.println("Метод доставки: " + shipment.getDeliveryMethod());

        scanner.close();
    }
}
