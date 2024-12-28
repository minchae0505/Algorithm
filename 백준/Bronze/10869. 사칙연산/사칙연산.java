import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(a + b); // 덧셈
        System.out.println(a - b); // 뺄셈
        System.out.println(a * b); // 곱셈
        System.out.println(a / b); // 나눗셈
        System.out.println(a % b); // 나머지

        scanner.close(); // Scanner 닫기
    }
}
