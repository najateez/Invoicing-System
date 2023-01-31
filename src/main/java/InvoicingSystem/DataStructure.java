package InvoicingSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataStructure {

	public static void main(String[] args) {
		
		
		Object[] arr = { "iceCream","chocolate","water","pepsi","juice","chips"};
        System.out.println("The original array is: ");
        for (Object i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------");
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for (Object i : arr) {
            System.out.print(i + " ");
        }

	}

}
