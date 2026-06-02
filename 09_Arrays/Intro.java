public class Intro {
    public static void main(String args[]){
        int rollNumber1 = 101;
        int rollNumber2 = 102;
        int rollNumber3 = 103;

        // the code above is the wrong way to do so
        // and the solution to the problem is array

        int arr[] = new int[3];
        arr[0] = 101;
        arr[1] = 102;
        arr[2] = 103;

        // retrieve all the values and index;
        for(int i = 0 ;i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}
