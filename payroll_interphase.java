package simple_payroll_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payroll_interphase {

	private JFrame frame;
	private JTextField ename;
	private JTextField erate;
	private JTextField ehour;
	private JTextField eday;
	private JTextField egross1;
	private JTextField etax;
	private JTextField ephil;
	private JTextField esss;
	private JTextField etotal;
	private JTextField egross2;
	private JTextField ededuct;
	private JTextField enet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll_interphase window = new payroll_interphase();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll_interphase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Ename = new JLabel("Employee Name:");
		Ename.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Ename.setBounds(54, 90, 95, 14);
		frame.getContentPane().add(Ename);
		
		JLabel RateHour = new JLabel("Rate per Hour:");
		RateHour.setBounds(60, 115, 83, 14);
		frame.getContentPane().add(RateHour);
		
		JLabel HourDay = new JLabel("Hour Per Day:");
		HourDay.setBounds(63, 140, 80, 14);
		frame.getContentPane().add(HourDay);
		
		JLabel WorkedDays = new JLabel("Number of days  worked:");
		WorkedDays.setFont(new Font("Tahoma", Font.PLAIN, 11));
		WorkedDays.setBounds(22, 165, 121, 20);
		frame.getContentPane().add(WorkedDays);
		
		JLabel gross2 = new JLabel("GROSS SALARY:");
		gross2.setFont(new Font("Tahoma", Font.BOLD, 12));
		gross2.setBounds(43, 215, 106, 14);
		frame.getContentPane().add(gross2);
		
		ename = new JTextField();
		ename.setBounds(153, 87, 128, 20);
		frame.getContentPane().add(ename);
		ename.setColumns(10);
		
		erate = new JTextField();
		erate.setBounds(153, 112, 86, 20);
		frame.getContentPane().add(erate);
		erate.setColumns(10);
		
		ehour = new JTextField();
		ehour.setBounds(153, 137, 86, 20);
		frame.getContentPane().add(ehour);
		ehour.setColumns(10);
		
		eday = new JTextField();
		eday.setBounds(153, 162, 86, 20);
		frame.getContentPane().add(eday);
		eday.setColumns(10);
		
		egross1 = new JTextField();
		egross1.setBounds(153, 213, 86, 20);
		frame.getContentPane().add(egross1);
		egross1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Simple Payroll System");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(266, 40, 174, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel.setBounds(307, 90, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Tax = new JLabel("TAX 15% of Monthly  Wage");
		Tax.setBounds(249, 115, 141, 14);
		frame.getContentPane().add(Tax);
		
		JLabel philhealth = new JLabel("Philhealth 5%");
		philhealth.setBounds(312, 140, 68, 14);
		frame.getContentPane().add(philhealth);
		
		JLabel sss = new JLabel("SSS 2%");
		sss.setBounds(337, 168, 46, 14);
		frame.getContentPane().add(sss);
		
		JLabel Tdeduction = new JLabel("TOTAL DEDUCTION:");
		Tdeduction.setFont(new Font("Tahoma", Font.BOLD, 13));
		Tdeduction.setBounds(291, 215, 136, 14);
		frame.getContentPane().add(Tdeduction);
		
		JLabel gross1 = new JLabel("Gross Salary:");
		gross1.setBounds(542, 115, 80, 14);
		frame.getContentPane().add(gross1);
		
		JLabel Deduction = new JLabel("Deduction:");
		Deduction.setBounds(552, 140, 68, 14);
		frame.getContentPane().add(Deduction);
		
		JLabel Nsalary = new JLabel("NET SALARY:");
		Nsalary.setFont(new Font("Tahoma", Font.BOLD, 13));
		Nsalary.setBounds(527, 215, 95, 14);
		frame.getContentPane().add(Nsalary);
		
		etax = new JTextField();
		etax.setBounds(417, 112, 86, 20);
		frame.getContentPane().add(etax);
		etax.setColumns(10);
		
		ephil = new JTextField();
		ephil.setBounds(417, 137, 86, 20);
		frame.getContentPane().add(ephil);
		ephil.setColumns(10);
		
		esss = new JTextField();
		esss.setBounds(417, 162, 86, 20);
		frame.getContentPane().add(esss);
		esss.setColumns(10);
		
		etotal = new JTextField();
		etotal.setBounds(417, 213, 86, 20);
		frame.getContentPane().add(etotal);
		etotal.setColumns(10);
		
		egross2 = new JTextField();
		egross2.setBounds(622, 112, 86, 20);
		frame.getContentPane().add(egross2);
		egross2.setColumns(10);
		
		ededuct = new JTextField();
		ededuct.setBounds(622, 137, 86, 20);
		frame.getContentPane().add(ededuct);
		ededuct.setColumns(10);
		
		enet = new JTextField();
		enet.setBounds(622, 213, 86, 20);
		frame.getContentPane().add(enet);
		enet.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 205), 3));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rate,day,phil,gross1,tax,total,hour,sss,net;
				
				ename.getText();
				rate=Integer.valueOf(erate.getText());
				hour=Integer.valueOf(ehour.getText());
				day=Integer.valueOf(eday.getText());
				gross1=rate*hour*day;
				egross1.setText(String.valueOf(gross1));
				double Tax = 0.15*gross1;
				tax=(int)Tax;
				etax.setText(String.valueOf(tax));
				double Phil=0.05*gross1;
				phil=(int)Phil;
				ephil.setText(String.valueOf(phil));
				double Sss=0.02*gross1;
				sss=(int)Sss;
				esss.setText(String.valueOf(sss));
				total=phil+sss+tax;
				etotal.setText(String.valueOf(total));
				egross2.setText(String.valueOf(gross1));
				ededuct.setText(String.valueOf(total));
				net=gross1-total;
				enet.setText(String.valueOf(net));
				
				
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(313, 269, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
