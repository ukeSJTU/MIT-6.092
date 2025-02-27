public class FooCorporation {
    public static double calculatePay(int base_pay, int work_hour) {
        double pay = 0;
        if (work_hour > 40) {
            pay += 40 * base_pay + 1.5 * base_pay * (work_hour - 40);
        } else {
            pay += work_hour * base_pay;
        }
        return pay;
    }

    public static void main(String[] args) {
        System.out.println(calculatePay(8, 50));
        System.out.println(calculatePay(8, 20));
    }
}
