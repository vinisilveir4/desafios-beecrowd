package iniciante;

import java.util.Arrays;

public class AlgoritmoOrdenacaoBubbleSort {
    public static void main(String[] args) {
        int[] n = new int[]{0, 4, 2, 99,5, 4, 3};

        for(int i = 0; i < n.length; i++) {
            for(int j = 0; j < n.length - 1; j++) {
                if(n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(n));
    }
}
