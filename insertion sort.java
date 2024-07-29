import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=1;i<arr.length;i++){
			int currentelement=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>currentelement){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=currentelement;
		}
		System.out.println(Arrays.toString(arr));
    }
}
