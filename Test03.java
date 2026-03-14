public class Test03 {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            int start = (i % 2 == 1)?1 : 0;
            for (int j = 0; j< i; j++) {
                int value = (start+j) % 2;
                System.out.print(value);
                if (j< i- 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
