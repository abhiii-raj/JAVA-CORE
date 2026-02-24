public class SwitchCase {
    public static void main(String[] args) {
        int day = 7;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

        for(int i = 0 ;i<6 ;i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                    System.out.println("i is less than 3");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("i is less than 6");
                    break;
            }
        }

        // nested switch
    //     switch(count){
    //         case 1:
    //             switch(target){
    //                 case 1:
    //                     //lines of code;
    //                     break;
    //                 case 2:
    //                     //lines of code;
    //                     break;
    //                 default:
    //                     //lines of code
    //             }
    //             break;
    //         case 2:
    //             // lines of codes;
    //             break;
    //         default:
    //             //lines if code
    //     }
    // }
 }
}
