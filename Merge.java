public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    margesortH(data, 0, data.length - 1);
  }

  private static void mergesortH(int[] data, int lo, int hi){ //helper function
    if (lo >= hi){ //went through all the indices
      return;
    }
    int mid = (lo + hi)/2;
    int leftLength = mid - left + 1;
    int rightLength = right - mid;
    int[] L = new int[leftLength];
    int[] R = new int[rightLength];
    //copy over values
    for (int i = 0; i < L.length; i++){
      //left array
      L[i]=data[i];
    }
    for (int i = 0; i < R.length; i++){
      //right array
      R[i]=data[mid+i];
    }
    mergesort(data, lo, mid); //split in half and mergesort left side
    mergesort(data, mid+1, hi); //split in half and mergesort right side
    merge(data, L, R, mid); //merge them back together
  }
  /*
  Pseudocode:
  mergesort(data,lo,hi):
    if lo >= hi :
      return
    mergesort left side
    mergesort right side
    merge
  */
  //You can make arrays as temporary space if you wish! This is the easier method, but will be a bit slower.

  private static void merge(int[] data, int[] L, int[] R, int mid){
    // start with creating temp arrays
    /*int leftLength = mid - left + 1;
    int rightLength = right - mid;
    int[] L = new int[leftLength];
    int[] R = new int[rightLength];
    */
    //store indices
    int i = 0;
    int l = 0;
    int r = 0;
    //loop thru the elements in one side and elements on the other and move it into the right place
    for (int r = 0; r < rightLength; r++){
      for (int l = 0; l < leftLength; l++){
        if (L[l] < R[r]){

        }
      }
    }
  }
  //If you want to make it faster:
  //Have your mergesort take both the data and temp arrays. Mergesort the temp, and merge into the original!
  //e.g.
    private static void mergesort(int[]data, int[]temp, int lo, int hi){}
//Pre-allocate a temp array in your mergesort wrapper method, and copy the data into it.
}
