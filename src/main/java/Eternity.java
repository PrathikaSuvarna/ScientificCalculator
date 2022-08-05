import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serial;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;


/** The Class SuperCalculator. */
public class Eternity extends JFrame {

    /** The Constant serialVersionUID. */
    @Serial
    private static final long serialVersionUID = 1L;

    /** The Constant VALIDATION_MESSAGE. */
    private static final String VALIDATION_MESSAGE = "Please enter real numbers separated by space";
    /** The text field input. */
    private static JTextField textFieldInput;
    /** The text error. */
    private JTextField textError;
    /** The button zero. */
    private JButton buttonZero;
    /** buttonOne. */
    private JButton buttonOne;
    /** buttonTwo. */
    private JButton buttonTwo;
    /** buttonThree. */
    private JButton buttonThree;
    /** buttonFour. */
    private JButton buttonFour;
    /** buttonFive. */
    private JButton buttonFive;
    /** buttonSix. */
    private JButton buttonSix;
    /** buttonSeven. */
    private JButton buttonSeven;
    /** buttonEight. */
    private JButton buttonEight;
    /** buttonNine. */
    private JButton buttonNine;
    /** button for sigma */
    private JButton buttonSigma;
    /** button for the dot sign. */
    private JButton buttonDot;
    /** button for the space sign. */
    private JButton buttonspace;
    /** button for the minus sign. */
    private JButton buttonminus;
    /** button for the back sign. */
    private JButton btnBack;
    /** label for arithmetic use. */
    private JLabel label;

    /** Instantiates a new super calculator. */
    public Eternity() {
        setResizable(false);
        setFont(new Font("Serif", Font.BOLD, 14));
        setTitle("Standard Deviation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 515, 415);
        getContentPane().setLayout(null);

        textFieldInput = new JTextField();
        textFieldInput.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldInput.setFont(new Font("SansSerif", Font.BOLD, 20));
        textFieldInput.setBounds(21, 35, 472, 35);
        Border line = BorderFactory.createLineBorder(new Color(80, 80, 80));
        Border empty = new EmptyBorder(4, 4, 4, 4);
        CompoundBorder border = new CompoundBorder(line, empty);
        textFieldInput.setBorder(border);
        getContentPane().add(textFieldInput);
        textFieldInput.setColumns(10);

        buttonDot = new JButton(".");
        buttonDot.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + ".");
                    }
                });
        buttonDot.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonDot.setBorder(border);
        buttonDot.setBounds(21, 290, 56, 35);
        getContentPane().add(buttonDot);

        buttonZero = new JButton("0");
        buttonZero.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "0");
                    }
                });
        buttonZero.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonZero.setBorder(border);
        buttonZero.setBounds(87, 290, 56, 35);
        getContentPane().add(buttonZero);

        buttonOne = new JButton("1");
        buttonOne.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "1");
                    }
                });
        buttonOne.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonOne.setBorder(border);
        buttonOne.setBounds(21, 235, 56, 35);
        getContentPane().add(buttonOne);

        buttonTwo = new JButton("2");
        buttonTwo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "2");
                    }
                });
        buttonTwo.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonTwo.setBorder(border);
        buttonTwo.setBounds(87, 235, 56, 35);
        getContentPane().add(buttonTwo);

        buttonThree = new JButton("3");
        buttonThree.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "3");
                    }
                });
        buttonThree.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonThree.setBorder(border);
        buttonThree.setBounds(153, 235, 56, 35);
        getContentPane().add(buttonThree);

        buttonFour = new JButton("4");
        buttonFour.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "4");
                    }
                });
        buttonFour.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonFour.setBorder(border);
        buttonFour.setBounds(21, 187, 56, 35);
        getContentPane().add(buttonFour);

        buttonFive = new JButton("5");
        buttonFive.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "5");
                    }
                });
        buttonFive.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonFive.setBorder(border);
        buttonFive.setBounds(87, 187, 56, 35);
        getContentPane().add(buttonFive);

        buttonSix = new JButton("6");
        buttonSix.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "6");
                    }
                });
        buttonSix.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonSix.setBorder(border);
        buttonSix.setBounds(153, 187, 56, 35);
        getContentPane().add(buttonSix);

        buttonSeven = new JButton("7");
        buttonSeven.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "7");
                    }
                });
        buttonSeven.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonSeven.setBorder(border);
        buttonSeven.setBounds(21, 141, 56, 35);
        getContentPane().add(buttonSeven);

        buttonEight = new JButton("8");
        buttonEight.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "8");
                    }
                });
        buttonEight.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonEight.setBorder(border);
        buttonEight.setBounds(87, 141, 56, 35);
        getContentPane().add(buttonEight);

        buttonNine = new JButton("9");
        buttonNine.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "9");
                    }
                });
        buttonNine.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonNine.setBorder(border);
        buttonNine.setBounds(153, 141, 56, 35);
        getContentPane().add(buttonNine);

        buttonminus = new JButton("-");
        buttonminus.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "-");
                    }
                });
        buttonminus.setFont(new Font("SansSerif", Font.BOLD, 20));
        buttonminus.setBorder(border);
        buttonminus.setBounds(153, 290, 56, 35);
        getContentPane().add(buttonminus);


        buttonSigma = new JButton("SD (σ)");
        buttonSigma.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int flag=0;
                // clear error message
                textError.setVisible(false);

                // get focus
                textFieldInput.requestFocus();
                String str = textFieldInput.getText();
                if(!str.isEmpty()) {
                    String[] tokenss = str.split(" ");
                    for(int i=0;i<tokenss.length;i++){

                        if(!numericInputCheck(tokenss[i])){
                            flag=1;
                        }
                    }
                    if(flag==1){
                        textError.setForeground(Color.red);
                        textError.setText(VALIDATION_MESSAGE);
                        textError.setVisible(true);
                    }else if(flag==0)
                    {
                        label.setForeground(Color.green);
                        label.setText("Standard Deviation");
                        arithmeticOperation(str);
                    }
                }
                else{
                    textError.setForeground(Color.red);
                    textError.setText(VALIDATION_MESSAGE);
                    textError.setVisible(true);
                }
            }
        });
        buttonSigma.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonSigma.setBorder(border);
        buttonSigma.setBounds(240, 155, 160, 45);
        getContentPane().add(buttonSigma);



        buttonspace = new JButton(" ");
        buttonspace.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + " ");
                    }
                });
        buttonspace.setBounds(240, 215, 160, 45);
        buttonspace.setBorder(border);
        getContentPane().add(buttonspace);

        JButton btnClear = new JButton("Clear");
        // Add action to the clear button
        btnClear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        label.setText("");
                        textFieldInput.setText("");
                        textFieldInput.requestFocus();
                        textFieldInput.setText("");
                        textError.setVisible(false);
                    }
                });
        btnClear.setFont(new Font("SansSerif", Font.BOLD, 13));
        btnClear.setBorder(border);
        btnClear.setBounds(28, 82, 80, 45);
        getContentPane().add(btnClear);

        btnBack = new JButton("Back");
        btnBack.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int length = textFieldInput.getText().length();
                        int number = textFieldInput.getText().length() - 1;
                        if (length > 0) {
                            StringBuilder sbBuilder = new StringBuilder(textFieldInput.getText());
                            sbBuilder.deleteCharAt(number);
                            textFieldInput.setText(sbBuilder.toString());
                        }
                    }
                });
        btnBack.setFont(new Font("SansSerif", Font.BOLD, 13));
        btnBack.setBorder(border);
        btnBack.setBounds(120, 82, 80, 45);
        getContentPane().add(btnBack);

        textError = new JTextField();
        textError.setVisible(false);
        textError.setBorder(null);
        textError.setFont(new Font("SansSerif", Font.PLAIN, 18));
        textError.setEditable(false);
        textError.setBounds(21, 335, 515, 34);
        getContentPane().add(textError);
        textError.setColumns(10);

        label = new JLabel("");
        label.setFont(new Font("SansSerif", Font.BOLD, 15));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setForeground(new Color(192, 57, 43));
        label.setBounds(335, 11, 128, 25);
        getContentPane().add(label);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        try {
                            Eternity frame = new Eternity();
                            // textField get focus
                            frame.addWindowFocusListener(
                                    new WindowAdapter() {
                                        public void windowGainedFocus(WindowEvent e) {
                                            textFieldInput.requestFocusInWindow();
                                        }
                                    });
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
    /**
     * Checks if input is a Number.
     *
     * @param inputDataString the inputDataString
     * @return true, if the input is a real number
     */
    public static boolean numericInputCheck(String inputDataString) {
        try {
            new BigDecimal(inputDataString).toString();
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    /**
     * Arithmetic operation.
     *
     * @param str the str
     */
    public void arithmeticOperation(String str) {
        DecimalFormat df = new DecimalFormat("#.#############");
        String[] tokens = str.split(" ");
        double[] arr = new double[tokens.length];
        for (int i=0; i<arr.length;i++) {
            arr[i] = Double.parseDouble(tokens[i]);
        }

        double res = StandardDeviation.calculateSD(arr);
        String r = String.valueOf(res);
        if(r== "NaN"){
            textFieldInput.setText(df.format(0));
        }else{
            textFieldInput.setText(df.format(res));
        }

    }
}
