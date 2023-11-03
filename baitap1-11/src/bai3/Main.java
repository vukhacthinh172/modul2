package bai3;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] number =new int[100000];
        for (int i = 0; i <100000 ; i++) {
               number[i]= (int) (Math.random()*100000);
        }
        stopWatch.start();
        selectionSort(number);
        stopWatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn cho 100,000 số là: " + stopWatch.getElapsedTime() + " milliseconds");

    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

