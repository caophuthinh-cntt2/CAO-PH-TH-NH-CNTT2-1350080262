package baitapa_nhap_mang_mot_chieu;
import java.util.Scanner;
public class BaiTapA_nhap_mang_mot_chieu
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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien n: ");
        int n = sc.nextInt();
        int a[] = new int [n];
        NhapMang(a);
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
