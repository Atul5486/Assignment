import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = inp.nextInt();

        System.out.print("Enter last number: ");
        int num2 = inp.nextInt();

        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int count = 0;
            int sum = 0;
            
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                int power = 1;
                for (int j = 1; j <= count; j++) {
                    power *= rem;
                }
                sum += power;
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }

    }
}
