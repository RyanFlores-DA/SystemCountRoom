
package tests;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class testcripto {

   public static void main(String args []) throws NoSuchAlgorithmException,
   UnsupportedEncodingException {

       String senha = "admin";

       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
       byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

       StringBuilder hexString = new StringBuilder();
       for (byte b : messageDigest) {
         hexString.append(String.format("%02X", 0xFF & b));
       }
       String senhahex = hexString.toString();

       System.out.println(senhahex);
   }

}
