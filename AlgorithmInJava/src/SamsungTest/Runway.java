package SamsungTest;

import java.util.Scanner;

public class Runway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		double [][] ground = new double[n][n];
		double [][] ground2 = new double[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				ground[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				ground2[j][i] = ground[i][j];
			}
		}
		
		//printArray(ground2);
		
		
		double[] leftRunway = new double[l];
		double[] rightRunway = new double[l];
		leftRunway[0] = 0.3;
		for(int i=1; i<leftRunway.length; i++){
			leftRunway[i] = 0.7;
		}
		for(int i=0; i<rightRunway.length-1; i++){
			rightRunway[i] = 0.7;
		}
		rightRunway[l-1] = 0.3;
		
		if(l==1){
			leftRunway[0]=0.4;
			rightRunway[0]=0.4;
			
		}
		
		
		System.out.println(solution(ground, leftRunway, rightRunway)+solution(ground2, leftRunway, rightRunway));
		
		
		//printArray(ground);

	}

	private static int solution(double[][] ground, double[] leftRunway, double[] rightRunway) {
		int ans = 0;
		for(int i=0; i<ground.length; i++){
			for(int j=0; j<ground[0].length-1; j++){
				if(ground[i][j] != ground[i][j+1] && Math.abs((ground[i][j] - ground[i][j+1])) > 0.5 ){
					
					if(ground[i][j] < ground[i][j+1]){
					try {
						
					int n=0;
					for(int k=0; k<leftRunway.length; k++){
					//	System.out.println(ground[i][j]+" "+ground[i][j-k]+" "+ground[0][2]+" "+i+" "+(j-k));
						if(ground[i][j]==ground[i][j-k]) n++;
					}
					
					if(n==leftRunway.length){
						for(int k=0; k<leftRunway.length; k++){
							ground[i][j-k]+=leftRunway[leftRunway.length-1-k];
						}
					}
					} catch (Exception e) {
						// 경사로 건설 불가
					}
					}
					
					if(ground[i][j] > ground[i][j+1]){
						try {
							
							int n=0;
							for(int k=0; k<rightRunway.length; k++){
								if(ground[i][j+1]==ground[i][j+1+k]) n++;
							}
							
							if(n==rightRunway.length){
								for(int k=0; k<rightRunway.length; k++){
								//	System.out.println(i+" "+(j+1+k)+"건설");
								//	System.out.println(rightRunway[k]);
									ground[i][j+1+k]+=rightRunway[k];
								}
							}
							} catch (Exception e) {
								// 경사로 건설 불가
							}
					}
					
				}
				
				
			}
			
		}
		
		double gap = 0.7;
		if(leftRunway.length==1) gap= 1.1;
		for(int i=0; i<ground.length; i++){
			int n = 0;
			for(int j=0; j<ground[0].length-1; j++){
				try {
				if(Math.abs(ground[i][j]-ground[i][j+1]) >= gap){
					break;
				}else{

					if(leftRunway.length == 1 && (ground[i][j]-(int)ground[i][j]) > 0.5)break;
					n++;
					if(n==ground.length-1) ans++;
				}
				} catch (Exception e) {
					break;
				}
			}
		}
		System.out.println("d "+ans);
		
		printArray(ground);
	//	System.out.println();
		return ans;


		
	}
	
	private static void printArray(double[][] ground) {
		for(int i=0; i<ground.length; i++){
			for(int j=0; j<ground[0].length; j++){
				System.out.print(ground[i][j]+" ");
			}
			System.out.println();
		}
	}

}
