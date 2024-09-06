public class stringtest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setLength(3);
        sb.ensureCapacity(30);
        int len = sb.length();
        System.out.println(len);
        int cap = sb.capacity();
        System.out.println(cap);
        char c = sb.charAt(1);
        System.out.println(c);
        sb.setCharAt(1, 'G');
        char c2 = sb.charAt(1);
        System.out.println(c);
        char[] target = { 0 };
        // sb.getChars(0, 2, target, 0);
        String s = null;
        int a = 100;
        StringBuffer str = new StringBuffer(40);
        s = str.append("ä=").append(a).append("!").toString();
        System.out.println(s);
        str.insert(1, "ekansh");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        StringBuffer str2 = new StringBuffer("Bhubaneswar");
        str2.replace(3, 8, "EH"); // inserts at 3 and starts the next character from 8
        System.out.println(str2);
        String temp = str2.substring(2, 4);
        System.out.println(temp);
        str2.delete(2, 4);
        System.out.println(str2);
        str2.deleteCharAt(0);
        str2.indexOf("s",8);
        String name1 = "Harshu", name2 = "harshu";
        int temp2 = name1.compareTo(name2);
        System.out.println(temp2);
        // str.getChars(1, 2, target, temp2);
        System.out.println(str);
        str2.trimToSize();
    }
}
