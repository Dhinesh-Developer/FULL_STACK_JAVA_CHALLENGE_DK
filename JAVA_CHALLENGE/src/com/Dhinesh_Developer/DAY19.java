import java.util.Scanner;

public class DAY19 {
    /*one dimensional Array*/
    private static void oneDimensionalArray(int[] ar){
        for(int x: ar) System.out.print(x+" ");
    }
    /*Two dimensional Array*/
    public static void twoDimensionalArray(int[][] ar,int size1,int size2)
    {
        System.out.println("Ages are: ");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.println(ar[i][j]+" ");
            }
        }
    }
    static void threeDimensionalArray(int[][][] ar,int size1,int size2,int size3)
    {
        System.out.println("Ages are");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                for(int k=0;k<size3;k++){
                    System.out.println(ar[i][j][k]);
                }
            }
        }
    }

    public static void main(String[] args) {

        /*Regular Array*/
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the school number: ");
        int size1 = ref.nextInt();
        System.out.println("Enter the classroom number ");
        int size2 = ref.nextInt();
        System.out.println("Enter the students number ");
        int size3 = ref.nextInt();
        int[][][] ar = new int[size1][size2][size3];

        System.out.println("Enter the Ages for students for Each classroom belong to school: ");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                for(int k=0;k<size3;k++){
                    System.out.println("school "+i+" classroom "+j+" student "+k);
                    ar[i][j][k] = ref.nextInt();
                }
            }
        }
        threeDimensionalArray(ar,size1,size2,size3);
       /*
       *  Scanner ref = new Scanner(System.in);
        System.out.println("Enter the classroom number: ");
        int size1 = ref.nextInt();
        System.out.println("Enter the students number ");
        int size2 = ref.nextInt();
        int[][] ar = new int[size1][size2];

        System.out.println("Enter the Ages for students for Each classroom: ");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.println("class "+i+" studnet "+j);
                ar[i][j] = ref.nextInt();
            }
        }
        twoDimensionalArray(ar,size1,size2);*/
    }
}
