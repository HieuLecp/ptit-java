import java.util.*;
public class Bai6 {
    class User{
        private String username, password;
        public User(String usename, String password){
            this.username=usename;
            this.password=password;
        }
        public int equals(User other){
            if(this.username.equals(other.username) && this.password.equals(other.password))
                return 1;
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        List<User> users= new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            String[] s= sc.nextLine().split("\\s+");
            users.add(new User(s[0], s[1]));
        }
        int m= Integer.parseInt(sc.nextLine());
        int a[]= new int[n];
        while(m-- >0)
        {
            String[] s= sc.nextLine().split("\\s+");
            User u= new User(s[0], s[1]);
            for(int j=0; j<n; j++)
            {
                if(users.get(j).equals(u) == 1)
                    a[j]++;
            }
        }
        for(int j=0; j<n; j++)
        {
            System.out.println(a[j] + " ");
        }
    }
}
