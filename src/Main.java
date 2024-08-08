import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Laptops> lp = new HashSet<>(Arrays.asList(
                new Laptops(16, 512, "Windows", "Space-grey"),
                new Laptops(16, 512, "MacOS", "Black"),
                new Laptops(8, 1000, "Linux", "Light-grey"),
                new Laptops(32, 1500, "Unix", "White")
        ));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");

        Scanner sc = new Scanner(System.in);
        Map<String, String> filter = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        criteria.forEach((key, value) -> System.out.println(key + " - " + value));

        while(true) {
            System.out.println("Введите критерий для фильтирации (или 0 для завершения): ");
            int criterion = sc.nextInt();
            sc.nextLine();

            if(criterion == 0) break;

            switch (criterion) {
                case 1:
                    System.out.println("Введите минимальное значение ОЗУ (8 / 16 / 32): ");
                    filter.put("ram", sc.nextLine());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД (512 / 1000 / 1500): ");
                    filter.put("Secondary Mem", sc.nextLine());
                    break;
                case 3:
                    System.out.println("Введите операционную систему (Windows / MacOS / Linux / Unix): ");
                    filter.put("os", sc.nextLine());
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    filter.put("color", sc.nextLine());
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз.");
            }

            List<Laptops> filteredNotebooks = lp.stream()
                    .filter(laptops -> filter.get("ram") == null || laptops.getRam() == Integer.parseInt(filter.get("ram")))
                    .filter(laptops -> filter.get("Secondary Mem") == null || laptops.getSecondaryMemory() == Integer.parseInt(filter.get("Secondary Mem")))
                    .filter(laptops -> filter.get("os") == null || laptops.getOs().equalsIgnoreCase(filter.get("os")))
                    .filter(laptops -> filter.get("color") == null || laptops.getColor().equalsIgnoreCase(filter.get("color")))
                    .collect(Collectors.toList());

            System.out.println("Ноутбуки, соответствующие критериям:");
            filteredNotebooks.forEach(System.out::println);



        }

    }
}