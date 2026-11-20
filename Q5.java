public class Q5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q5 <N>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        for (int row = n; row >= 1; row--) {
            StringBuilder line = new StringBuilder();
            for (int val = row; val >= 1; val--) {
                if (val < row) {
                    line.append(" ");
                }
                line.append(val);
            }
            System.out.println(line.toString());
        }
    }
}
