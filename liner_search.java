import java.util.*;
public class liner_search{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of Array: ");
  int size = sc.nextInt();
  int numbers[] = new int[size];
  // for input
  for(int i = 0; i<size; i++){
   numbers[i] = sc.nextInt();
  }
  System.out.println("Enter element you wnat to search: ");
  int x = sc.nextInt();
  // Traversing
  for(int i=0; i<numbers.length; i++){
   if(numbers[i] == x){
    System.out.println(" x found at " + i);
   }
  }
 }
}