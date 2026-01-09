class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        String ans = "";
        while (i >= 0 || j >= 0 || carry > 0) {
            int a = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int b = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = a + b + carry;
            ans = (sum % 10) + ans;
            carry = sum / 10;
        }
        return ans;
    }
}
