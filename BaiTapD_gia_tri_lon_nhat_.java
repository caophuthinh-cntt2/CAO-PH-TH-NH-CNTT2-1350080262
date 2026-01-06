package baitapd_gia_tri_lon_nhat_;
import java.util.Scanner;
public class BaiTapD_gia_tri_lon_nhat_ 
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

    static int TimMax(int a[]) 
    { 
        int max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
                max = a[i];
        }
        return max;
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
        int max = TimMax(a); 
        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }
}
