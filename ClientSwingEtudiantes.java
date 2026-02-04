package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientSwingEtudiantes extends JFrame {

    public ClientSwingEtudiantes() {
        setTitle("Client Etudiantes");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btn = new JButton("Importer les etudiantes");
        add(btn, BorderLayout.CENTER);

        // Action du bouton
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data =
                        "Liste des etudiantes :\n\n" +
                        "1 - Amal Bennani\n" +
                        "2 - Youssef El Idrissi\n" +
                        "3 - Sara Alaoui\n" +
                        "4 - Hamza Naji";

                JOptionPane.showMessageDialog(
                        null,
                        data,
                        "Importation",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientSwingEtudiantes());
    }
}
