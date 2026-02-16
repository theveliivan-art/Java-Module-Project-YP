import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gonka autoGonka = new Gonka();
        int i=1;

        while (i<=3){
            String autoName = askAutoName(scanner, i);
            int autoSpeed = askSpeed(scanner, i);
            Auto newAuto = new Auto(autoName, autoSpeed);
            autoGonka.findWinner(newAuto);
            i++;
         }
        scanner.close();

        String winnersGonka = autoGonka.winnersName();

        System.out.println("Самый быстрый автомобиль: " + winnersGonka);
    }

    static String askAutoName(Scanner scanner, int i){
        String autoName = "";
        while (autoName.isEmpty()) {
            System.out.println("Введите название автомобиля №" + i + ":");
            autoName = scanner.next();
            if (autoName.isEmpty()) {
                System.out.println("Введено пустое название автомобиля №" + i + ". Повторите ввод.");
                scanner.skip(".*\n");
            }
        }
        return autoName;
    }

    static int askSpeed(Scanner scanner, int i){
        int autoSpeed = 0;
        while (autoSpeed<=0 || autoSpeed>250){
            scanner.skip(".*\n");
            System.out.println("Введите скорость автомобиля №" + i + ":");

            if (scanner.hasNextInt()) {
                autoSpeed = scanner.nextInt();

                if (autoSpeed<=0 || autoSpeed>250){
                    System.out.println("Скорость автомобиля №" + i + " должна быть от 0 до 250.");
                }
            }
            else{
                System.out.println("Скорость автомобиля №" + i + " должна содержать только целые числа.");
            }
        }
        return autoSpeed;
    }
}