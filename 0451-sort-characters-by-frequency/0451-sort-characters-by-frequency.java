class Solution {
    public String frequencySort(String s) {
         // 1. ASCII frequency array
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // 2. Buckets by frequency
        List<Character>[] buckets = new List[s.length() + 1];
        for (int i = 0; i < 128; i++) {
            int f = freq[i];
            if (f > 0) {
                if (buckets[f] == null)
                    buckets[f] = new ArrayList<>();
                buckets[f].add((char) i);
            }
        }

        // 3. Build output
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}