import java.awt.*;

/**
 * Description: A grid that holds a default color and size and other data that helps create a map.
 * It is essentially the frame for the map.
 * 
 * @author Monique Blake and Partner
 * @version 3 February 2011
 */
public final class MapGrid {
    /** "height" is the height for the entire grid. */
    private int height;

    /** "width" is the width for the entire grid.  */
    private int width;

    /** "row" specifies the width of each row in the grid. */
    private int row;

    /** "column" specifies the height of each column in the grid. */
    private int column;

    /** "clr" specifies the default color of the grid. */
    private Color clr;

    /** alternative, shorthand name for column */
    private int c;

    /** alternative, shorthand name for row */
    private int r;

    /** the color you want to paint the individual squares  */
    private Color imagecolor;
    
    /** This is a 2D array of color that holds the default color of the grid. */
    Color[][] colorgrid;
    
    /** Assigns a default color to the 2D array. 
     * @param "height" is the height of the grid.
     * @param "width" is the width of the grid.
     */
    public MapGrid(int height, int width){
 colorgrid = new Color[height][width];
    for (int i = 0; i<colorgrid.length; i++){
 for (int j = 0; j<colorgrid[i].length; j++){
      colorgrid[j][i] = Color.black; 
 }
    }
    }
    /** @returns the height of the grid. */
    public int getHeight(){
 return height;
    }
    /** @param "h" passes in the height of the grid. */
    public void setHeight(int h){
 height = h;
    }
    /** @returns the width of the grid. */
    public int getWidth(){
 return width;
    }
    /** @param "w" passes in the width of the grid. */
    public void setWidth(int w){
 width = w;
    }
    /** sets row and r to each other to mean the same thing  */
    public void row(int r){
 row = r;
    }
    /** sets column and c to each other to mean the same thing */
    public void column(int c){
 column= c;
    }
    /** @returns the color of a specific index.
     *  @param passes in the column of the array (height) second dimension
     *  @param passes in the row of the array (width) first dimension
     */
    public Color getColor(int column, int row){  
 return colorgrid[column][row];
    }
    /** @param "startX" is the starting x value of the section to be filled. 
     *  @param "startY" is the starting y value of the section to be filled.
     * @param "endX" is the ending x value of the section to be filled.
     * @param "endY" is the ending y value of the section to be filled.
     * @param "imagecolor" is the color of the new section to be filled.
     */ 
    public void alterMap(int startX, int startY, int endX, int endY, Color imagecolor){
 for (int i = startX; i<startX + endX; i++){
     for (int j = startY; j<startY + endY; j++){
        colorgrid[j][i] = imagecolor;
     }
 }
    }
}
 