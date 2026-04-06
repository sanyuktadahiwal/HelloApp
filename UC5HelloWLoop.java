public class UC5HelloWLoop {
    public static void main(String[] args){
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        String name = nameBuilder.toString();
        name = nextString(name);
        System.out.println("Hello, " + name + "!");
    }

    private static String nextString(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}