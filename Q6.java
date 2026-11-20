public class Q6
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Usage: java Q6 <N>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        for (int row = 1; row <= n; row++)
        {
            StringBuilder line = new StringBuilder();
            for (int val = 1; val <= row; val++)
            {
                if (val > 1)
                {
                    line.append(" ");
                }
                line.append("x");
            }
            System.out.println(line.toString());
        }
    }
}
