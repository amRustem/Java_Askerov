import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name= scan.nextLine();
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
        scan.close();
    }
}
