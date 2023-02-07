package main.java.array.FloodFill;

//https://leetcode.com/problems/flood-fill/description/
//733. Flood Fill
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int preColor = image[sr][sc];
        if (preColor != color) {
            change(image, sr, sc, color, preColor);
        }
        return image;
    }

    public void change(int[][] image, int sr, int sc, int color, int preColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != preColor) {      //which we should not be done.
            return;
        }
        image[sr][sc] = color;
        change(image, sr + 1, sc, color, preColor);
        change(image, sr - 1, sc, color, preColor);
        change(image, sr, sc + 1, color, preColor);
        change(image, sr, sc - 1, color, preColor);
    }
}
