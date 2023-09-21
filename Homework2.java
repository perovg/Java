public class Homework2 {
    public static void main(String[] args){
        //Task 1
        /*System.out.println(equals("Java", "JAVA"));
        //System.out.println(replace("Стол", "о", "у"));
        //System.out.println(format("Перов", 10, "Java"));
        System.out.println(isPalindrome("шалаш"));*/
        //Task 2
    }
    static boolean equals(String s, String t) {
        return s.equalsIgnoreCase(t);
    }

    static String replace(String str, String oldStr, String newStr) {
        str = str.replace(oldStr, newStr);
        return str;
    }

    static String format(String surname, int mark, String subject) {
        String m = String.valueOf(mark);
        String str = String.format("Студент %s получил %s по %s", surname, m, subject);
        return str;
    }

    static boolean isPalindrome(String str) {
        String str1 = new StringBuilder(str).reverse().toString();
        if (str.equals(str1)){
            return true;
        }
        return false;
    }

}