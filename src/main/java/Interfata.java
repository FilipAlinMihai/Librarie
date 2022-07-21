import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfata extends JFrame implements ActionListener {

    JTextField field1;
    JTextField field;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Interfata()
    {
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.getContentPane().setBackground(Color.BLUE);
        this.setBackground(Color.green);
        setTitle("Pagina de pornire");
        //buildMenu();
        this.pack();

        this.setLayout(new GridLayout(5,1));

        JPanel panelTitlu = new JPanel();
        JPanel panelEmail = new JPanel();
        JPanel panelAdaugaNou = new JPanel();
        panelAdaugaNou.setBackground(Color.BLUE);
        panelTitlu.setBackground(Color.BLUE);
        panelEmail.setBackground(Color.BLUE);
        JLabel titlu =new JLabel("Bibliteca ta digitala", SwingConstants.CENTER);

        titlu.setFont(new Font("Courier", Font.BOLD,25));
        panelTitlu.add(titlu);


        JLabel adresa =new JLabel("Email", SwingConstants.CENTER);
        adresa.setFont(new Font("Courier", Font.BOLD,25));

        panelEmail.add(adresa);

         field = new JTextField(15);
        field.setFont(new Font("Courier", Font.BOLD,18));
        panelEmail.add(field);

        JButton b1=new JButton("Conectare");
        b1.setFont(new Font("Courier", Font.BOLD,20));
        panelEmail.add(b1);
//        JTextField field = new JTextField(10);
//        field.setSize(100,50);
//        field.setFont(new Font("Courier", Font.BOLD,25));
//        add(adresa,  BorderLayout.CENTER);
//        add(field);

        JLabel adresa1 =new JLabel("Email", SwingConstants.CENTER);
        adresa1.setFont(new Font("Courier", Font.BOLD,25));

        panelAdaugaNou.add(adresa1);

         field1 = new JTextField(15);
        field1.setFont(new Font("Courier", Font.BOLD,18));
        panelAdaugaNou.add(field1);


        JButton b=new JButton("Utilizator Nou");
        b.setFont(new Font("Courier", Font.BOLD,17));
        panelAdaugaNou.add(b);
        this.add(panelTitlu);
        this.add(panelEmail);
        this.add(panelAdaugaNou);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        b1.addActionListener(e ->conectare());
    }

    public void conectare()
    {
        String s=field.getText();
    }
}
