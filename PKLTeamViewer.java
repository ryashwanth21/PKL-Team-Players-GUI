import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PKLTeamViewer extends JFrame {
    private Map<String, String[]> playersMap;
    private JTextArea playersTextArea;

    public PKLTeamViewer() {
        playersMap = new HashMap<>();
        // Add player lists for each team
        addTeamPlayers("BENGAL WARRIORS", new String[]{
                "Vaibhav Bhausaheb Garje", "R Guhan", "Suyon Baban Gaikar", "Parshant Kumar", "Maninder Singh", "Nitin Rawal", "Shubham Shinde", "Shrikant Jadhav", "Chai-Ming Chang", "Aslam Thambi",
                "Bhoir Akshay Bharat", "Akshay Kumar", "Akshay Bodake", "Nitin Kumar", "Vishwas S"
        });
        addTeamPlayers("BENGALURU BULLS", new String[]{
                "Neeraj Narwal", "Bharat", "Saurabh Nandal", "Yash Hooda", "Vishal", "Vikash Khandola", "Ran Singh", "Md. Liton Ali", "Piotr Pamulak", "Ponparthiban Subramanian", "Sunder",
                "Surjeet Singh", "Abhishek Singh", "Banty", "Monu", "Ankit", "Sushil", "Rakshit", "Rohit Kumar"
        });
        // Add player lists for other teams similarly...
        addTeamPlayers("DABANG DELHI", new String[]{
                "Naveen Kumar", "Vijay", "Manjeet", "Ashish Narwal", "Suraj Panwar", "Vishal Bhardwaj", "Sunil", "Ashu Malik", "Meetu", "Nitin Chandel", "Balasaheb Shahaji Jadhav", "Akash Prasher",
                "Vikrant", "Felix Li", "Yuvraj Pandeya", "Mohit"
        });
        addTeamPlayers("GUJARAT GIANTS", new String[]{
                "Manuj", "Sonu", "Rakesh", "Rohan Singh", "Parteek Dahiya", "Fazel Atrachali", "Rohit Gulia", "Mohammad Esmaeil Nabibakhsh", "Arkam Shaikh", "Sombir", "Vikas Jaglan", "Sourav Gulia",
                "Deepak Rajender Singh", "Ravi Kumar", "More GB", "Jitendar Yadav", "Nitesh", "Jagdeep", "Balaji D"
        });
        addTeamPlayers("HARYANA STEELERS", new String[]{
                "K Prapanjan", "Vinay", "Jaideep", "Mohit", "Naveen", "Monu", "Harsh", "Sunny", "Siddharth Desai", "Chandran Ranjit", "Hasan Balbool", "Ghanshyam Magar", "Rahul Sethpal", "Himanshu Chaudhary",
                "Ravindra Chauhan", "Ashish", "Mohit"
        });
        addTeamPlayers("JAIPUR PINK PANTHERS", new String[]{
                "Sunil Kumar", "Arjun Deshwal", "Ajith Kumar V", "Reza Mirbhageri", "Bhavani Rajput", "Sahul Kumar", "Ankush", "Abhishek KS", "Ashish", "Devank", "Amir Hossein Mohammadmaleki", "Shashank B",
                "Lucky Sharma", "Lavish", "Navneet", "Rahul Chaudhary", "Sumit"
        });
        addTeamPlayers("PATNA PIRATES", new String[]{
                "Sachin", "Neeraj Kumar", "Manish", "Thiyagarajan Yuvaraj", "Naveen Sharma", "Ranjit Venkatramana Naik", "Anuj Kumar", "Manjeet", "Zheng-Wei Chen", "Daniel Odhiambo", "Rohit", "Sajin Chandrasekar",
                "Krishan", "Ankit", "Deepak Kumar", "Mahendra Choudhary", "Sandeep Kumar", "Rakesh Narwal", "Sanjay"
        });
        addTeamPlayers("PUNERI PALTAN", new String[]{
                "Abhinesh Nadarajan", "Gaurav Khatri", "Sanket Sawant", "Pankaj Mohite", "Aslam Inamdar", "Mohit Goyat", "Akash Shinde", "Badal Singh", "Aditya Shinde", "Mohammadreza Shadloui Chiyanneh",
                "Vahid Rezaeimehr", "Ahmed Mustafa Enamdar", "Ishwar", "Hardeep"
        });
        addTeamPlayers("TAMIL THALAIVAS", new String[]{
                "Ajinkya Pawar", "Sagar", "Himanshu", "M Abhishek", "Sahil", "Mohit", "Aashish", "Narender", "Himanshu", "Jatin", "Himanshu Singh", "Selvamani K", "Ritik", "Masanmutu Lakshnanan",
                "Satish Kanan", "Amirhossein Bastami", "Mohammadreza Kaboudrahangi"
        });
        addTeamPlayers("TELUGU TITANS", new String[]{
                "Parvesh Bhainswal", "Rajnish", "Mohit", "Nitin", "Vijay", "Pawan Sehrawat", "Hamid Mirzaei Nader", "Milad Jabbari", "Shankar Bhimraj Gadai", "Omkar R. More", "Gaurav Dahiya", "Mohit",
                "Ajit Pandurang Pawar", "Robin Chaudhary"
        });
        addTeamPlayers("U MUMBA", new String[]{
                "Surinder Singh", "Jai Bhagwan", "Rinku", "Heidarali Ekrami", "Shivam", "Shivansh Thakur", "Pranay Vinay Rane", "Rupesh", "Sachin", "Girish Maruti Ernak", "Mahendra Singh", "Guman Singh",
                "Amirmohammad Zafardanesh", "Alireza Mirzaeian", "Rohit Yadav", "Kunal", "Visvanath V", "Saurav Parthe"
        });
        addTeamPlayers("UP YODDHAS", new String[]{
                "Pardeep Narwal", "Nitesh Kumar", "Sumit", "Ashu Singh", "Surender Gill", "Anil Kumar", "Mahipal", "Vijay Malik", "Samuel Wafala", "Helvic Wanjala", "Harendra Kumar", "Gulveer Singh",
                "Gurdeep", "Kiran Laxman Magar", "Nitin Panwar"
        });

        initializeGUI();
    }

    private void addTeamPlayers(String team, String[] players) {
        playersMap.put(team, players);
    }

    private void initializeGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("PKL Team Viewer");
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new GridLayout(12, 1));
        JScrollPane buttonScrollPane = new JScrollPane(buttonPanel);
        add(buttonScrollPane, BorderLayout.WEST);

        // Create buttons for each team
        for (String team : playersMap.keySet()) {
            JButton teamButton = new JButton(team);
            teamButton.addActionListener(new TeamButtonListener(team));
            buttonPanel.add(teamButton);
        }

        playersTextArea = new JTextArea();
        playersTextArea.setEditable(false);
        JScrollPane playersScrollPane = new JScrollPane(playersTextArea);
        add(playersScrollPane, BorderLayout.CENTER);

        setSize(600, 400);
        setVisible(true);
    }

    private class TeamButtonListener implements ActionListener {
        private String team;

        public TeamButtonListener(String team) {
            this.team = team;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            displayPlayers(team);
        }

        private void displayPlayers(String team) {
            StringBuilder playersText = new StringBuilder();
            playersText.append(team).append(" Players:\n");

            for (String player : playersMap.get(team)) {
                playersText.append(player).append("\n");
            }

            playersTextArea.setText(playersText.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PKLTeamViewer());
    }
}
