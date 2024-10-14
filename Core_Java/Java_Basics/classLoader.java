public class classLoader {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Class c = classLoader.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
