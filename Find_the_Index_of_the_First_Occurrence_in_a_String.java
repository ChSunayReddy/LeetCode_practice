public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
        // int m = haystack.length(), n = needle.length();
        // for (int i = 0; i <= m - n; i++) {
        //     if (haystack.substring(i, i + n).equals(needle)) {
        //         return i;
        //     }
        // }
        // return -1;
    }
    public static void main(String[] args) {
        String s="sadbutsad";
        String needle="sad";
        String haystack = "leetcode";
        String nd = "leeto";
        System.out.println(strStr(s, needle));
        System.out.println(strStr(haystack, nd));
    }
}
