public class Problem3 {
   
    public static void main(String[] args) {
        int low = 1; 
        int high = 20;
        
        BigOInterface bigO = new BigO();
        for (int n = low; n <= high; n ++) {
            long startTime = System.nanoTime();
            bigO.constant(n);
            long endTime = System.nanoTime();
            long difference = endTime - startTime;
            System.out.println("constant(" + n + "): " + difference + " nanoseconds");
        }
        
        for (int n = low; n <= high; n ++) {
            long startTime = System.nanoTime();
            bigO.cubic(n);
            long endTime = System.nanoTime();
            long difference = endTime - startTime;
            System.out.println("cubic(" + n + "): " + difference + " nanoseconds");
        }
                
        for (int n = low; n <= high; n ++) {
            long startTime = System.nanoTime();
            bigO.exp(n);
            long endTime = System.nanoTime();
            long difference = endTime - startTime;
            System.out.println("exp(" + n + "): " + difference + " nanoseconds");
        }
    }    
}
