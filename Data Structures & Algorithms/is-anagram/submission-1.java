class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) {
        return false;
      }
       HashMap<Character, Integer> characterOccurence = new HashMap();
       HashMap<Character, Integer> characterOccurenceT = new HashMap();
      for(int i = 0; i< s.length() ; i++) {
       
       if(characterOccurence.containsKey(s.charAt(i))) {
        Integer count = characterOccurence.get(s.charAt(i));
        characterOccurence.put(s.charAt(i), (count + 1));
       }else {
        characterOccurence.put(s.charAt(i), 1);
       }


       if(characterOccurenceT.containsKey(t.charAt(i))) {
        Integer countofT = characterOccurenceT.get(t.charAt(i));
        characterOccurenceT.put(t.charAt(i), (countofT + 1));
       }else {
        characterOccurenceT.put(t.charAt(i), 1);
       }

      }

    for(int j = 0; j< s.length() ; j++) {

    if(!characterOccurence.get(s.charAt(j)).equals(characterOccurenceT.get(s.charAt(j)))) {
        return false;
    }

     }
      return true;
    }
}
