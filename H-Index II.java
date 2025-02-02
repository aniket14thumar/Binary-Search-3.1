// Time Complexity : O(log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            int diff = n - mid;
            
            if(diff == citations[mid]) return diff;
            else if(diff > citations[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return n - low;
    }
}