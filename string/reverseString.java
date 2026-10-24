class reverseString{
    public static void reverse(char[] str){
        int left = 0;
        int right = str.length - 1;

        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] strArray = str.toCharArray();
        reverse(strArray);
        String reversedStr = new String(strArray);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}