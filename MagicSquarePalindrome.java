import java.util.*;
 
public class MagicSquarePalindrome {
 
  static Queue<String> strings = new LinkedList<String>();
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numTestCases = sc.nextInt();
    sc.nextLine();
    for (int i=0; i < numTestCase; i++) {
      String line = sc.nextLine();
      String formatted = trimAndConcat(line);
      int dimension = (int) Math.sqrt(formatted.length());
      boolean isPerfectSquare = (dimension * dimension) == formatted.length();
      System.out.println("Case #" + (i+1) + ":");
      if(isPerfectSquare) {
        char[][] matrix = createMatrix(formatted, dimension);
        boolean isSymmetric = is SymmetricMatrix(matrix);
        if(isSymmetric) {
          System.out.println(dimension);
        } else {
          System.out.println("No magic :(");
        }
      } else {
        System.out.println("No magic :(");
      }
    }
  }
   
  public static boolean isSymmetricMatrix(char[][] matrix) {
    for(int i=0; i < matrix.length; i++) {
      for(int j=0; j < matrix.length; j++) {
        if(i != j) {
          if(matrix[i][j] != matrix[j][i]) {
            return false;
          }
        }
      }
    }
 
    return true;
  }
   
  public static String trimAndConcat(String input) {
    String output = "";
    for(int i=0; i < input.length(); i++) {
      if(Character.isLetter(input.charAt(i))) {
        output += input.charAt(i);
      }
    }
    return output;
  }
   
  public static char[][] createMatrix(String input, int dimension) {
    char[][] matrix = new char[dimension][dimension];
     
    for(int i=0; i<dimension; i++) {
      for(int j=0; j<dimension; j++) {
        matrix[i][j] = input.charAt(i + j);
      }
    }
     
    return matrix;
  }
}