public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int x = 5;
        for (int i = 0; i < 10 + x; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        for (int i = 0; i <= 7; i++) {
            System.out.print(i + 4 + " ");
        }
        System.out.println ("\n");
        for (int i = 2; i <= 7; i ++){
            System.out.print (i * 2 + " ");
        }
        System.out.println ("\n");
        for (int i = 1; i < (100 / 6); i ++) {
            System.out.print (i * 6 + " ");
        }
        System.out.println ("\n");
        for (int i = 0; i < 100; i += 6) {
            System.out.print (i + " ");
        }
    }
}