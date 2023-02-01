public class Question4 {
    public static void main(String[] args) {
        String name1 = new String ("Ali");
        String name2 = new String ("Ali");
        String name3 = name1;
        System.out.println(name1.equals(name2)); // True
        System.out.println(name1.equals(name3)); // True
        System.out.println(name1==name2); // false
        System.out.println(name1==name3); // true

    }
}
