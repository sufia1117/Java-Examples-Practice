public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch(){
        reset();
    }

    public long read() {
        // TODO implement this and consider a better implementation
        return endTime - startTime;
    }

    public void reset() {
        // TODO revisit and add more if needed
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        // TODO revisit and add more if needed
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        // TODO revisit and add more if needed
        endTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        // TODO create an instance of Stopwatch and test its operations
        Stopwatch stoppie = new Stopwatch();
    }

}