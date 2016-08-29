import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI extends JFrame implements ActionListener{
	

	JFrame mainFrame;
	
	JButton AddInventory;
	JButton RemoveInventory;

public GUI(){
	
}

private void Inventory_Menu(){
	
	
	AddInventory = new JButton("Add Inventory");
	RemoveInventory = new JButton ("Remove Inventory");
	
}


@Override
public void actionPerformed(ActionEvent arg0) {
	
	
}


public static void main(String args[]){
	new GUI();
}

}
