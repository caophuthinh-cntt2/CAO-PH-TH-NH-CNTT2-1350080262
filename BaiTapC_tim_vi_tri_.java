package baitapc_tim_vi_tri_;
import java.util.Scanner;
public class BaiTapC_tim_vi_tri_
{
    static void NhapMang(int a[]) 
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) 
        { 
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    static void XuatMang(int a[]) 
    { 
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void TimViTriX(int a[], int x) 
    { 
        boolean found = false;
        System.out.print("Vi tri cua " + x + " trong mang: ");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == x)
            {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found)
            System.out.print("Khong tim thay " + x + " trong mang.");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien n: "); 
        int n = sc.nextInt();
        int a[] = new int[n];
        NhapMang(a); 
        System.out.print("Mang vua nhap la: ");
        XuatMang(a);
        System.out.print("Nhap so x can tim: "); 
        int x = sc.nextInt();
        TimViTriX(a, x); 
    }
}
