public class classLoader {
    public static void main(String[] args) {
        Class c = classLoader.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
