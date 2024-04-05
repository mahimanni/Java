import java.awt.*;
import java.applet.*;
/*<APPLET code= "bus" width= "250" height="200"></APPLET>*/
public class bus extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(Color.yellow);
  g.fillRect(10, 60, 100, 70);
  g.setColor(Color.black);
  g.fillRect(15, 70, 15, 30);
  g.fillRect(35, 70, 15, 30);
  g.fillRect(55, 70, 15, 30);
  g.fillRect(75, 70, 15, 30);

  g.setColor(Color.black);
  g.fillOval(20, 120, 20, 20);
  g.fillOval(70, 120, 20, 20);
  

 }
}

  