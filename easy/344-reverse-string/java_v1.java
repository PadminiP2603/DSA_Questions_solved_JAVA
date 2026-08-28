// Pushed: 2026-08-28 09:21:18 UTC
// Difficulty: Easy
// Runtime: 0 ms
// Memory: 48.4 MB

class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}