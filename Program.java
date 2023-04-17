public class Program {
    public static void main(String[] args) {
        /*
         * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
         * и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
         * входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
         */

        int[] arr = ArraySumm(new int[]{1, 2, 3}, new int[]{2, 7, 6});

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }

    public static int[] ArraySumm(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}