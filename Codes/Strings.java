import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("only one word taken as input for next(); ");
        String name = sc.next();
        System.out.println("the output is " + name);
        sc.nextLine();// for the consumption of \n and space. explained in chatgpt

        System.out.print("the whole line taken as input(untill press enter) for nextLine(); ");
        String name1 = sc.nextLine();
        System.out.println("the output is " + name1);

        String newName = name + "_" + name1;// contatination and added a space between the strings
        System.out.println("the new string is :" + newName);

        System.out.println("the length of the new string is :" + newName.length());// for string length() for array
                                                                                   // only length.

        for (int i = 0; i < newName.length(); i++) {
            if (newName.charAt(i) == '_') {
                System.out.print(" "); // placed different character
            } else
                System.out.print(" " + newName.charAt(i));// printing each character with charAt funtion.
        }
        System.out.println();

        // comparing strings
        if (name.compareTo(name1) == 0)
            // checks if s1 > s2 , returns +ve
            // checks if s1 < s2 , returns -ve
            // checks if s1 = s2 , returns 0
            System.out.println("strings are equal");
        else
            System.out.println("Strings are not equal");

        String name2 = newName.substring(2, 6);// prints upto 6-1 th index

        String name3 = newName.substring(6);// no need to give ending index, it takes automatically

        System.out.println(name2);
        System.out.println(name3);

        sc.close();

        // in java we cannot modify the string .
        // to do so we have to create a different string which has every thing same as
        // the previous string along with the desired modific

        // ways to
        // create string
        // char[] str = {'a','a',...}
        // string str = 'abc'//string pool. does not create new value for same string.
        // if 2 string has same value both of str1 and str2 points same value/same
        // location
        // string str = new String('abc')// but this method makes new location with same
        // value.
        // // to compare strings content we use .equals(str)
        // strings are immutable bcz if both varialbes have the same value in same
        // location then if we wanted to reinitialize one then the oooooooother one
        // automatically changes

        // but if we wnat to modify strings we need to use string buffer and builder

        StringBuffer str5 = new StringBuffer("yep its me");
        str5.append(" erRanajit");
        System.out.println(str5);
        // insert(desired index,string); --iserts str in desired position
        // delete(start,end)
        // replace(start,end,new str)
        // append(something)
        // str.capacity() --displays capacity of a string
        System.out.println(str5.capacity());

        StringBuilder str6 = new StringBuilder("it is string builder");
        str6.delete(0, 3);
        System.out.println(str6);
        // stirngbuilder is also the same as string buffer. the only difference is
        // stringbuffer is multithreading safe. muliple threads can access the string.
        // but stringbuilder is not, it is efficient when the work will be done on
        // single thread. if multiple threads accesses without proper sync then might
        // lead to Error.
        // the other thing is stringbuilder is faster that string buffer
    }
}