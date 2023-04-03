import java.util.*;
public class arrays{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int[]numbers = new int[size];
  //for input
  for(int i=0; i<size; i++){
   numbers[i] = sc.nextInt();
  }
  // marks[0] = 97; //physics
  // marks[1] = 98; //chemistry
  // marks[2] = 95; //english
  //System.out.println(marks);
  //System.out.println(marks[0]);
  //System.out.println(marks[1]);
  //System.out.println(marks[2]);
  //for output
  for(int i=0; i<size; i++){
   System.out.println(numbers[i]);
  }
 }
}