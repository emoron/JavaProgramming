import javax.swing.*;
import java.awt.*;

class JButtonFrame extends JFrame{
  private static final int FRAME_WIDTH = 300;
  private static final int FRAME_HEIGTH = 200;
  private static final int FRAME_X_ORIGIN = 150;
  private static final int FRAME_Y_ORIGIN = 250;

  private JButton cancelButton;
  private JButton okButton;


  public static void main (String [] args){
    JButtonFrame frame = new JButtonFrame();
    frame.setVisible(true);
  }
  public JButtonFrame(){
    Container contentPane = getContentPane();

    setSize (FRAME_WIDTH,FRAME_HEIGTH);
    setResizable(false);
    setTitle("Programa de JFrame");
    setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

    contentPane.setLayout(new FlowLayout());

    okButton = new JButton("OK");
    contentPane.add(okButton);

    cancelButton = new JButton("Cancel");
    contentPane.add(cancelButton);


    setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
