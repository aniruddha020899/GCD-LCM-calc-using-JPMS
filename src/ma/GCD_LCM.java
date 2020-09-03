package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class W1 extends JFrame
{
Container c;
JTextField en1;
JTextField en2;
JButton calculate;

W1(){
c=getContentPane();
c.setLayout(new FlowLayout());
en1=new JTextField(15);
en2=new JTextField(15);
calculate=new JButton("Calculate");
c.add(en1);
c.add(en2);
c.add(calculate);


ActionListener e1=(ae)->{
int a=Integer.parseInt(en1.getText());
int b=Integer.parseInt(en2.getText());
int max, step, lcm = 0;
      if(a > b){
         max = step = a;
      } else{
         max = step = b;
      }
      while(a!= 0) {
         if(max%a == 0 && max%b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }

   
      int i, hcf = 0;
         for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
            hcf = i;
         }

JOptionPane.showMessageDialog(null,"GCD is:"+hcf+" and LCM is:"+lcm);};
calculate.addActionListener(e1);


setTitle("Practical 1");
setSize(300,300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class GCD_LCM
{
public static void main(String args[])
{
W1 w=new W1();
}
}