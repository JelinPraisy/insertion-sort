import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int t=0;t<T;t++){
            int len1=in.nextInt();
            int len2=in.nextInt();
            int A[]=new int[len1];
            for(int i=0;i<len1;i++){
                A[i]=in.nextInt();
            }
            int B[]=new int[len2];
            for(int i=0;i<len2;i++){
                B[i]=in.nextInt();
            }
            int i=0,j=0,k=0;
		    int C[]=new int[len1+len2];
		    while(i<len1 && j<len2){
			    if(A[i]<= B[j]){
			        C[k]=A[i];
				    k++;
				    i++;
			    }
			    else{
				    C[k]=B[j];
			    	k++;
			    	j++;
		    	}
	    	}
		    while(i<len1){
		    	C[k]=A[i];
		    	k++;
		    	i++;
	     	}
	    	while(j<len2){
		    	C[k]=B[j];
		    	k++;
		    	j++;
	    	}
	    	for(int l=0;l<C.length;l++){
	    	    System.out.print(C[l]+" ");
	    	}
        }
    }
}
