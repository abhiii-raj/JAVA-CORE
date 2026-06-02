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

        
    }    
}
