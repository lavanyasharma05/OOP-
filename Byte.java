import java.io.*;
class Geeks {
    public static void main(String[] args) {
        byte[] byteArray = { 108, 97, 118, 97, 110, 121, 97 };
        String str2 = new String(byteArray);
        System.out.println("String from byte array: " + str2);
       byte[] byteArray1 = { 108, 97, 118, 97, 110, 121, 97,46,57, 64, 103,109,97,105,108,46,99,111,109};
        String str3 = new String(byteArray1);
       System.out.println("String from byte array: " + str3);
    }
}
