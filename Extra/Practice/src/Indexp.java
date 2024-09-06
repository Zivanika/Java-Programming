public class Indexp {
public static void main(String[] args)
{
String myStr = "place planet earth, you are a great place to live in.";
System.out.println(myStr.indexOf("e", 5));
System.out.println(myStr.lastIndexOf("place"));
System.out.println(myStr.replace('l', 'p'));
System.out.println(myStr.length());
System.out.println("Index of substring 'is' from index:"
+ myStr.indexOf("place", 5));
String[] result = myStr.split(" ");
for (String str : result)
{
System.out.print(str + ", ");
}
System.out.println("\n");
System.out.println(myStr.toUpperCase());
System.out.println(myStr.toLowerCase());
}
}