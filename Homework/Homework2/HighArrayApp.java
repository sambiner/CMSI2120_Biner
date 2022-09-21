    /**
    * Filename: HighArray.java
    * Description:
    * Developer: Sam Biner
    * Data: 09/19/2022
    */

    import java.util.Collections;

    class HighArrayApp {
      public static void main(String[] args){

        int maxSize = 100; // array size

        HighArray arr; // reference to array

        arr = new HighArray(maxSize);  // create the array

        arr.insert(77);                // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(33);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();                 // display items

        int searchKey = 88;           // search for item

        if( arr.find(searchKey) )
          System.out.println("Found " + searchKey);
        else
          System.out.println("\nCan't find " + searchKey + "\n");

        arr.delete(00);              // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();              // display items again
        System.out.println("The maximum number in your array is " + arr.getMax() + ".");            // Get max of the array
        System.out.println("The duplicate values that were deleted were: ");
        arr.noDups().display();


        HighArray solution = new HighArray(maxSize);
        solution.insert(77);                // insert 10 items
        solution.insert(44);
        solution.insert(22);
        solution.insert(88);
        solution.insert(11);
        solution.insert(66);
        solution.insert(33);

        assert arr == solution;

        arr.display();
      }                            // end main()
    }                              // end class HighArrayApp
