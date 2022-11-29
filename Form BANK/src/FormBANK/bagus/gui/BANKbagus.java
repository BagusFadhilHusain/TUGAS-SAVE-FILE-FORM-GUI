package FormBANK.bagus.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BANKbagus {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;
    private JButton MASUKKANFOTOButton;
    private JButton SIMPANButton;
    private JTextArea textArea1;
    private JPanel rootPanel;
    private JLabel gambar;
    public String NamaGambar;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("file bank.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }


    public BANKbagus() {
        SIMPANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NomorKartu = textField1.getText();
                String ATM = (String) comboBox1.getSelectedItem();
                String BANK = (String) comboBox2.getSelectedItem();
                String NAMA = textField2.getText();

                BAGUSbank data = new BAGUSbank();
                data.setNomorKartu(NomorKartu);
                data.setJenisATM(ATM);
                data.setBANK(BANK);
                data.setNamaPemilik(NAMA);

                String hasil = "Tersimpan" + "\nNo Kartu = " + NomorKartu + "\nJenis ATM = " + ATM + "\nBank = " + BANK +
                        "\nNama Pemilik = " + NAMA + "\nNama File Gambar = " + NamaGambar;

                textArea1.append(hasil);

                try {
                    insertingDataToFile(hasil + "\n\n");
                    NamaGambar = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        MASUKKANFOTOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser CariFoto = new JFileChooser();

                int showOpenDialogue = CariFoto.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File PilihanFoto = CariFoto.getSelectedFile();
                    String PilihanFotomu = PilihanFoto.getAbsolutePath();

                    NamaGambar = CariFoto.getSelectedFile().getName();

                    ImageIcon gmbr = new ImageIcon(PilihanFotomu);
                    Image gambarFile = gmbr.getImage().getScaledInstance(gambar.getWidth(), gambar.getHeight(), Image.SCALE_SMOOTH);

                    gambar.setIcon(new ImageIcon(gambarFile));

                }
            }

        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}