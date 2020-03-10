import java.util.Arrays;

public class Array2DExplorer {






        public static int  minRow(int[][] nums, int row){
           int min = nums[row][0];
            for (int n : nums[row]){
                if(n < min)
                    min = n;
            }
            return min;


        }

        public static int[] ColMaxes(int[][] matrix){

            int[] maxes = new int[matrix[0].length];
                for(int col = 0; col < matrix[0].length; col++){
                    int min = matrix[0][col];
                    for(int row = 0; row < matrix.length; row++){
                        if(matrix[row][col] >= min){
                            min = matrix[row][col];


                        }
                    }
                    maxes[col] = min;
            }

            return maxes;
        }




        public static int[] allRowSums(int[][] data){
            int[] allSums = new int[data.length];
            int sum = 0;
            for (int i = 0; i < data.length; i++){
               sum = 0;
                for (int x = 0; x < data[0].length; x++){
                    sum = sum + data[i][x];
                    allSums[i] = sum;
                }

            }

            return allSums;

        }


         public static double[] averageCol(int[][] nums){
             double[] colAve = new double[nums[0].length];
           double sum = 0;
            for (int col = 0; col < nums[0].length; col++) {
                sum = 0;
                for (int row = 0; row < nums.length; row++) {
                    sum = sum + nums[row][col];
                }
                sum = sum / (double)nums.length;
                colAve[col] = sum;

           }
            return colAve;
         }

    public static int smallEven(int[][] matrix){
       int minEven = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int x = 0; x < matrix[0].length; x++){
                if((matrix[i][x] == 1 ) || (matrix[i][x] <= minEven) && (matrix[i][x] % 2 == 0)){
                    minEven = matrix[i][x];
                }

            }


        }

return minEven;
    }

   public static int biggestRow(int[][] nums) {
      int sums[] = Array2DExplorer.allRowSums(nums);
       int min = sums[0];
        int index = 0;
       for (int i = 0; i < nums.length; i++){
            if(min > sums[i]){
                min = sums[i];
                index = i;
            }

        }



return index;
   }
    public static void main(String[] args) {
        int[][] nums = {{4,2,5,4},{4,7,2,5},{3,4,-1,8}};
        System.out.println("MinRow = " + Array2DExplorer.minRow(nums, 2));
        System.out.println("ColMaxes = " + Arrays.toString(Array2DExplorer.ColMaxes(nums)));
        System.out.println("all row nums = " + Arrays.toString(Array2DExplorer.allRowSums(nums)));
        System.out.println("Column Average = " + Arrays.toString(Array2DExplorer.averageCol(nums)));
        System.out.println("min even = " + Array2DExplorer.smallEven(nums));
        System.out.println("biggest row = " + Array2DExplorer.biggestRow(nums));




        }






}
  /*  int min = matrix[0][0];
    int i = 0;
    int temp = 0;
    int[] maxes = new int[matrix.length];
           for (int[] n : matrix){
                   for (int maxNow : n)
                   if(maxNow > min)
                   min = maxNow;
                   maxes[i] = min;

                   i++;
                   }

                   return maxes;
*/