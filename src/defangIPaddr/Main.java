package defangIPaddr;

public class Main {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String address1 = defangIPaddr(address);
        System.out.println(address1);
    }

    private static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
