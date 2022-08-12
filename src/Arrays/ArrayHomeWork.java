package Arrays;

public class ArrayHomeWork {

    public static void main(String[] args) {

        int[] a = {9,6,56,13,77,03,98,23,51};

        //System.out.print("size=" +a.length);

        // System.out.print(a[0]);

        for(int i=0; i<a.length; i++)

        {
            if( a[i]%2 == 0 )

                System.out.println(a[i]+" even");

            else

                System.out.println(a[i]+" odd");
        }
    }
}
