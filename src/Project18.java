import java.io.Serializable;
import java.util.HashMap;


public class Project18 {
	
	
public void problem18(){
		
		int[] a = {75};
		int[] b = {95,64};
		int[] c = {17,47,82};	
		int[] d = {18,35,87,10};
		int[] e = {20,04,82,47,65};
		int[] f = {19,1,23,75,03,34};
		int[] g = {88,02,77,73,07,63,67};
		int[] h = {99,65,04,28,06,16,70,92};		
		int[] k = {41,41,26,56,83,40,80,70,33};
		int[] l = {41,48,72,33,47,32,37,16,94,29};
		int[] m = {53,71,44,65,25,43,91,52,97,51,14};
		int[] n = {70,11,33,28,77,73,17,78,39,68,17,57};
		int[] o = {91,71,52,38,17,14,91,43,58,50,27,29,48};
		int[] p = {63,66,4,68,89,53,67,30,73,16,69,87,40,31};
		int[] q = {4,62,98,27,23,9,70,98,73,93,38,53, 60, 04,23};
		
		
		
		
 		int[][] input = {q,p,o,n,m,l,k,h,g,f,e,d,c,b,a};
		
 		Integer pos = 0;
 		
 		HashMap<Integer, Pair> paths = new HashMap<Integer, Pair>();
 						
	
 		
 		for(int i=0; i < input.length;i++){		
									 
			paths.put(i,calcPath(input[i], pos));
			pos = paths.get(i).position;
			
             }
		     
 		
		int sum=0; 
		for(Pair xy : paths.values())
			sum+= xy.value;
			
			System.out.println(sum);
			
			
			
		}
public Pair calcPath(int[] input, int i){
	
	int maxVal=0;
	int pos = 0;
	
	
	for(int j=0; j< input.length; j++){
		
		
		
		if(input[j] > maxVal && (i-j < 2 && i-j > -2)){
			
			maxVal = input[j];
			pos = j;
		
		 }
							   
	   }	
	
	
	Pair answer = new Pair(pos, maxVal);
				
	return answer;
	
	
}

}

class Pair implements Serializable {

	int position;
	int value;

	Pair(int position, int value) {

		this.position = position;
		this.value = value;

	}
}
