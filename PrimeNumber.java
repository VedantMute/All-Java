public class PrimeNumber {
    class PrimeNumberFind
    {
        int num,j, count=0;
        public void findPrime(int n)
        {
            for (int i = 2; i <=n; i++)
            {
                count = 0; // reset count to 0 before each iteration of the inner loop
                for (j = 1; j < i; j++) 
                {
                    if (i%j==0) 
                    {
                        count++;
                    }
                }
                if (count == 2) 
                {
                    System.out.print(j+" ,");
                }
            }
        }

    }
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        PrimeNumberFind pnf = pn.new PrimeNumberFind();
        pnf.findPrime(15);
    }
}
