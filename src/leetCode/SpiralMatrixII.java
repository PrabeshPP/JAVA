package leetCode;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0,down=n-1,left=0,right=n-1;
        int direction=0;
        int num=1;
        while(top<=down && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    matrix[top][i]=num;
                    num++;
                }
                top--;
            }
            num++;
            if(direction==1){
                for(int i=top;i<=down;i++){
                    matrix[i][right]=num;
                    num++;
                }
                right--;
            }
            num++;

            if(direction==2){
                for(int i=right;i>=left;i++){
                    matrix[down][i]=num;
                    num++;
                }
                down--;
            }
            num++;

            if(direction==2){
                for(int i=down;i>=top;i++){
                    matrix[left][i]=num;
                    num++;
                }
                left++;
            }

            direction=(direction+1)%4;
        }

        return matrix;

    }
}
