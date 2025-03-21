class Solution {
  public int firstCompleteIndex(int[] arr, int[][] len) {
    var m = len.length;
    var n = len[0].length;
    var rows = new int[m];
    var cols = new int[n]; 
    var map = new int[m*n][2];
    for (var i=0; i<m; i++) {
      for (var j=0; j<n; j++) {
        var a = len[i][j] - 1;
        map[a][0] = i;
        map[a][1] = j;
      }
    }
    for (var i=0; i < arr.length; i++){
      var a = arr[i] - 1;
      rows[map[a][0]]++;
      cols[map[a][1]]++;      
      if (rows[map[a][0]] == n || cols[map[a][1]] == m){
        return i;
      }
    }    
    return m*n;
  }
}