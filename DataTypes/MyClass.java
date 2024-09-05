public class MyClass{
    public static void main(String[] args) {
        System.out.println("Single Dimmention Arrays");

        int[] numbersArray = new int[6];

        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;
        numbersArray[5] = 60;

        for (int num : numbersArray) {
            System.out.println("numbers are " + num);   
        }

        System.out.println("Two Dimmention Arrays");

        int[][] dobbleArrays = new int[3][3];

        dobbleArrays[0][1] = 1;
        dobbleArrays[0][2] = 2;
        dobbleArrays[0][3] = 3;
        dobbleArrays[0][4] = 4;
        dobbleArrays[0][5] = 5;
        dobbleArrays[0][6] = 6;
        dobbleArrays[0][7] = 7;

       for (int[] i : dobbleArrays) {
        System.out.println(i);
       }


       class increment {
 
 
        public static void main(String args[]) 
 
        {        
 
             int g = 3;
 
             System.out.print(++g * 8);
 
        } 
 
    }
    }
}