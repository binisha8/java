public class columnwiseprint {
    public static void main(String[] args) {
        
    
        int [][] arr={
            {10,20,30},
            {40,50,60},
            {70,80,90}


        };
         for (int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
        }


    }
     

