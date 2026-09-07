class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '1';

        return (col + row) % 2 == 1;
    }
}

// f1
// 7-1 =6
// 1-1=0
// 6-0 =6 even so white true