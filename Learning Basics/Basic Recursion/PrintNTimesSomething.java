public class PrintNTimesSomething {
    static int count = 0;
        public static void printNTimes()
        {
            if(count == 5)
            {
                return;
            }
            System.out.println(count);
            count++;
            printNTimes();
        }

    public static void main(String[] args) {
        printNTimes();
    }
}