class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> trackAnagrams = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String sortedKey = sortString(strs[i]);
            if(!trackAnagrams.containsKey(sortedKey)){
                 trackAnagrams.put(sortedKey, new ArrayList<>());
            }
            trackAnagrams.get(sortedKey).add(strs[i]);
        }
        for(List<String> stringList:trackAnagrams.values()){
            answer.add(stringList);
        }
        return answer;
    }
    private String sortString(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String sortedString = new String(charArr);
        return sortedString;
    }
}
