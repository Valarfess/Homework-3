package academy.belhard;

public class Main {

    public static void main(String[] args) {
//        int month = 10;
//
//        if (month == 12 || month == 1 || month == 2) {
//            System.out.print("Зима");
//        }
//            else if (month == 3 || month == 4 || month == 5){
//                System.out.print("Весна");
//        }
//        else if (month == 6 || month == 7 || month == 8) {
//            System.out.print("Лето");
//        }
//        else if (month == 9 || month == 10 || month == 11) {
//            System.out.print("Осень");
//        }
//
//
//        int month = 8;
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("осень");
//                break;
//        }


//        int [] array1 = {0,1,2,3,4,5,6,7,8,9};
//        for (int i = array1.length-1; i >= 0; i--)
//        { System.out.println(array1[i]); }

        int[][] squareArray = new int[2][2];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[1][0] = 3;
        squareArray[1][1] = 4;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "[" + i + "][" + j + "]" + "\t");
            }
            System.out.println();
        }
//
//        String [][] squareArray2 = new String[2][2];
//        squareArray2[0][0] = "[0][0]";
//        squareArray2[0][1] = "[0][1]";
//        squareArray2[1][0] = "[1][0]";
//        squareArray2[1][1] = "[1][1]";
//           for (int x = 0; x < squareArray2.length; x++) {
//                for (int y = 0; y < squareArray2[x].length; y++) {
//                    System.out.print(squareArray2[x][y] + "\t");
//                    }
//                    System.out.println();
//                }
        // write your code here
    }
}




//for (int i = 0; i < squareArray.length; i++) {
//        for (int j = 0; j < squareArray[i].length; j++) {
//                System.out.print(squareArray[i][j] + "\t");
//            }
//            System.out.println();
//        }
