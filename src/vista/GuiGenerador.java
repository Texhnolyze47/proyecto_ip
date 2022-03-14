package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiGenerador extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaResultado;


	/**
	 * Create the frame.
	 */
	public GuiGenerador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbTitulo = new JLabel("Generador Ip");
		panel.add(lbTitulo, BorderLayout.NORTH);
		
		textAreaResultado = new JTextArea();
		panel.add(textAreaResultado, BorderLayout.CENTER);
		
		JScrollPane sp = new JScrollPane(textAreaResultado);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(sp);
		
		JButton btnGenerar = new JButton("Lista de ip");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.GuiController.boton();
			}
		});
		panel.add(btnGenerar, BorderLayout.SOUTH);
	}

	//ya que los componenetes normalmente tiene un modificador
	//private se uitliza un getter para extraer la informacion 
	//que posee el compoenete
	public JTextArea getTextAreaResultado() {
		return textAreaResultado;
	}

}
