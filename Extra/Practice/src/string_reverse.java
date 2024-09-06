class string_reverse {
    public static void main(String args[]) {
        String str = "hello";
        String str2 = "";
        int p = str.length();
        for (int i = 0; i < p; i++) {
            str2 = str.charAt(i) + str2;
        }
        System.out.println(str2);
    }
}