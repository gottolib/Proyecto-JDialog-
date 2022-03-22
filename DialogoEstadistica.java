import javax.swing.*;
import java.awt.event.*;
public class DialogoEstadistica extends JDialog implements ActionListener {
	private JLabel label1, label2;
	private JButton boton1;
	public DialogoEstadistica(int total1, int total2)
	{
		setLayout(null);
		setResizable(false);
		setModal(true);
		label1 = new JLabel("Total de bultos revisados: " + total1);
		label1.setBounds(10,10,200,20);
		add(label1);
		label2 = new JLabel ("Total de bultos no revisados: " + total2);
		label2.setBounds(10,50,200,20);
		add(label2);
		boton1 = new JButton("Ok");
		boton1.setBounds(10,100,100,30);
		boton1.addActionListener(this);
		add(boton1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == boton1)
			dispose();
	}

}
