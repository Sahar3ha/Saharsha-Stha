import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name; ");
        String address = JOptionPane.showInputDialog("Address; ");
        int contact = Integer.parseInt(JOptionPane.showInputDialog("Enter phone number; "));
        JOptionPane.showMessageDialog(null,name);
        JOptionPane.showMessageDialog(null,address);
        System.exit(0);
    }
}
class Marks{
    public static void main(String[] args) {
        double maths = Double.parseDouble(JOptionPane.showInputDialog("Enter maths marks; "));
        double sci = Double.parseDouble(JOptionPane.showInputDialog("Enter sci marks; "));
        double eng = Double.parseDouble(JOptionPane.showInputDialog("Enter eng marks; "));
        double soc = Double.parseDouble(JOptionPane.showInputDialog("Enter soc marks; "));
        double total = (maths+sci+soc+eng);
        double percentage = total/4;
        JOptionPane.showMessageDialog(null,"The percentage is "+percentage);
        System.exit(0);
    }
}


