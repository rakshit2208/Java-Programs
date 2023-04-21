// Ragged array addition program
public class RaggedArrayAddition 
{
    public static void main(String[] args) 
    {

        int matrix1[][] = {
            {1,2,3,4,5}, 
            {2,3,4, 5}, 
            {3,4,5},
            {4,5},
            {5},
        };

        int matrix2[][] = {
            {1,2,3,4,5}, 
            {2,3,4, 5}, 
            {3,4,5},
            {4,5},
            {5},
        };

        int matrix3[][] = {
            {0,0,0,0,0}, 
            {0,0,0,0}, 
            {0,0,0},
            {0,0},
            {0},
        };

        System.out.print("Print First Matrix :- \n");
        for (int i = 0; i < matrix1.length; i++)                
        {
            for(int j = 0; j < matrix1[i].length; j++) 
            {
                System.out.print(matrix1[i][j]+" ");
            }
                System.out.print("\n");
        }

        System.out.print("Print Second Matrix :- \n");
        for (int i = 0; i < matrix1.length; i++) 
        {
            for(int j = 0; j < matrix2[i].length; j++) 
            {
                System.out.print(matrix2[i][j]+" ");
            }
                System.out.print("\n");
        }
        
        System.out.print("Sum Of Two Matrix :- \n");
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j]+" ");
            }

            System.out.print("\n");
        }


    }
}
