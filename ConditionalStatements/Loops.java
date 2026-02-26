public class Loops {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);
        // ....... upto n times;

        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++; //if not mentioned you will struck into an infinte loop
        }
        /*until the controlling expression is true the scope will be executed
        the condition can be any boolean expression */

        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a <=5);
        /*use in cases you have multiple items to select
        menu driven system , menu selection system, game */

        // do{
        //     select 1;
        //     select 2;
        //     select 3:
        //     select 4:
        //     .
        //     .
        //     .
        // }while(controlling expression);
        

        //FOR LOOP
        for(int x = 0 ; x <= 10 ;x++){
            System.out.println(x);
        }

        /*
        flow of control of for
        1. First assignment statement is executed (variable definition)
        2. Then second conditional statement is evaluated(true / false)
        3. If true, control flow will evaluate the body of the loop
        4. 
        */
    }
}
