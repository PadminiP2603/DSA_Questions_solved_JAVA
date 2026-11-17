class Solution {
    public boolean isPalindrome(String s) {
        //Initialize left = 0
        int left = 0;
        //Initialize right = string.length() - 1
        int right = s.length()-1;
        //WHILE left < right:
        while(left< right){
            //IF left character is not a letter or digit:
            if(!Character.isLetterOrDigit(s.charAt(left))){
                //left++
                left ++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                //right--
                right --;
            }else{
                //Convert both characters to lowercase
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));
                //IF characters are not equal:
                if(leftChar != rightChar){
                    //RETURN false
                    //left++
                    //right--
                    return  false;
                }
                left ++;
                right --;
            }
        }
        return true;
    }
}