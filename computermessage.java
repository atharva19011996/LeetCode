
public class ComputerMessagePath {

	public static void main(String[] args) {
		int[][] inputmatrix = new int[8][8];
		for(int i=0;i<inputmatrix.length;i++) {
			for(int j=0;j<inputmatrix[i].length;j++) {
				inputmatrix[0][0]=1;
				inputmatrix[0][1]=0;
				inputmatrix[0][2]=1;
				inputmatrix[0][3]=1;
				inputmatrix[0][4]=1;
				inputmatrix[0][5]=0;
				inputmatrix[0][6]=0;
				inputmatrix[0][7]=1;
				
				
				inputmatrix[1][0]=1;
				inputmatrix[1][1]=0;
				inputmatrix[1][2]=0;
				inputmatrix[1][3]=0;
				inputmatrix[1][4]=1;
				inputmatrix[1][5]=1;
				inputmatrix[1][6]=1;
				inputmatrix[1][7]=1;

				
				inputmatrix[2][0]=1;
				inputmatrix[2][1]=0;
				inputmatrix[2][2]=0;
				inputmatrix[2][3]=0;
				inputmatrix[2][4]=0;
				inputmatrix[2][5]=0;
				inputmatrix[2][6]=0;
				inputmatrix[2][7]=0;

				
				inputmatrix[3][0]=1;
				inputmatrix[3][1]=0;
				inputmatrix[3][2]=1;
				inputmatrix[3][3]=0;
				inputmatrix[3][4]=9;
				inputmatrix[3][5]=0;
				inputmatrix[3][6]=1;
				inputmatrix[3][7]=1;

				
				inputmatrix[4][0]=1;
				inputmatrix[4][1]=1;
				inputmatrix[4][2]=1;
				inputmatrix[4][3]=0;
				inputmatrix[4][4]=1;
				inputmatrix[4][5]=0;
				inputmatrix[4][6]=0;
				inputmatrix[4][7]=1;

				
				inputmatrix[5][0]=1;
				inputmatrix[5][1]=0;
				inputmatrix[5][2]=1;
				inputmatrix[5][3]=0;
				inputmatrix[5][4]=1;
				inputmatrix[5][5]=1;
				inputmatrix[5][6]=0;
				inputmatrix[5][7]=1;

				
				inputmatrix[6][0]=1;
				inputmatrix[6][1]=0;
				inputmatrix[6][2]=0;
				inputmatrix[6][3]=0;
				inputmatrix[6][4]=0;
				inputmatrix[6][5]=1;
				inputmatrix[6][6]=0;
				inputmatrix[6][7]=1;

				
				inputmatrix[7][0]=1;
				inputmatrix[7][1]=1;
				inputmatrix[7][2]=1;
				inputmatrix[7][3]=1;
				inputmatrix[7][4]=1;
				inputmatrix[7][5]=1;
				inputmatrix[7][6]=1;
				inputmatrix[7][7]=1;

				
				
			}
		}
		func(inputmatrix,0,0);
	}
	public static boolean func(int[][] inputmatrix,int i,int j) {
		if(inputmatrix==null || inputmatrix.length==0) {
			return false;
		}
		if(inputmatrix[0][0]==0) {
			System.out.println(false);
			
			return false;
		}
		boolean res= dfs(inputmatrix,0,0);
		System.out.println(res);
		return res;
	}
	public static boolean dfs(int[][] inputmatrix,int i,int j) {
		if(i<0 || i>=inputmatrix.length || j<0||j>=inputmatrix[i].length || inputmatrix[i][j]==0)
		{
			return false;
		}
		if(inputmatrix[i][j]==9) {
			return true;
		}
		if(inputmatrix[i][j]==1) {
			inputmatrix[i][j]=0;
			
		}
		return dfs(inputmatrix,i-1,j)||
		 dfs(inputmatrix,i+1,j) ||
		 dfs(inputmatrix,i,j-1)||
		 dfs(inputmatrix,i,j+1);

		
	}
}
