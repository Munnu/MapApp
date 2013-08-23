import java.awt. *;
import javax.swing. *;

/**
 * Description: MapViewer is responsible for displaying a particular
 * view of MapGrid.
 *
 * @author Monique Blake and Partner
 * @version 4 February 2011
 *
 */

class MapViewer extends JComponent{
  /** grid gets the MapGrid file  information */
  private MapGrid grid;
  
  /** "height" is the height of the entire grid */
  private static final int height = 400;
  
  /** "width" is the width of the entire grid */
  private static final int width = 400;
  
  /** magnification is the amount the objects on the screen will be magnified by */
  public int magnification = 1;
  
  /** Sets the offset in the X direction  */
  private int offsetX;
  
  /** Sets the offset in the Y direction  */
  private int offsetY;
  
  /** This will hold the x and y offset */
  private int offset;
  
  
  /** @param grid passes in the grid from the previous program MapGrid */
  public MapViewer(MapGrid grid){
    this.grid = grid;
    this.grid.setWidth(400);
    this.grid.setHeight(400);
  }
  /** Two int fields for offset
    * @param offsetX is the offset value in the x direction.
    * @param offsetY is the offset value in the y direction.
    */
  public void offset(int offsetY , int offsetX){
    this.offsetX = offsetX;
    this.offsetY = offsetY;
  }
  
  /**
   * @param magnification is the amount of times you will multiply height and width.  
   */
  public void Magnification(int magnification){
    this.magnification = magnification;
  }
  /** The component will look bad if it is sized smaller than this 
    * @returns the minimum dimensions 
    */
  public Dimension getMinimumSize(){
    return new Dimension(height, width);
  }
  /** The component will look best at this size, same size as getMinimumSize
    * @returns The preferred dimension.
    */
  public Dimension getPreferredSize(){
    return new Dimension(height, width);
  }
  /**
   * @param Graphics g passes in the graphics package
   */
  public void paintComponent(Graphics g){
    for (int i = 0; i <  grid.getWidth();  i++) {
      for (int j = 0; j <  grid.getHeight(); j++){
        g.setColor(grid.getColor(j,i));
        g.fillRect((i + offsetX) * magnification, (j + offsetY) * magnification, magnification, magnification);
      }
    }
  }
}