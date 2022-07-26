import java.util.Locale;
import java.util.Scanner;

public class B3_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi s: ");
        String s = sc.nextLine();
        s = s.toLowerCase(Locale.ROOT);
        char[] s1 = s.toCharArray();
        if ( (s1[0]>=97 && s1[0]<=122) ) s1[0]-=32;
        int n = s.length()-1;
        int i=0;
        while (i<=n)
        {
            if ( (s1[i]>='0' && s1[i]<='9') || (s1[i]==' ' && s1[i+1]==' '))
            {
                for (int j=i; j<n; j++)
                {
                    s1[j]=s1[j+1];
                }
                s1[n]=' ';
                n--;
            }
            else i++;
        }
        for (i=1; i<s.length(); i++)
        {
            if ( (s1[i]>=97 && s1[i]<=122) && s1[i-1]==' ' ) s1[i]-=32;
        }
        s = String.copyValueOf(s1);
        System.out.println(s.trim());
    }
}
