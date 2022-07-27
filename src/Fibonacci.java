public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int cnt = 40;
        int i;
        int totnum = 0;
        int totDiv3 = 0;
        double rem2 = 0;
        double rem3 = 0;
        int remcnt1 =0;
        int remcnt2 = 0;
        double avg = 0.000;

        System.out.println("1,  "+num1);
        System.out.println("2,  "+num2);

        for (i=1;i<39; ++i) {
             num3=num1+num2;
            System.out.println(i+2 + ",  "+ num3);
            num1 = num2;
            num2 = num3;
            totnum = totnum+num3;
            avg = totnum/cnt;
            rem2 = num3 % 2;
            rem3 = num3 % 3;
            if ( rem2==0) {
            remcnt1++;
            }
            if ( rem3==0) {
                remcnt2++;
                totDiv3 = totDiv3 + num3;

            }

        }
        System.out.println("Total " + totnum);
        System.out.println(" Tot Even Numbers " + remcnt1);
        System.out.println("Div by 3 is " + remcnt2);
        System.out.println("Total of Div by 3 is " + totDiv3);
        System.out.println("Average is " +totnum/40.0);
    }
}
