import java.util.Random;

public class LightBoard {
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        Random rand = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int num = rand.nextInt(101);
                lights[i][j] = num >= 41;
            }
        }
    }

    public boolean evaluateLight(int row, int col)
    {
        int count = 0;
        if (lights[row][col]) {
            for (boolean[] light : lights) {
                System.out.println(light[col]);
                if (light[col]) {
                    count++;
                }
            }
            return !(count % 2 == 0);
        }
        else {
            for (boolean[] light : lights) {
                if (light[col]) {
                    count++;
                }
            }
            return (count % 3 == 0);
        }
    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] testBoard) {
        lights = testBoard;
    }
}
