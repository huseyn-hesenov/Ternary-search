import java.util.Scanner;
public class TernarySearch
{
    public static int ternarySearch (int[] massiv, int value)
    {
        return ternarySearch(massiv, value, 0, massiv.length - 1);
    }
    public static int ternarySearch (int[] massiv, int value, int start, int end)
    {
        if (start > end)
            return -1;
        int mid1 = start + (end-start) / 3;
        int mid2 = start + 2*(end-start) / 3;
        if (massiv[mid1] == value)
            return mid1;
        else if (massiv[mid2] == value)
            return mid2;
        else if (value < massiv[mid1])
            return ternarySearch (massiv, value, start, mid1-1);
        else if (value > massiv[mid2])
            return ternarySearch (massiv, value, mid2+1, end);
        else
            return ternarySearch (massiv, value, mid1,mid2);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int n, i;
        System.out.println("integer elementler daxil edin");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        System.out.println("\nEnter "+ n +" sorted integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println("\naxtaris ucun elementi daxil edin : ");
        int key = scan.nextInt();

        int result = ternarySearch(arr, key);

        if (result == -1)
            System.out.println("\n"+ key +" element tapilmadi!!!");
        else
            System.out.println("\n"+ key +" elementin yeri tapildi "+ result);

    }
}