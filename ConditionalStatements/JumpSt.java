public class JumpSt {
    public static void main(String args[]) {

        // break - to stop the iteration from iterating based on a condition
        // for(int i = 0 ;i<5 ;i++){
        // if(i > 3){
        // break;
        // }
        // System.out.println(i);
        // }

        // //continue - to skip certain iteration based on the condition
        // for(int i = 0 ; i< 6 ;i++){
        // if(i % 2 == 0){
        // continue;
        // }
        // System.out.println(i);
        // }

        // prime check
        int n = 12;
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

        // Labels
        outer: for (int i = 1; i <= 10; i++) {
            inner: for (int j = 1; j <= i; j++) {
                if (j == 3) {
                    break outer;
                }
            }
        }


        //codeblocks
        first : {
            second :{
                third :{
                    System.out.println("Hello");
                }
            }
        }
    }
}
