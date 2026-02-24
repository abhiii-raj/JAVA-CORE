public class SelectionSt {
    public static void main(String args[]){
        boolean b = true;
        //if statemenst
        if(b){
            System.out.println("b is true");
        }
        
        //if-else statements
        if(b){
            System.out.println("b is true");
        }else{
            System.out.println("b is false");
        }

        //odd-even
        int num = 2;
        if(num % 2 == 0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }

        //nested if 
        if(b){
            if(num % 2 == 0){
                //lines of code
            }
        }

        //if-else-if ladder
        if(num < 2){
            //lines of code
        }
        else if(num == 2){
            //lines of code
        }
        else if(num != 2){
            //lines of code
        }else{
            //lines of code
        }
    }
}
