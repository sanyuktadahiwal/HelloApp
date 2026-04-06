public class UC6 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        if (nameBuilder.length() > 0) {
            nameBuilder.setLength(nameBuilder.length() - 2);
        }
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}