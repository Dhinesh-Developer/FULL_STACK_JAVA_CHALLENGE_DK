import java.util.Scanner;

public class DAY20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* JAGGED ARRAY */
//       2 school 5 classroom and use jagged array
        int[][][] ar = new int[2][][];
        ar[0] = new int[3][];
        ar[1] = new int[2][];
        ar[0][0] = new int[2];
        ar[0][1] = new int[3];
        ar[0][2] = new int[4];
        ar[1][0] = new int[2];
        ar[1][1] = new int[3];

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                for(int k=0;k<ar[i][j].length;k++){
                    System.out.println("school "+i+" Classroom "+j+" student "+k);
                    ar[i][j][k] = in.nextInt();
                }
            }
        }
        System.out.println("Ages are ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                for(int k=0;k<ar[i][j].length;k++){
                    System.out.print(ar[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }




        /*
        2 classroom where 1st classroom has 3 student  ans 2nd classroom has 5 student
        int[][] ar = new int[2][];
        ar[0] = new int[3];
        ar[1] = new int[5];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("class "+i+" student "+j);
                ar[i][j] = in.nextInt();
            }
        }
        System.out.println("The ages are: ");
        for(int i=0;i<ar.length;i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println(ar[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
