import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="sign" height="300" width="300"></applet>*/

public class sign extends Applet implements ActionListener
{
 TextField t1,t2,t3;
 Button addB1, subB2, mulB3, divB4;

 public void init()
 {
  t1=new TextField(5);
  t2=new TextField(5);
  add(t1);
  add(t2);
  
  addB1=new Button("+");
  add(addB1);
  addB1.addActionListener(this);
  
  subB2=new Button("-");
  add(subB2);
  subB2.addActionListener(this);

  mulB3=new Button("*");
  add(mulB3);
  mulB3.addActionListener(this);

  divB4=new Button("/");
  add(divB4);
  divB4.addActionListener(this);

  t3=new TextField(5);
  add(t3);
 }

 public void actionPerformed(ActionEvent ae)
 {
  int x=Integer.parseInt(t1.getText());
  int y=Integer.parseInt(t2.getText());
  int z=0;

  if(ae.getSource()==addB1)z=x+y;
  if(ae.getSource()==subB2)z=x-y;
  if(ae.getSource()==mulB3)z=x*y;
  if(ae.getSource()==divB4)z=x/y;

  t3.setText(z+" ");
 }
}