package SelfAssessment;

public class Q5 {
    public static void main(String[] args) {
        double yd = 91.44;
        double in = 2.54;
        double ydNum = 2.1;
        double inNum = 10.5;

        double ydToCm = yd * ydNum;
        double inToCm = in * inNum;

        System.out.printf("%4.1fyd = %5.1fcm\n", ydNum, ydToCm);
        System.out.printf("%4.1fin = %5.1fcm", inNum, inToCm);
    }
}
