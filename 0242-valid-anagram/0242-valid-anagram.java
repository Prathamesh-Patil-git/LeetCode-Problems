class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i),temp);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i = 0; i < t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) <=0){
                    return false;
                }else{
                    int temp = map.get(t.charAt(i));
                    temp--;
                    map.put(t.charAt(i),temp);
                }
            }else{
                return false;
            }
        }
        return true;

    }
}