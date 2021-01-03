package Other_questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        for(int[] i : mergeOverlappingSubIntervals(intervals)){
            System.out.println(i[0]+ " "+i[1]);
        }
    }

    private static int[][] mergeOverlappingSubIntervals(int[][] intervals) {

        ArrayList<int[]> arr = new ArrayList<>();

        if(intervals.length == 0 || intervals == null) return arr.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for( int[] i : intervals){
            if(i[0] <= end ){
                end = Math.max(end, i[1]);
            }
            else{
                arr.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        arr.add(new int[]{start,end});
        return arr.toArray(new int[0][]);
    }
}