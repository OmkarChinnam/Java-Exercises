class Arrays{
    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 3;
        arr[4] = 2;

        int arr2[] = {9, 3, 6, 0, 7};

        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i]  + " ");
        }
        System.out.println();

        for(int i = 0; i < 5; i++) {
            System.out.print(arr2[i]  + " ");
        }
    }



}