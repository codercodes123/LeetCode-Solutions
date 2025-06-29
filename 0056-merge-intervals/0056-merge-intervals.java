class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals.length <= 1) {
      return intervals;
    }

    Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

    List<int[]> result = new ArrayList<>();
    int[] last = intervals[0];
    result.add(last);

    for (int i = 1; i < intervals.length; i++) {
      int[] interval = intervals[i];
      if (last[1] < interval[0]) {
        result.add(interval);
        last = interval;
      } else if (last[1] < interval[1]) {
        last[1] = interval[1];
      }
    }

    return result.toArray(new int[result.size()][]);
        
    }
}