public class TimeComplexityDemo{
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));
    
        System.out.println("Time Taken : " + (System.currentTimeMillis() - now) + " millsecs ");   
    }

    /*public int findSum(int n){
        return n * (n + 1) / 2; // Time Taken : 0.0 millsecs
    }*/

    public int findSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){ // Time Taken : More
            sum += i;
        }
        return sum;
    }
}
