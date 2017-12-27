package Programmers.level04;

import java.util.Arrays;

public class BuildingAirport {

    public static void main(String[] args)
    {
    	BuildingAirport test = new BuildingAirport();
        int tn = 3;
        int [][]tcity = {{1,830871541},{2,52},{3,21},{4,14},{5,444}};
        //printArray(tcity);
        System.out.println(test.chooseCity(5,tcity));
    }
    
	public int chooseCity(int n, int [][]city){
	
        double dp[][] = new double[2][n];
        for(int i=0; i<n; i++) dp[0][i] = i+1;
        
        
        for(int i=0; i<n; i++){
        	int index = i;
        	double p = 1;
        	while(index > -1){
        		//왼쪽으로 가는경우
        		try {
        			--index;
        			dp[1][i] += city[index][1]*p;
        			++p;
				} catch (Exception e) {
					break;
				}
        		
        	}
        	
        	index = i;
        	p = 1;
        	while(index < n){
        		//오른쪽으로 가는경우
        		try {
        			++index;
        			dp[1][i] += (double)city[index][1]*p;
            		++p;
				} catch (Exception e) {
					break;
				}
        	}
        }
        
        printArray(dp);
        double ans = 1;
		for(int i=1; i<n; i++){
				if(dp[1][(int) (ans-1)] > dp[1][i]){
						ans = dp[0][i];
				}
		}
				

        return (int)ans;
    }
	
	 private static void printArray(double[][] a) {
			for(int i=0; i<a.length; i++){
				for(int j=0; j<a[0].length; j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}

}
