// taha burak sahin
//Write a program which reads three integers, then prints these three numbers and then rearranges the values in these variables
package task2;
public class practice3 {
    public static void main(String[] args) {
        int a = 3, b = 3 * a, c = a + b;
        System.out.println(a + a + c * b - c / 4); // 26
        System.out.println(a + (a + c) * (b - c) / 4); // -3
        int u = 13;
        System.out.println(
                "u = " + u + ", u%6 = " + u % 6 + ", u/7 = " +
                        u / 6 + ", 6*(u/6)+u%6 = " + (6 * (u / 6) + u % 6));
        System.out.println();

        u %= 7;

        System.out.println("1. u=" + u + ", x=" + a + ", y=" + b);
        a = ++u;
        System.out.println("2. u=" + u + ", x=" + a + ", y=" + b);
        b = a--;
        System.out.println("3. u=" + u + ", x=" + a + ", y=" + b);
        u = (a = --b);
        System.out.println("4. u=" + u + ", x=" + a + ", y=" + b);
        u = a = b = (int) (9.99 * b);
        System.out.println("5. u=" + u + ",x=" + a + ",y=" + b);
        u = 6 << 2;
        a = u >> 1;
        b = 7 >> 1;
        System.out.println("6. u=" + u + ",x=" + a + ",y=" + b);
        u = '\u0041';
        a = 'a';
        char e = (char) 98;
        System.out.println("7. u=" + u + ",x=" + a + ",c=" + c);
        System.out.println("Unicode of " + c + " is " + (int) c);
    }
}

