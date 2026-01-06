package baitapg_mang_tang_dan_;
import java.util.Scanner;
import java.util.Arrays;
public class BaiTapG_sap_xep_tang_dan_
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

    static void SapXepTangDan(int a[]) 
    {
        Arrays.sort(a);
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
        SapXepTangDan(a); 
        System.out.print("Mang sau khi sap xep tang dan: ");
        XuatMang(a);
    }
}
