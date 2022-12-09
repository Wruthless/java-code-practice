public class StringPermutation {

    public static void main(String[] args) {

        String strA = "brandon";
        String strB = "bnroadn";
        System.out.println(stringPermutation(strA, strB));

    }

   public static boolean stringPermutation(String string1, String string2) {
       int[] arr = new int[256];

       for (int i = 0; i < string1.length(); i++) {
          arr[(int) string1.charAt(i)] += 1;
       }

       for (int i = 0; i < string2.length(); i++) {
           arr[(int) string2.charAt(i)] -= 1;
       }

       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0) return false;
       }
       return true;
   }
}
