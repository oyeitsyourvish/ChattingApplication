import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Server extends JFrame implements ActionListener {


    Server() {

        // THIS IS COMPLETED THE HEADER PART OF CHATTING //-------------------------->
        // STARTING POINT
        // This is for Green Line box
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);

        // This is for Back Button
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }

        });

        // This is for Profile Button
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        // This is for Video call option Button
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        // This is for Voice call option Button
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel voice = new JLabel(i12);
        voice.setBounds(350, 20, 30, 30);
        p1.add(voice);

        // This is for Menu Icon call option Button
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel menu = new JLabel(i15);
        menu.setBounds(410, 22, 10, 25);
        p1.add(menu);

        // Entering the name of Person
        JLabel name = new JLabel("Jacklyn");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        // Entering the Active Status of Person
        JLabel status = new JLabel("Active Now");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        // THIS IS COMPLETED THE HEADER PART OF CHATTING ------->HEADER ENDING POINT
        // -----------------------------------------------------------------------

        // THIS IS COMPLETED THE Middle Chatting Area PART OF CHATTING ------->Middle
        // Starting POINT
        // created chatting msg area.
        JPanel a1 = new JPanel();
        a1.setBounds(5, 75, 440, 570);
        add(a1);
        // THIS IS COMPLETED THE Middle Chatting Area PART OF CHATTING ------->Middel
        // Ending POINT

        // --------------------------------------------------------------------------

        // THIS IS COMPLETED THE FOOTER PART OF CHATTING ------->Footer Starting POINT

        // creaating bottom chatting textarea
        JTextField text = new JTextField();
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(text);

        // creating send Button
        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(send);

        // THIS IS COMPLETED THE FOOTER PART OF CHATTING ------->Footer Ending POINT

        // THIS IS FOR ALL SCREEN LAYOUT ---------------> STARTING POINT
        setSize(460, 750);
        // setUndecorated(true); // hiding upper java logo area
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        // THIS IS FOR ALL SCREEN LAYOUT ---------------> ENDING POINT
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        // 1. Server s= new Server(); // Named Object
        new Server(); // Anonymous Object.
    }
}