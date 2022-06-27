public class BubbleSorting {
    public static void main(String[] args) {
        System.out.println("----------------USE BUBBLE SORT TO LIST IN NUMERICAL ORDER----------------");

        //BSA works by repeatedly swapping the adjacent elements if they are in the wrong order
        //not suitable for large data sets

        Integer numberList[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        sortingBubble(numberList);
    }

    private static void sortingBubble(Integer list[]){
        for (Integer sortingNum = 0; sortingNum < list.length; sortingNum++) //getting length of list for iterating
            for (Integer startingNum = 0; startingNum < list.length-sortingNum-1; startingNum++) //incrementing after each iteration
                if (list[startingNum] > list[startingNum+1]){  //comparing items for which is larger
                    Integer listNum = list[startingNum]; //temp variable to copy list into variable
                    list[startingNum] = list[startingNum+1]; //moving poisition based on if passed if >
                    list[startingNum+1] = listNum;
                }

            Integer listLength = list.length;
            for (Integer i = 0; i < listLength; i++)
            System.out.print(list[i] + " "); 
            System.out.println();
    }

    // public static void main(Integer list[] gettingFibonacciNumbers){
    //     Integer numberList[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
    //     Sorter sorter = new BubbleSorting();
    //     sorter.sort(numberList);
    //     System.out.println(Arrays.toString(numberList));
    // }

    // private static void sortingBubble(Integer list[]){
    //     boolean sorted = false;
    //     int temp;
    //     while (!sorted) {
    //         sorted = true;
    //         for (int i = 0; i < array.length - 1; i++) {
    //             if (a[i] > a[i+1]) {
    //                 temp = a[i];
    //                 a[i] = a[i+1];
    //                 a[i+1] = temp;
    //                 sorted = false;
    //             }
    //         }
    // }
    // } //using booleans
}
