// Program per gjetjen e vitit te brishte i cili jepet ne menyre interaktive nga shfrytezuesi
import javax.swing.*;
public class Detyra12_03_2 {
   public static void main(String[]args) {
   
      int viti = new Integer(JOptionPane.showInputDialog("Shkruani vitin: ")).intValue();     
   
      boolean brishte = ((viti % 4 == 0) && (viti % 100 != 0) || (viti % 400 == 0));
      if (brishte)
      {JOptionPane.showMessageDialog(null,"Viti "+viti + " eshte vit i brishte.");}
       
      else
      {JOptionPane.showMessageDialog(null,"Viti "+viti + " nuk eshte viti i brishte.");}
   }
}