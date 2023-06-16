package twoDimensionarrray;

public class Dimension {
    public static void main(String[] args) {
        int [][] myNumber = {{1, 2}, {3, 4, 5}};
            for (int i = 0; i < myNumber.length; ++i) {
                for (int j = 0; j < myNumber[i].length; j=j+2) {
                    System.out.println(myNumber[i][j]);
                }
            }
        }
    }




