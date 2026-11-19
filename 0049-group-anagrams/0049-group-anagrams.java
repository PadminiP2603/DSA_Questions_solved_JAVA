class Solution {
   //    Create a HashMap.
//    Iterate through the input string array.
//    Sort each string and use the sorted string as the key.
//    Add the original string to the corresponding list
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            ///  converts string to array
            char[] chars = strs[i].toCharArray();
            /// Sorts characters
            Arrays.sort(chars);

            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);

        }
        return new ArrayList<>(map.values());
    }
}