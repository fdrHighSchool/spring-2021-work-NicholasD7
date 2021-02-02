public class Driver{
  public static void main(String[] args){
    SuperArray arr1 = new SuperArray(9);
    System.out.println(arr1.isEmpty());
    arr1.add(3);
    arr1.add(7);
    arr1.add(7);
    arr1.add(1);
    arr1.add(8);
    arr1.add(5);
    System.out.println(arr1);
    arr1.add(7, 2);
    arr1.add(8, 6);
    arr2.grow(2);
    arr2.add(6);
    arr2.set(5, 10);
    System.out.println(arr1);
    System.out.println(arr2);
    arr1.remove(5);
    System.out.println(arr1);
  }
}
