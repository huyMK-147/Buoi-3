import java.util.Scanner;

public class B3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Nhap vao phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        float dem=0, tong=0, tbc;
        for (int i=0; i<n; i++)
        {
            if (a[i]%2!=0 && i%2==0)
            {
                dem++;
                tong+=a[i];
            }
        }
        if (dem==0) System.out.println("Khong co so nao thoa man dieu kien");
        else
        {
            tbc=tong/dem;
            System.out.println("Trung binh cong la: " + tbc);
        }

        int min = a[0];
        for (int i=1; i<n; i++)
        {
            if (a[i]<min) min = a[i];
        }
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        for (int i=0; i<n; i++)
        {
            if (a[i]==min) System.out.print(i+ " ");
        }
        System.out.println();

        dem=0;
        int temp=0;
        for(int i=0; i<n; i++)
        {
            temp = (int)Math.sqrt(a[i]);
            if(a[i]==Math.pow(temp,2))
            {
                dem++;
            }
        }
        if(dem==0)
        {
            System.out.print("Mang khong co so chinh phuong !");
        } else
        {
            System.out.print("Trong mang co cac so chinh phuong la: ");
        }
        for(int i=0; i<n; i++)
        {
            if((Math.sqrt((double)a[i]) % 1 == 0) && a[i]>0)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Cac so nguyen to trong mang la: ");
        dem=0;temp=0;
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=a[i]; j++)
            {
                if(a[i]>=2 & a[i] % j== 0 )
                {
                    dem++;
                }
            }
            if(dem==2)
            {
                System.out.print(a[i] + " ");
                temp++;
            }
            dem=0;
        }
        if (temp ==0 )
        {
            System.out.print("Khong co so nguyen to nao! ");
        }
        System.out.println();

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Cac phan tu trong mang sau khi sap xep la: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " " );
        }
    }
}
