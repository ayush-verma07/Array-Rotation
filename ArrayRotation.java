//Ayush Verma
//This code is an example of Array Rotation
import java.util.*;

public class ArrayRotation
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[arr.length];
        System.out.print("How much do you want to rotate the array by? --> ");
        int d = console.nextInt();
        d = d % arr.length;

        int i = 0;
        for(; i < arr.length - d; i++)
        {
            result[i] = arr[d + i];
        }
        for(int a = 0; a < d; a++)
        {
            result[i + a] = arr[a];
        }
        print(result);
    }

    public static void print(int[] temp)
    {
        for(int x = 0; x < temp.length; x++)
        {
            if(!(x == temp.length - 1))
            {
                System.out.print("" + temp[x] + ", ");
            }
            else{
                System.out.println("" + temp[x]);
            }
            
        }
    }  
}