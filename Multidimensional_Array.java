class Multidimensional_Array{
    public static void main(String[] args) {

        int mutilArr[][] = new int[3][4];

//      for the arrays i.e rows
        for(int i = 0; i < 3; i++) {
//            for the elements i.e column
            for(int j = 0; j < 4; j++) {
                mutilArr[i][j] = (int)(Math.random() * 100) ;
            }

        }
//     enhanced for loop
        for(int[] row: mutilArr) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}