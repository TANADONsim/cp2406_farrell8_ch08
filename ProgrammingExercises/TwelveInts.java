public class TwelveInts {

    public static void main(String[] args)
    {
        final int integerNum = 12;
        int[] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < integerNum -1; ++i)
            for (int s = 0; s < integerNum -1; ++s)
                if (integers[s] > integers[s+1])
                {
                    int med = integers[s];
                    integers[s]= integers [s+1];
                    integers[s+1]=med;
                }
        System.out.println("Integers in ascending order:");
        for (int x = 0; x<= integerNum -1; x++ )
            System.out.println(integers[x]);
        System.out.println("Integers in descending order:");
        for (int n = 0; n<= integerNum -1; n++ )
            System.out.println(integers[integerNum -(1+n)]);

    }

}