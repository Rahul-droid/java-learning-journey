package org.example;

public class StringPractice
{
    public static void main(String[] args) {

        /*String str = "  Welcome India  ";

        int length = str.length();
        System.out.println(length);

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.trim();
        System.out.println(str3);

        String str4 = str.substring(3);
        System.out.println(str4);

        String str5 = str.substring(3 ,6);
        System.out.println(str5);

        String str6 = str.replace(" " , "");
        System.out.println(str6);

        String str = "Mr. Rahul Kumar";

        boolean str1 = str.startsWith("R");
        System.out.println(str1);

        boolean str2 = str.endsWith("r");
        System.out.println(str2);

        char str3 = str.charAt(5);
        System.out.println(str3);

        int str4 = str.indexOf("R");
        System.out.println(str4);

        int str5 = str.indexOf("u", 8);
        System.out.println(str5);

        int str6 = str.lastIndexOf("r");
        System.out.println(str6);

        int str7 = str.indexOf("8");
        System.out.println(str7);

        String str1 = "Pyramid";
        String str2 = "Pyramid";
        String str3 = "JAVA";
        String str4 = "java";

        System.out.println(str1.equals(str2));

        //String str3 = "pyramid";
        System.out.println(str3.equalsIgnoreCase(str2));

        System.out.println(str3.compareTo(str2));
        System.out.println(str4.compareToIgnoreCase(str3));*/

       /* String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //System.out.println(str1 == str3);

        if (str1 == str3)
            System.out.println(true);
        else
            System.out.println(false);*/

        String str = "programmer@gmail.com";
        int str1 = str.indexOf('@');

        System.out.println(str1);

        String username = str.substring(0, 10);
        System.out.println(username);

        String domain = str.substring(11);
        System.out.println(domain);




    }
}
