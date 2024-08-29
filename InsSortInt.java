import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class InsSortInt {
    public static void main(String[]args){
        ArrayList<String> numbersList = new ArrayList<>();
        try {
            File file = new File("randInts.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                numbersList.add(scanner.nextLine()); 
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        int[] A = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            A[i] = Integer.parseInt(numbersList.get(i));
        }
        for (int i =1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        System.out.println("Smallest Integer: " + A[0]);
        System.out.println("Largest Integer: " + A[A.length - 1]);
        
    }

}