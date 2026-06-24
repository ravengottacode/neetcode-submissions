class Solution {
    public boolean isAnagram(String s, String t) {
        return sortStringLex(s).equals(sortStringLex(t));
    }

    private String sortStringLex(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String sortedString = new String(charArr);
        return sortedString;
    }
}
