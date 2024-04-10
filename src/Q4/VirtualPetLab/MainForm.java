   package Q4.VirtualPetLab;
import javax.swing.*;
import java.awt.*;
import java.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;
    private JButton adoptADogButton;
    private JButton adoptACatButton;
    private JButton adoptAFoxButton;
    // TODO: add adoption buttons
    // Pet list
    private PetManager petManager = new PetManager();

    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        petManager.addPet(new Dog("Buddy"));
        petManager.addPet(new Cat("Whiskers"));
        this.updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating

        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement feeding the selected pet
                Pet p = getSelectedPet();
                p.feed();
                p.updateStatus();
                updateStatusLabel(p.getStatus());
                waitButtons(1);
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement playing with the selected pet
                Pet p = getSelectedPet();
                p.play();
                p.updateStatus();
                updateStatusLabel(p.getStatus());
                waitButtons(1);
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement putting the selected pet to sleep
                Pet p = getSelectedPet();
                p.sleep();
                p.updateStatus();
                updateStatusLabel(p.getStatus());
                waitButtons(1);
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1) return;

                // TODO: Implement pet selection change
                // 1. Grab the current pet from the petManager using petSelectorComboBox.getSelectedIndex()
                Pet p = getSelectedPet();
                // 2. Update statusLabel with the selected pet's status
                updateStatusLabel(p.getStatus());
                // 3. Update imageLabel with the selected pet's image using setPetImage()
                setPetImage(p.getImage());
            }
        });

        // TODO: Implement adoption button actions
        adoptADogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement feeding the selected pet
                String name = JOptionPane.showInputDialog("Enter new pet name: ");
                if (name.trim().isEmpty() || name == null) {
                    // do nothing
                }
                else {
                    Pet p = new Dog(name);
                    petManager.addPet(p);
                }
                updatePetList();
            }
        });
        adoptACatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement feeding the selected pet
                String name = JOptionPane.showInputDialog("Enter new pet name: ");
                if (name.trim().isEmpty() || name == null) {
                    // do nothing
                }
                else {
                    Pet p = new Cat(name);
                    petManager.addPet(p);
                }
                updatePetList();
            }
        });
        adoptAFoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement feeding the selected pet
                String name = JOptionPane.showInputDialog("Enter new pet name: ");
                if (name.trim().isEmpty() || name == null) {
                    // do nothing
                }
                else {
                    Pet p = new Fox(name);
                    petManager.addPet(p);
                }
                updatePetList();
            }
        });

    }

    public void updateStatusLabel(String status) {
        // TODO: Update statusLabel with the provided status
        statusLabel.setText(status);
    }

    public void updatePetList() {
        petSelectorComboBox.removeAllItems();  // Clear existing items
        for (Pet x : petManager.getList()) {
            petSelectorComboBox.addItem(x.getName());
        }
        int selectedIndex = petManager.getList().size() - 1;
    }
    public Pet getSelectedPet() { return petManager.getList().get(petSelectorComboBox.getSelectedIndex());
    }

    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
