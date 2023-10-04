package educ;

public class Pattern {

	public static void main(String[] args) {
		int row = 4;
        int k = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k += row - j;
            }
            System.out.println();
            k = i + 1;
            
		}

	}

}
