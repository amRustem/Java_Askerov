public class Task3 {
    public static void main(String[] args) {
        int[] array = {3,5,9,12,15,8,6,18,7,21};
        System.out.println("Элементы массива, кратные 3:" );
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.println(j + " ");
            }
        }
    }
}
