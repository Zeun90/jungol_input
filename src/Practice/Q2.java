package Practice;

public class Q2 {
    public static void main(String[] args) {
        // 2개의 변수 선언
        int num1;
        int num2;

        // 변수에 값 대입
        num1 = 10;
        num2 = 20;

        // 2개의 변수 값 교환
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // 출력
        System.out.printf("%d %d", num1, num2);
    }
}
