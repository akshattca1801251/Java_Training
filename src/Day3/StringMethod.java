package Day3;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Akshat";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString = "     Akshat     ";
        System.out.println(nonTrimmedString.trim());
        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('k', 's'));
        //System.out.println(name.replace("k", "usp"));

        //System.out.println(name.startsWith("Aks"));
        //System.out.println(name.endsWith("hat"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "Harryrryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        //System.out.println(modifiedName.indexOf("rry", 4));
        //System.out.println(modifiedName.lastIndexOf("rry", 7));

        //System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");




    }
}
