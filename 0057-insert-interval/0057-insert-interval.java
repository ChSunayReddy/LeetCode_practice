class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            merged.add(interval);
        }
        merged.add(newInterval);
        Collections.sort(merged, (a, b) -> a[0] - b[0]);
        List<int[]> mergedok = new ArrayList<>();
        for (int[] interval : merged) {
            if (mergedok.isEmpty() || mergedok.get(mergedok.size() - 1)[1] < interval[0]) {

                mergedok.add(interval);
            } else {
                mergedok.get(mergedok.size() - 1)[1] = Math.max(mergedok.get(mergedok.size() - 1)[1], interval[1]);
            }
        }
        return mergedok.toArray(new int[mergedok.size()][]);
    }
}