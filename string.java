public class string {
    public static void main(String[] args) {
        // concatenationo
        String name1 = "Nikhil ";
        String name2 = "Maheshwari";
        String name3 = name1 + " " + name2;
        System.out.println(name3);
        System.out.println(name2.charAt(5));
        System.out.println(name2.length());
        // replace
        String name4 = name3.replace('i', 'd');
        System.out.println(name4);
        // substring
        System.out.println(name3.substring(0, 11));
    }
}
