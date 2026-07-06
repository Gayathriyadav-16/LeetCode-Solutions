class Solution {
    public String addBinary(String a, String b) {
        // long dec1 = Long.parseLong(a,2);
        // long dec2 = Long.parseLong(b,2);
        // long sum = dec1+dec2;
        // String bi = Long.toBinaryString(sum);
        // return bi;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2);   // current bit
            carry = sum / 2;      // carry
            i--;
            j--;
        }

        return sb.reverse().toString(); 
    }
}