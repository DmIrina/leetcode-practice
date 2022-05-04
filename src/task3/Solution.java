package task3;

import java.util.Hashtable;

class Solution {

    public static Hashtable<Character, Integer> createHashTable() {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);
        return hashtable;
    }

    public int romanToInt(String s) {
        Hashtable<Character, Integer> hashtable = createHashTable();
        char[] roman = s.toCharArray();
        int count = 0;
        for (int i = 0; i < roman.length; i++) {
            if (i < roman.length - 1 && hashtable.get(roman[i]) < hashtable.get(roman[i + 1])) {
                count += hashtable.get(roman[i + 1]) - hashtable.get(roman[i]);
                i++;
            } else {

                count += hashtable.get(roman[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
