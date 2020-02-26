public class Main {
    public static void main(String[] args) {
        fibonanci(10);
    }

    private static void fibonanci(int count) {
        int current = 0;
        int next = 1;

        for (int i = 0; i < count; i++) {
            if(i == 0) {
                System.out.print(i + " ");
            } else {
                int tempValue = current + next;
                current = next;
                next = tempValue;
                System.out.print(current + " ");
            }
        }
    }
}
