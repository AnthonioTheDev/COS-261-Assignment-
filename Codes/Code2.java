//The difference between == and .equals() in Java. Show with code examples and outputs
public class Code2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println(a == b); // Primitive types compare Values-True
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2); // str1 and str2 points to different objects-False
        System.out.println(str1.equals(str2)); // They both have the same contents-True
    }
}
