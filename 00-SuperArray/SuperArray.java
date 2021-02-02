import java.util.Arrays;

public class SuperArray {
  private int[] arr1;

  public SuperArray(int size){
    this.arr1 = new int[size];
  }

  public SuperArray(){
    this.arr1 = new int[10];
  }

//creates size as length of array. Lists through all the indexes of the array, and if the first index with value 0 comes up, it replaces it with a value.
  public void add(int value){
   int size = this.arr1.length;

   for(int i = 0; i < size; i++){
     if(this.arr1[i] == 0){
         this.arr1[i] = value;
         return;
      }
   }
//dont know
   grow(1);
   this.arr1[size] = value;
   return;
  }

//adds a value instead of 0 into the array, if the index is out of bounds, the array grows by 1.
  public void add(int index, int value){
    int size = this.arr1.length;

    if((size - index) < 1)
      grow(1);

    this.arr1[index] = value;
  }

//creates a new array which is n greater than the first array. all values are transfered from the first array into the second.
  public void grow(int n){
    int size = this.arr1.length;

    int[] arr2 = new int[size+n];
    for(int i = 0; i < this.arr1.length; i++){
      arr2[i] = this.arr1[i];
    }
    this.arr1 = arr2;
  }

//replaces index with value given.
  public void set(int i, int val){
    this.arr1[i] = val;
  }

//checks if the array is empty, if one of the indexes is 0, then there is an empty slot.
  public boolean isEmpty(){
    for(int i = 0; i < this.arr1.length; i++){
      if(this.arr1[i] != 0)
        return false;
    }
    return true;
  }

//this method essentially transfers all values above and below the index into a temporary array. then the first array is equaled to the temporary array.
  public void remove(int index){
    int size = this.arr1.length;
    int[] temp = new int[size - 1];

    for(int i = 0; i < (size - 1); i++){
      if(i == index){
        for(int j = i; j < size-1; j++)
          temp[j] = this.arr1[j + 1];
        break;
      }

      temp[i] = this.arr1[i];
    }
    this.arr1 = temp;
  }
//takes in length of the array
  public int getLength(){
    return this.arr1.length;
  }

  public String toString(){
    return Arrays.toString(this.arr1);
  }
}
