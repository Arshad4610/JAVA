import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/
public class Rectangles extends Applet {
public void paint(Graphics g) 
{
setForeground(Color.yellow);
g.drawRoundRect(70, 90, 140, 100, 30, 40);
g.fillRoundRect(70, 90, 140, 100, 30, 40);
setBackground(Color.red);
}
}
