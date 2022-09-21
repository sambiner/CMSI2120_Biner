/**
* Filename: HighArray.java
* Description:
* Developer: Sam Biner
* Data: 09/19/2022
*/


class HighArray{
  private long[] a;        //reference to array A
  private int nElems;     //number of data items

  public HighArray(int max){
    a = new long[max];
    nElems = 0;
  }

  public boolean find(long searchKey){
    int j;
    for (j=0; j<nElems; j++)

      if (a[j] == searchKey)
        break;

      if (j == nElems)
        return false;

      else
        return true;
  }   // end of find method

  public void insert (long value){
    a[nElems] = value;
    nElems++;
  }

  public boolean delete(long value){
    int j;
    for (j=0; j<nElems; j++)
      if (value == a[j])
        break;

      if (j==nElems)
        return false;

      else {
        for (int k = j; k < nElems; k++)
            a[k] = a[k+1];
        nElems--;
        return true;

     }
  }

  public void display(){
    for (int j=0; j<nElems; j++)
        System.out.print(a[j] + " ");
    System.out.println("");
  }

  public long getMax(){
      long maxSoFar = 0;
      for (int i=0; i < a.length; i++){
          if (maxSoFar < a[i]){
              maxSoFar = a[i];
          }
      }
      return maxSoFar;
  }

  public HighArray noDups(){
      HighArray uniques = new HighArray(nElems);
      HighArray duplicates = new HighArray(nElems);
      for (int i=0; i < nElems; i++){
          if (uniques.find(a[i]) == true){
              duplicates.insert(a[i]);
              //System.out.println(a[i]);
              this.delete(a[i]);
          }
          else {
              uniques.insert(a[i]);
          }
      }
      return duplicates;
  }
} //End class HighArray
