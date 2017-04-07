package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
	
	//liste des composants de ma fenetre
	
	private JLabel jl = new JLabel("Recepteur");
	private JTextField jtf = new JTextField(12);
	private JButton jb1 = new JButton("ajouter");
	private JButton jb2 = new JButton("d�placer");
	private JButton jb3 = new JButton("vider");
	
	private List liste1 = new List ();
	private List liste2 = new List ();
	
	
	public Fenetre(String nom) {
		// TODO Auto-generated constructor stub
		super(nom);
		setSize(800,600);
		//disposition de la fenetre principale
		this.setLayout(new BorderLayout());//ligne par ligne
		
		//ajout premiere ligne
		JPanel jp1 = new JPanel ();
		jp1.setLayout(new FlowLayout());//les uns a la suite des autres
		jp1.add(jl);
		jp1.add(jtf);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		this.add(jp1,BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel ();
		jp2.setLayout(new GridLayout());
		jp2.add(liste1);
		jp2.add(liste2);
		this.add(jp2,BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fenetre f = new Fenetre("MA FENETRE");
		f.setVisible(true);
		
		
		
	}

}
