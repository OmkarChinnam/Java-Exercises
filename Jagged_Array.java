class Jagged_Array{
    public static void main(String[] args) {

        int mutilArr[][] = new int[3][];
        mutilArr[0] = new int[3];
        mutilArr[1] = new int[4];
        mutilArr[2] = new int[2];



//      for the arrays i.e rows
        for(int i = 0; i < mutilArr.length; i++) {
//            for the elements i.e column
            for(int j = 0; j < mutilArr[i].length; j++) {
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