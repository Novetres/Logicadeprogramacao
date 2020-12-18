package imc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Imc extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JLabel lblResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Imc() {
		setBackground(SystemColor.window);
		setResizable(false);
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 371);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IMC ver 1.0\nAutor: Paloma Kimberly", "About", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnAbout.setBounds(20, 11, 89, 23);
		contentPane.add(btnAbout);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(87, 49, 96, 23);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
			
		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setBounds(20, 49, 57, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setBounds(20, 101, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(87, 97, 96, 23);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		calcular();
				
			}
		});
		btnCalcular.setToolTipText("Calcular IMC");
		btnCalcular.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc.png")));
		btnCalcular.setBounds(20, 140, 64, 64);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpar ();
			
			}
		});
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setIcon(new ImageIcon(Imc.class.getResource("/icones/borracha.png")));
		btnLimpar.setBounds(117, 140, 64, 64);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel_2 = new JLabel("IMC:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(29, 256, 48, 23);
		contentPane.add(lblNewLabel_2);
		
		lblResultado = new JLabel("");
		lblResultado.setLabelFor(lblResultado);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(94, 256, 89, 23);
		contentPane.add(lblResultado);
		
		lblStatus = new JLabel("");
		lblStatus.setBackground(Color.WHITE);
		lblStatus.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc0.png")));
		lblStatus.setBounds(227, 11, 150, 300);
		contentPane.add(lblStatus);
	} //Fim do construtor
	// método para calcular o IMC
	void calcular() 
	{
	DecimalFormat formatador = new DecimalFormat("#0.00");
	double peso,altura, imc;
	peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
	altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
	imc = peso / (altura * altura);
	lblResultado.setText("" + formatador.format(imc));
	//status
	if (imc < 17) {
	//System.out.println("Muito abaixo do peso");
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc1.png")));
	}else if (imc < 18.5) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc2.png")));
	}else if (imc < 25) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc3.png")));
	}else if (imc < 30) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc4.png")));
	}else if (imc < 35) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc5.png")));
	}else if (imc < 40) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc6.png")));
	}else if (imc >= 40) {
	lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc7.png")));
}
} 
	void limpar () {
		lblStatus.setText(null);
		lblResultado.setText(null);
		txtAltura.setText(null);
		txtPeso.setText(null);
		lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc0.png")));
		
	}


}