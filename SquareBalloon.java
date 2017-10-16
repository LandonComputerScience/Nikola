import java.awt.*;

public class SquareBalloon extends Balloon
{

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public SquareBalloon()
  {
    super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public SquareBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }

  /**
   * Returns the x-coordinate of the center.
   */


  public double distance(int x, int y) {
    double dx = Math.abs(2*(x - getX()));
    double dy = Math.abs(y - getY());
    return Math.max(dx, dy);
  }

  public void draw(Graphics g, boolean makeItFilled)
  {
    int x = getX();
    int y = getY();
    int r = getRadius();

    g.setColor(getColor());
    if (makeItFilled)
      g.fillRect(x - r,
              y - r, r, r);
    else
      g.drawRect(x - r,
              y - r, r, r);
  }
}
