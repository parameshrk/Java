package Arrays;

public class CharTwoDDemo {

    public static void main(String[] args) {
        char[][] a = { {'a','b','c','d'} ,
                {'e','f','g','h'} ,
                {'i','j','k','l'} ,
                {'m','n','o','p'},
                {'q','r','s','t'} };

        int row = a.length;
        int col = a[1].length; // 4

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
