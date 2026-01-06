package baitapb_xuat_cac_phan_tu_mang;
import java.util.Scanner;
public class BaiTapB_xuat_cac_phan_tu_mang 
{
    static void NhapMang(int a[])
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    static void XuatMang(int a[])
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien n: ");
        int n = sc.nextInt();
        int a[] = new int [n];
        NhapMang(a);
        System.out.print("Mang vua nhap la: ");
        XuatMang(a);
    }
}