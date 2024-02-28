import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Given matrix
    int [][] matris= {{1, 2, 3}, {4, 5, 6}};

        // Get the dimensions of the matrix
    int row = matris.length;
    int col = matris[0].length;

        // Create a transpose matrix with dimensions swapped
    int [][] tranpose= new int[col][row];

        //Printing the output of the given matrix
       for( int i=0; i< matris.length; i++){
           for(int j=0; j<matris[i].length; j++){
               System.out.print(matris[i][j]);
           }
           System.out.println();
       }

        // Compute the transpose of the matrix
        for( int i=0; i< col; i++){
            for(int j=0; j<row ; j++){
             tranpose[i][j] = matris[j][i];
            }
        }
        // Print the transpose matrix
        for( int i=0; i< tranpose.length; i++){
            for(int j=0; j<tranpose[i].length; j++){ // hangi satırdaysa onun uzunlugu kadar col olucak.O satırın sutunlarını döndürü
                System.out.print(tranpose[i][j]);
            }
            System.out.println();
        }
    }
}