package baitape_gia_tri_nho_nhat_;
import java.util.Scanner;
public class BaiTapE_gia_tri_nho_nhat_ 
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

    static int TimMin(int a[]) 
    { 
        int min = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        return min;
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
        int min = TimMin(a); 
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
