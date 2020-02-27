public class Compress {

  public static void main(String[] args) {
 System.out.println("RLE For: ");
    System.out.println("r: " + compress("r,..  rrr"));
    System.out.println("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT : " + compress("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT"));
    System.out.println("ab: " + compress("ab"));
  }

    public static String compress (String str) {

	// WRITE YOUR CODE HERE

String res = "";
      int k = 1;
      for(int i = 0; i < str.length()-1; i++){
        char temp = str.charAt(i);



        if(temp == str.charAt(i+1))
            k++;

        else if(k>1){
        res += Integer.toString(k) + temp;
        k = 1;
        }
        else res+=temp;
        }

        if(str.length() == 0)
          res = "";
        else if(str.length() >1 && str.charAt(str.length()-1) == str.charAt(str.length()-2))
          res += Integer.toString(k) + str.charAt(str.length()-1);
          else
          res += str.charAt(str.length()-1);

      return res;
  }
}
