public class AppendRec {

  public static void main (String[] args) {
    System.out.println(appendNTimes("tea", 0));
    System.out.println(appendNTimes("t", 0));
  System.out.println(appendNTimes("cat", 5));
    System.out.println(appendNTimes("moron", 4));
  }

  public static String appendNTimes (String original, int n) {
      // WRITE YOUR CODE HERE

      // Method must be recursive!!!

   if(n == 0)
    return original;
    else
    return original + appendNTimes(original, n-1);
  }
}
