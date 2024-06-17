//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class CountDigits {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int n){
    
    //code here
    //for loop to be added
    for(int i=1;i<=10;i++){
        System.out.print(i*n+" ");
    }
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            utility(n);
            System.out.println();
        }
        scn.close();
    }
}