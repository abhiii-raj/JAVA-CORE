public class multiDArrays {
    public static void main(String[] args) {
        int stud1HindiMarks = 97;
        int stud1EnglishMarks = 95;
        int stud1MathsMarks = 96;

        int stud2HindiMarks = 97;
        int stud2EnglishMarks = 95;
        int stud2MathsMarks = 96;

        // this is a abd practise and the the solution to this a multidimensional arrays 
        // in this case a 2d array

        int marks[][] = new int[3][3];

        marks = new int[][]{
                    {97, 95, 96}, 
                    {97, 95, 96}, 
                    {97, 95, 96}};

        // it can be visulised in the form of matrix

        //to retrive the value
        for(int i = 0 ;i<marks.length ;i++){
            for(int j = 0 ; j<marks[0].length ;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        //memeory represention of 2-d arrays
        /*
                ________________________
               |_______|_______|________|
                  |    _________________________
                   -> |_______|_______|________|
                for all the cells
        */


        // different length of 2-d arrays
        int mat[][] = new int[3][];
        mat[0] = new int[2];
        mat[1] = new int[3];
        mat[2] = new int[4];

        
    }    
}
