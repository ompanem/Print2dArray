class Main{

  public static void main(String[]args){
      //create array and call each method to test.
  }

    static void recursivePrint(int[][] nums, int counter) {
        //add col until it reaches end increment the row by 1 when it happens

        if (counter == nums.length * nums[0].length) {
            return;

        }

        recursivePrint(nums, counter + 1); //counter ++ end at 9
        System.out.println(nums[counter / 3][counter % 3]);
    }

    static void recursivePrint(int[][] nums, int row, int col) {
        if (row == nums.length) {
            return;
        }

        if (col == nums[row].length) {
            col = 0;
            recursivePrint(nums, row + 1, col);
        } else {
            System.out.println(nums[row][col]);
            recursivePrint(nums, row, col + 1);
        }
    }

}
