class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] zeroMap = new boolean[matrix.length][matrix[0].length];
        HashSet<Integer> rowList = new HashSet<Integer>();
        HashSet<Integer> columnList = new HashSet<Integer>();
        for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[i].length;j++){
         if(matrix[i][j]==0)zeroMap[i][j] = true;
            }
        }
        for(int i = 0;i<zeroMap.length;i++){
            for(int j = 0;j<zeroMap[i].length;j++){
          if(zeroMap[i][j]==true){
                    if(!rowList.contains(i)){
                      for(int k = 0;k<matrix[i].length;k++){
                          matrix[i][k] = 0;
                        }
                        rowList.add(i);
                    }if(!columnList.contains(j)){
                for(int k = 0;k<matrix.length;k++){
                            matrix[k][j] = 0;
                        }
                 columnList.add(j);                        
                    }
                }
            }
        }
    }
}