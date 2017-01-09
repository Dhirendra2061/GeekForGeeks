
public class FindPairinArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={4,2,3,6,5,1,7,8};
		int sum=10;
		pairSum(A,sum);

	}
	
	public static void pairSum(int[] input,int sum){
		int MAX=100;//Range of the input numbers
		boolean bol[]=new boolean[MAX];
		for(int i=0;i<input.length;++i){
			int temp=sum-input[i];
			if(temp>0 && bol[temp]==true){
				System.out.println("Pair with Sum ::"+sum + "  are ::("+input[i]+"," +temp +")");
				}
			bol[input[i]]=true;
		}
		
	}

}
