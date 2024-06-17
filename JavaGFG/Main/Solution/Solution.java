// class Solution {
//     static String armstrongNumber(int n) {
//         int temp, digits = 0, last = 0, sum = 0;
//         temp = n;
//         while (temp > 0) {
//             temp = temp / 10;
//             digits++;
//         }
//         temp = n;
//         while (temp > 0) {
//             last = temp % 10;
//             sum += (Math.pow(last, digits));
//             temp = temp / 10;
//         }
//         if (n == sum) {
//             return "true";
//         } else {
//             return "false";
//         }
//     }
// }


//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            return "true";
        } else {
            return "false";
        }
    }
}



