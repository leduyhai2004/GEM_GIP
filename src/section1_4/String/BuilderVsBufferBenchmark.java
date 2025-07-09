package section1_4.String;

public class BuilderVsBufferBenchmark {
    public static void main(String[] args) {
        final int N = 10_000_000;

        // 1. StringBuffer
        long start1 = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbuf.append("a");
        }
        long timeBuffer = System.currentTimeMillis() - start1;

        // 2. StringBuilder
        long start2 = System.currentTimeMillis();
        StringBuilder sbuild = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sbuild.append("a");
        }
        long timeBuilder = System.currentTimeMillis() - start2;

        System.out.printf("StringBuffer: %d ms%nStringBuilder: %d ms%n",
                timeBuffer, timeBuilder);


    }
}

