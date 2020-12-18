package eleitor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eleitor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;
	private JPanel contentPane;
	private JLabel lblResultado;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor frame = new Eleitor();
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
	public Eleitor() {
		setTitle("App Eleitor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 249);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdade.setBounds(26, 54, 48, 14);
		contentPane.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(85, 53, 54, 19);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// invocando o metodo verificar
				verificar();
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerificar.setBounds(10, 110, 113, 23);
		contentPane.add(btnVerificar);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(60, 154, 145, 28);
		contentPane.add(lblResultado);

		JButton btnSobre = new JButton("Sobre");
		btnSobre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "IMC ver 1.0\nAutor: Paloma Kimberly", "About", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnSobre.setBounds(164, 11, 81, 23);
		contentPane.add(btnSobre);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(140, 111, 89, 23);
		contentPane.add(btnLimpar);
	} // final do construtor

	// método para verificar a obrigatoriedade do voto
	void verificar() {
		int idade;
		idade = Integer.parseInt(txtIdade.getText());
		// System.out.println(idade); (Apoio ao entendimento da logica)
		if (idade < 16) {
			lblResultado.setText("Proibido Votar");
		} else if (idade >= 18 && idade <= 70) {
			lblResultado.setText("Voto Obrigatório");
		} else if (idade >= 16 || idade <= 18 || idade > 70) {
			lblResultado.setText("Voto Facultativo");
			// } else {
			// lblResultado.setText("Voto Facultativo"); resultado seria o mesmo
		}
	}

	void limpar() {
		txtIdade.setText(null);
		lblResultado.setText(null);
	
	}	

}
