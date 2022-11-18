//taha burak sahin
//Write a program reading three values of type boolean and storing
//them in three variables. Then define five additional logical variables
//and set their values according to the following interpretation

package task2;
import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter three boolean " + "values (true or false) ");
        boolean a = scan.nextBoolean();
        boolean b = scan.nextBoolean();
        boolean c = scan.nextBoolean();
        scan.close();
        boolean allThree =a ==true&&b==true&&c==true;
        boolean exactlyOne =(a==true&&b==false&&c==false)||(a==false&&b==true&&c==false)||(a==false&&b==false&&c==true);
        boolean exactlyTwo =(a==true&&b==true&&c==false)||(a==false&&b==true&&c==true)||(a==true&&b==false&&c==false);
        boolean atLeastOne =(a==true||b==false||c==false)||(a==false||b==true||c==false)||(a==false||b==false||c==true);
        boolean atLeastTwo =(a==true&&b==true&&c==false)||(a==false&&b==true&&c==true)||(a==true&&b==false&&c==true)||(a==true&&b==true&&c==true);

        System.out.println("a, b, c = " + a + ", " + b + ", " + c + "\nallThree: " + allThree + "\nexactlyOne: "
                + exactlyOne + "\nexactlyTwo: " + exactlyTwo + "\natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);
    }
}

