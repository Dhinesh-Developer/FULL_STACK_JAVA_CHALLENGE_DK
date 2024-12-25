import java.util.Scanner;

public class DAY10 {
    private static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<(n-i)+1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=(n-1-i)+1;k>=1;k--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern2(n);
    }
    private static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) {
                System.out.print(" ");
            }
                for(int j=1;j<=(2*i)-1;j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=(n-i);k>=1;k--){
                System.out.print(" ");
            }
            for(int j=(2*i)-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
