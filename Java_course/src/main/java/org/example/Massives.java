package org.example;

public class Massives {
    public static void main(String[] args) {
        //Инициализируем массив
        int nums1[];
        int[] nums2;
        //Указываем из скольки элементов состоит наш массив
        nums1 = new int[4];

        //Первый способ задания значений в массиве
        int nums3[] = new int[] {1,2,3,4};
        //Второй способ задания значений в массиве
        int[] nums4 = {1,2,3,4};
        //Третий способ задания значений в массиве
        int nums5[] = new int[4];
        nums5[0] = 1;
        nums5[1] = 2;
        nums5[2] = 3;
        nums5[3] = 4;
        System.out.println(nums5[3]);

        int nums4_length = nums4.length;
        //System.out.println(nums4_length);
        //Одномерный массив
        int[] nums6 = new int[]{1,2,3,4,5,6};
        //Многомерный массив
        int[][] nums7 = {{111,2,3,4},{5,6,7,8}};
        System.out.println(nums7[0][0]);
        nums7[0][0] = 123;
        System.out.println(nums7[0][0]);
        System.out.println();
        int [] arr = new int[]{10,2,23,4,5,6,7};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int nums8[][] = new int[][]
                {
                        {11,2,5},
                        {21,54,6},
                        {7,854,9},
                        {71,84,46}
                };
        for (int i = 0; i < nums8.length;i++){
            System.out.println("Это длинна nums8"+nums8.length);
            for (int j = 0; j < nums8[i].length;j++){
                System.out.println("Это длина nums8[i]"+nums8[i].length);
                System.out.print(nums8[i][j]);
            }
        }
    }
}
