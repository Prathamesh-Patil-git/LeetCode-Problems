class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;

        for(int i = 0; i<k; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels++;
            }
        }

        int left = 0;
        int right = k;

        int currentVowels = vowels;
        while(right < s.length()){
            if(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u'){
                currentVowels--;
            }

            if(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u'){
            currentVowels++;
           }

           vowels = Math.max(vowels, currentVowels);
           left++;
           right++;
        }
        return vowels;
    }
}