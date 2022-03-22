import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Formulario extends JFrame implements ActionListener {
	private JButton sube, baja, sortear;
	private JLabel valor, resultado;
	private JMenuBar mb;
	private JMenu m1;
	private JMenuItem mi1;
	private int revisados = 0;
     private int norevisados = 0;

	
	public Formulario()
	{
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		m1 = new JMenu ("Opciones");
		mb.add(m1);
		mi1 = new JMenuItem("Ver dialogo");
		mi1.addActionListener(this);
		m1.add(mi1);
		valor = new JLabel("0",JLabel.CENTER);
		valor.setBounds(10,50,80,30);
		valor.setFont(new Font("Aria",Font.BOLD,20));
		add(valor);
		sube = new JButton("^");
		sube.setBounds(100,30,60,40);
		sube.addActionListener(this);
	    add(sube);
	    baja = new JButton ("cero");
	    baja.setBounds(100,75,60,40);
	    baja.addActionListener(this);
	    add(baja);
	    sortear = new JButton("Sortear");
	    sortear.setBounds(10,130,150,40);
	    sortear.addActionListener(this);
	    add(sortear);
	    resultado = new JLabel("");
	    resultado.setBounds(170,130,60,60);
	    resultado.setOpaque(true);
	    add(resultado);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sube)
		{
			int x = Integer.parseInt(valor.getText());
			x++;
			valor.setText(String.valueOf(x));
		
		}
			
			if (e.getSource()==baja)
			{
				valor.setText("0");
				
			}
	
		
		if (e.getSource()== sortear)
		{
			int sorteo = 1+(int)(Math.random()*3);
			int bul=Integer.parseInt(valor.getText());
			if(sorteo==1)
			{
				resultado.setBackground(Color.red);
				revisados = revisados + bul;
				
			}
			else
			{
				resultado.setBackground(Color.blue);
				norevisados = norevisados+bul;
			}
			valor.setText("0");
			
		}
		if(e.getSource()==mi1)
		{
			DialogoEstadistica de = new DialogoEstadistica(revisados,norevisados);
			de.setBounds(10,10,300,300);
			de.setVisible(true);
		}

	}
	public static void main (String []ar)
	{
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
	}
	

}
