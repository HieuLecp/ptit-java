import java.util.*;
public class Bai14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[500005];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        long count=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<n; i++)
        {
            while(!st.isEmpty() && a[i] >= a[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                count = count + st.size() +1;
            }
            st.push(i);
        }
        System.out.println(count);
    }
}
