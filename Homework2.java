import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args){
        //Task 1
        /*System.out.println(equals("Java", "JAVA"));
        System.out.println(replace("Стол", "о", "у"));
        System.out.println(format("Перов", 10, "Java"));
        System.out.println(isPalindrome("шалаш"));*/
        //Task 2
        /*IntHolder a = new IntHolder(10);
        IntHolder b = IntHolder.of(2);
        System.out.println(b.getValue());
        System.out.println(a.sum(b));
        System.out.println(a.diff(b));
        System.out.println(a.multiplication(b));
        System.out.println(a.division(b));
        System.out.println(a.remainder(b));
        IntHolder.swap(a, b);
        System.out.println(b.get_value());
        System.out.println(a.equals(b));
        System.out.println(b.hashCode());*/
        //Task3
        /*Point point1 = new Point();
        Point point2 = point1.translate(3, 5);
        Point point3 = point2.scale(0.7);
        System.out.println("X: " + point3.getCoordinateX() + "   Y: " + point3.getCoordinateY());*/
        //Task 4
        //Car car = new Car("Mersedes Benz", 60, "Black", 0, 6);
        //car.info();
    }
    static boolean equals(String s, String t) {
        return s.equalsIgnoreCase(t);
    }

    static String replace(String str, String oldStr, String newStr) {
        str = str.replace(oldStr, newStr);
        return str;
    }

    static String format(String surname, int mark, String subject) {
        return String.format("Студент %s получил %s по %s", surname, mark, subject);
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}