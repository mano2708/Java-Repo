// public class Sample {
//     public static void main(String args[]){
//         System.out.println("Hi");
//         System.out.println("Welcome to the world of JAVA!... ");
//     }
// }


/*
 * 
 * DataTypes in JAVA
 *      |
 *      |---> Primitive Datatypes
 *      |        |---> Interger
 *      |        |       |---> Byte     (SIZE = 1 byte)
 *      |        |       |---> Short    (SIZE = 2 bytes)
 *      |        |       |---> Integer  (SIZE = 4 bytes)
 *      |        |       |---> Long     (SIZE = 8 bytes)
 *      |        |
 *      |        |---> Float
 *      |        |       |---> Float    (SIZE = 4 bytes) 
 *      |        |       |---> Double   (SIZE = 8 bytes)
 *      |        |
 *      |        |---> Character        (SIZE = 2 bytes)
 *      |        |
 *      |        |---> Boolean          (SIZE = 1 bit)
 *      |        
 *      |---> Non Primitive Datatypes
 */

public class Sample {

// Demonstrating Datatypes in JAVA..
    public static void main(String[] arg){
        byte byte_num = 127; // Min value = -128 to Max value = 127  
        short short_num = 3200; // Min value = -32768 to Max value = 32767  
        int integer_num = 12; // Min value = -2^31 to  Max value = 2^31-1  
        long long_num = 640000000000l; // Min value = -2^63 to Max value = 2^63-1  need to explicitly mention a float value with 'l' in the ending of the value
        
        float float_num = 12.2f; // Approximately ±3.40282347E+38F need to explicitly mention a float value with 'f' in the ending of the value
        double double_num = 12.2; // Approximately ±1.79769313486231570E+308  for more precise values


        char char_var = 'A'; // SIZE = 2 bytes //Stores only a single unicode character

        boolean bool_var = true; // 

        System.out.println("Byte : "+byte_num);
        System.out.println("Short : "+ short_num);
        System.out.println("Integer : "+integer_num);
        System.out.println("Long : "+long_num);
     
        System.out.println("Float : "+float_num);
        System.out.println("Double : "+double_num);

        System.out.println("Character : " + char_var);

        System.out.println("Boolean : "+ bool_var);


        // LITERALS

        int num1 = 0x7E;    // Converts the hexa-decimal value to decimal value
        int num2 = 0b101;    // Converts the binary value to decimal value
        System.out.println(num1);
        System.out.println(num2);

        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);
    }
}