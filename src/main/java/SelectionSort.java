/*
 * Tugas Algodata Sesi 9
 * M. Yamin (20200040077)
 * Teknik Informatika 20E (TI20E)
 */
import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
/**
 *
 * @author Muhamad Yamin
 */
public class SelectionSort {

  public static void main(String[] args) {
    
      int[] arr = {30, 22, 25, 01, 11, 90, 30, 02, 54,  33, 02, 64, 75}; 

    int min = arr[0];
    int index = 0;
    int swappingProcess = 0;
    long startTime = System.nanoTime();

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if ( arr[j] < min ) {
          min = arr[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(arr) 
                + " - Total Swapped : " + swappingProcess);
      }
      if ( min < arr[i] ) {
        arr[index] = arr[i];
        arr[i] = min;
      }
      min = arr[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Waktu yang diperlukan : " 
            + timeElapsed + " nano second");

  }

}