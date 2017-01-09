
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={11,11,12,13,2,3,3,3};
		majority(A);
		morreVotingAlgo(A);
	}
	
	public static void majority(int[] input){
		int MAX=1000;
		int[] hash=new int[MAX];
		int temp=0,element=0;
		for(int i=0;i<input.length;++i){
				hash[input[i]]++;
				  if(hash[input[i]] >temp){
				    temp=hash[input[i]];
				    element=input[i];
			      }
		}
		
		if(temp>=input.length/2){
			System.out.println("Mejority Element is ::"+element);
		}else{
			System.out.println("NONE");
		}
	}
	
	public static void morreVotingAlgo(int[] input){
		int majElement=input[0];
		int count=1;
		for(int i=0;i<input.length;++i){
			if(input[i]==majElement)
				count++;
			else
				count--;
			if(count==0){
				majElement=input[i];
				count=1;
			}
		}
		System.out.println("Most Occouring Element is ::"+majElement);
	}

}
