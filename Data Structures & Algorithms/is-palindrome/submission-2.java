class Solution {
    public boolean isPalindrome(String s) {
        String strWithoutSpace = s.replace(" ","").toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(strWithoutSpace.length()==0)
            return true;
        for(int i=0,j=strWithoutSpace.length()-1;i<=strWithoutSpace.length()/2;i++,j--){
            if(!(strWithoutSpace.charAt(i)==strWithoutSpace.charAt(j)))
            return false;
        }
        return true;
    }
}
