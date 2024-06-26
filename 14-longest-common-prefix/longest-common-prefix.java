/*
The idea is to sort the array of strings and find the common prefix of the 
first and last string of the sorted array.
*/
class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int size = strs.length;

        if(size == 0)
        return "";

        if(size == 1)
        return strs[0];

        Arrays.sort(strs);

        int min_length = Math.min(strs[0].length(), strs[size-1].length());

        int i = 0;
        while(i < min_length && strs[0].charAt(i) == strs[size-1].charAt(i))
        i++;

        String result = strs[0].substring(0,i);

        return result;
    }
}