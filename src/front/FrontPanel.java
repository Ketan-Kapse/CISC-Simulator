package front;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.namespace.QName;

import alu.instruction.AbstractInstruction;
import cpu.Registers;
import memory.Cache.CacheLine;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPanel {

    /**
     * 0 - the registers panel is not enabled. </br>
     * 1 - the registers panel has been enabled.
     */
    private int enableFlag;
    private int prog1Step;
    private int prog2Step;

    JFrame frmCsciClassProject;
    private JPanel pnlRegisters;
    private JPanel pnlR0;
    private JLabel lblR;
    private JRadioButton rdbR0_16;
    private JRadioButton rdbR0_15;
    private JRadioButton rdbR0_14;
    private JRadioButton rdbR0_13;
    private JRadioButton rdbR0_12;
    private JRadioButton rdbR0_11;
    private JRadioButton rdbR0_10;
    private JRadioButton rdbR0_9;
    private JRadioButton rdbR0_8;
    private JRadioButton rdbR0_7;
    private JRadioButton rdbR0_6;
    private JRadioButton rdbR0_5;
    private JRadioButton rdbR0_4;
    private JRadioButton rdbR0_3;
    private JRadioButton rdbR0_2;
    private JRadioButton rdbR0_1;
    private JTextField textFieldR0;
    private JTextField textFieldR1;
    private JButton btnStoreR0;
    private JPanel pnlR1;
    private JLabel lblR_1;
    private JRadioButton rdbR1_16;

    private JRadioButton rdbR1_15;

    private JRadioButton rdbR1_14;

    private JRadioButton rdbR1_13;
    private JRadioButton rdbR1_12;

    private JRadioButton rdbR1_11;

    private JRadioButton rdbR1_10;

    private JRadioButton rdbR1_9;

    private JRadioButton rdbR1_8;

    private JRadioButton rdbR1_7;

    private JRadioButton rdbR1_6;

    private JRadioButton rdbR1_5;

    private JRadioButton rdbR1_4;

    private JRadioButton rdbR1_3;

    private JRadioButton rdbR1_2;

    private JRadioButton rdbR1_1;
    private JButton btnStoreR1;
    private JPanel pnlR2;
    private JLabel lblR_2;
    private JRadioButton rdbR2_16;
    private JRadioButton rdbR2_15;
    private JRadioButton rdbR2_14;
    private JRadioButton rdbR2_13;
    private JRadioButton rdbR2_12;
    private JRadioButton rdbR2_11;
    private JRadioButton rdbR2_10;
    private JRadioButton rdbR2_9;
    private JRadioButton rdbR2_8;
    private JRadioButton rdbR2_7;
    private JRadioButton rdbR2_6;
    private JRadioButton rdbR2_5;
    private JRadioButton rdbR2_4;
    private JRadioButton rdbR2_3;
    private JRadioButton rdbR2_2;
    private JRadioButton rdbR2_1;
    private JTextField textFieldR2;
    private JButton btnStoreR2;
    private JPanel pnlR3;
    private JLabel lblR_3;
    private JRadioButton rdbR3_16;
    private JRadioButton rdbR3_15;
    private JRadioButton rdbR3_14;
    private JRadioButton rdbR3_13;
    private JRadioButton rdbR3_12;
    private JRadioButton rdbR3_11;
    private JRadioButton rdbR3_10;
    private JRadioButton rdbR3_9;
    private JRadioButton rdbR3_8;
    private JRadioButton rdbR3_7;
    private JRadioButton rdbR3_6;
    private JRadioButton rdbR3_5;
    private JRadioButton rdbR3_4;
    private JRadioButton rdbR3_3;
    private JRadioButton rdbR3_2;
    private JRadioButton rdbR3_1;
    private JTextField textFieldR3;
    private JButton btnStoreR3;
    private JPanel pnlX1;
    private JLabel lblX;
    private JRadioButton rdbX1_16;
    private JRadioButton rdbX1_15;
    private JRadioButton rdbX1_14;
    private JRadioButton rdbX1_13;
    private JRadioButton rdbX1_12;
    private JRadioButton rdbX1_11;
    private JRadioButton rdbX1_10;
    private JRadioButton rdbX1_9;
    private JRadioButton rdbX1_8;
    private JRadioButton rdbX1_7;
    private JRadioButton rdbX1_6;
    private JRadioButton rdbX1_5;
    private JRadioButton rdbX1_4;
    private JRadioButton rdbX1_3;
    private JRadioButton rdbX1_2;
    private JRadioButton rdbX1_1;
    private JTextField textFieldX1;
    private JButton btnStoreX1;
    private JPanel pnlX2;
    private JLabel lblX_1;
    private JRadioButton rdbX2_16;
    private JRadioButton rdbX2_15;
    private JRadioButton rdbX2_14;
    private JRadioButton rdbX2_13;
    private JRadioButton rdbX2_12;
    private JRadioButton rdbX2_11;
    private JRadioButton rdbX2_10;
    private JRadioButton rdbX2_9;
    private JRadioButton rdbX2_8;
    private JRadioButton rdbX2_7;
    private JRadioButton rdbX2_6;
    private JRadioButton rdbX2_5;
    private JRadioButton rdbX2_4;
    private JRadioButton rdbX2_3;
    private JRadioButton rdbX2_2;
    private JRadioButton rdbX2_1;
    private JTextField textFieldX2;
    private JButton btnStoreX2;
    private JPanel pnlX3;
    private JLabel lblX_2;
    private JRadioButton rdbX3_16;
    private JRadioButton rdbX3_15;
    private JRadioButton rdbX3_14;
    private JRadioButton rdbX3_13;
    private JRadioButton rdbX3_12;
    private JRadioButton rdbX3_11;
    private JRadioButton rdbX3_10;
    private JRadioButton rdbX3_9;
    private JRadioButton rdbX3_8;
    private JRadioButton rdbX3_7;
    private JRadioButton rdbX3_6;
    private JRadioButton rdbX3_5;
    private JRadioButton rdbX3_4;
    private JRadioButton rdbX3_3;
    private JRadioButton rdbX3_2;
    private JRadioButton rdbX3_1;
    private JTextField textFieldX3;
    private JButton btnStoreX3;
    private JPanel pnlMAR;
    private JLabel lblMAR;
    private JRadioButton rdbMAR_16;
    private JRadioButton rdbMAR_15;
    private JRadioButton rdbMAR_14;
    private JRadioButton rdbMAR_13;
    private JRadioButton rdbMAR_12;
    private JRadioButton rdbMAR_11;
    private JRadioButton rdbMAR_10;
    private JRadioButton rdbMAR_9;
    private JRadioButton rdbMAR_8;
    private JRadioButton rdbMAR_7;
    private JRadioButton rdbMAR_6;
    private JRadioButton rdbMAR_5;
    private JRadioButton rdbMAR_4;
    private JRadioButton rdbMAR_3;
    private JRadioButton rdbMAR_2;
    private JRadioButton rdbMAR_1;
    private JTextField textFieldMAR;
    private JButton btnStoreMAR;
    private JPanel pnlMBR;
    private JLabel lblMBR;
    private JRadioButton rdbMBR_16;
    private JRadioButton rdbMBR_15;
    private JRadioButton rdbMBR_14;
    private JRadioButton rdbMBR_13;
    private JRadioButton rdbMBR_12;
    private JRadioButton rdbMBR_11;
    private JRadioButton rdbMBR_10;
    private JRadioButton rdbMBR_9;
    private JRadioButton rdbMBR_8;
    private JRadioButton rdbMBR_7;
    private JRadioButton rdbMBR_6;
    private JRadioButton rdbMBR_5;
    private JRadioButton rdbMBR_4;
    private JRadioButton rdbMBR_3;
    private JRadioButton rdbMBR_2;
    private JRadioButton rdbMBR_1;
    private JTextField textFieldMBR;
    private JButton btnStoreMBR;
    private JPanel pnlMSR;
    private JLabel lblMSR;
    private JRadioButton rdbMSR_16;
    private JRadioButton rdbMSR_15;
    private JRadioButton rdbMSR_14;
    private JRadioButton rdbMSR_13;
    private JRadioButton rdbMSR_12;
    private JRadioButton rdbMSR_11;
    private JRadioButton rdbMSR_10;
    private JRadioButton rdbMSR_9;
    private JRadioButton rdbMSR_8;
    private JRadioButton rdbMSR_7;
    private JRadioButton rdbMSR_6;
    private JRadioButton rdbMSR_5;
    private JRadioButton rdbMSR_4;
    private JRadioButton rdbMSR_3;
    private JRadioButton rdbMSR_2;
    private JRadioButton rdbMSR_1;
    private JTextField textFieldMSR;
    private JButton btnStoreMSR;
    private JPanel pnlIR;
    private JLabel lblIR;
    private JRadioButton rdbIR_16;
    private JRadioButton rdbIR_15;
    private JRadioButton rdbIR_14;
    private JRadioButton rdbIR_13;
    private JRadioButton rdbIR_12;
    private JRadioButton rdbIR_11;
    private JRadioButton rdbIR_10;
    private JRadioButton rdbIR_9;
    private JRadioButton rdbIR_8;
    private JRadioButton rdbIR_7;
    private JRadioButton rdbIR_6;
    private JRadioButton rdbIR_5;
    private JRadioButton rdbIR_4;
    private JRadioButton rdbIR_3;
    private JRadioButton rdbIR_2;
    private JRadioButton rdbIR_1;
    private JTextField textFieldIR;
    private JButton btnStoreIR;
    private JPanel pnlPC;
    private JLabel lblPC;
    private JRadioButton rdbPC_12;
    private JRadioButton rdbPC_11;
    private JRadioButton rdbPC_10;
    private JRadioButton rdbPC_9;
    private JRadioButton rdbPC_8;
    private JRadioButton rdbPC_7;
    private JRadioButton rdbPC_6;
    private JRadioButton rdbPC_5;
    private JRadioButton rdbPC_4;
    private JRadioButton rdbPC_3;
    private JRadioButton rdbPC_2;
    private JRadioButton rdbPC_1;
    private JTextField textFieldPC;
    private JButton btnStorePC;
    private JPanel pnlCC;
    private JLabel lblCC;
    private JRadioButton rdbCC_4;
    private JRadioButton rdbCC_3;
    private JRadioButton rdbCC_2;
    private JRadioButton rdbCC_1;
    private JTextField textFieldCC;
    private JButton btnStoreCC;
    private JPanel pnlMFR;
    private JLabel lblMFR;
    private JRadioButton rdbMFR_4;
    private JRadioButton rdbMFR_3;
    private JRadioButton rdbMFR_2;
    private JRadioButton rdbMFR_1;
    private JTextField textFieldMFR;
    private JButton btnStoreMFR;
    private JButton btnIPL;
    private Registers registers;
    private MCU mcu;
    private JPanel pnlIns;
    private JLabel lblIns;
    private JRadioButton rdbIns_16;
    private JRadioButton rdbIns_15;
    private JRadioButton rdbIns_14;
    private JRadioButton rdbIns_13;
    private JRadioButton rdbIns_12;
    private JRadioButton rdbIns_11;
    private JRadioButton rdbIns_10;
    private JRadioButton rdbIns_9;
    private JRadioButton rdbIns_8;
    private JRadioButton rdbIns_7;
    private JRadioButton rdbIns_6;
    private JRadioButton rdbIns_5;
    private JRadioButton rdbIns_4;
    private JRadioButton rdbIns_3;
    private JRadioButton rdbIns_2;
    private JRadioButton rdbIns_1;
    private JButton btnExecute;
    private JTextArea consolePrinter;
    private JScrollPane scrollPane1;
    private JTextField textFieldAddress;
    private JTextField textFieldValue;
    private JPanel testPanel;
    private JPanel pnlAddress;
    private JLabel lblAddress;
    private JPanel pnlValue;
    private JLabel lblValue;
    private JPanel pnlButton;
    private JButton btnStore;
    private JButton btnLoad;
    private JLabel lblPrinter;
    private JLabel lblTestPanel;
    private JPanel pnlPrinter;

    private JLabel lblKeyboard;

    private JScrollPane scrollPane2;

    private JTextArea consoleKeyboard;
    private JPanel pnlOp;
    private JTable tableCache;

    private JPanel pnlCache;

    private JLabel lblCache;

    private JScrollPane scrollPane3;

    private JButton btnNums;
    private JPanel pnlProgram1;

    private JLabel lblProgram1;

    private JButton btnCompare;
    private JPanel pnlKeyb;
    private JButton btnRunSingleStep;
    private JPanel pnlProgram2;
    private JLabel lblProgram;
    private JButton btnLoadSentences;
    private JButton btnFindWord;
    
    private static class RoundedBorder implements Border {

        private int radius;
    
    
        RoundedBorder(int radius) {
            this.radius = radius;
        }
    
    
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
    
    
        public boolean isBorderOpaque() {
            return true;
        }
    
    
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }   
    

    public FrontPanel() {
        initComponents();
        addListeners();

    }

    /**
     * initialize the registers and the memory control unit
     */
    private void initCPU() {
        registers = new Registers();
        mcu = new MCU();
    }

    /**
     * Initialize the contents of the frame.
     */
    Font  f  = new Font(Font.SERIF,  Font.BOLD, 15);
    private void initComponents() {
        frmCsciClassProject = new JFrame();
        frmCsciClassProject.getContentPane().setBackground(new Color(1, 36, 86));
        frmCsciClassProject.getContentPane().setForeground(new Color(160, 196, 255));
        frmCsciClassProject.setTitle("CSCI6461 Group 2 CISC SIMULATOR PROJECT");
        frmCsciClassProject.setBounds(100, 100, 1097, 980);
        frmCsciClassProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Border br = BorderFactory.createLineBorder(Color.black);
        Border blackline = BorderFactory.createLineBorder(Color.MAGENTA, 4);

        pnlRegisters = new JPanel();
        pnlRegisters.setBackground(new Color(1, 36, 86));
        
        JPanel rborders = new JPanel();
        rborders.setBounds(14, 169, 780, 421);
        rborders.setBorder(br);
        
        pnlRegisters.setBounds(9, 160, 659, 650);

        pnlR3 = new JPanel();
        pnlR3.setBackground(new Color(1, 36, 86));
        //pnlR3.setBounds(6, 138, 666, 31);

        lblR_3 = new JLabel("R3");
        lblR_3.setForeground(Color.WHITE);
        pnlR3.add(lblR_3);

        rdbR3_16 = new JRadioButton("");
        rdbR3_16.setOpaque(false);
        pnlR3.add(rdbR3_16);

        rdbR3_15 = new JRadioButton("");
        rdbR3_15.setOpaque(false);
        pnlR3.add(rdbR3_15);

        rdbR3_14 = new JRadioButton("");
        rdbR3_14.setOpaque(false);
        pnlR3.add(rdbR3_14);

        rdbR3_13 = new JRadioButton("");
        rdbR3_13.setOpaque(false);
        pnlR3.add(rdbR3_13);

        rdbR3_12 = new JRadioButton("");
        rdbR3_12.setOpaque(false);
        pnlR3.add(rdbR3_12);

        rdbR3_11 = new JRadioButton("");
        rdbR3_11.setOpaque(false);
        pnlR3.add(rdbR3_11);

        rdbR3_10 = new JRadioButton("");
        rdbR3_10.setOpaque(false);
        pnlR3.add(rdbR3_10);

        rdbR3_9 = new JRadioButton("");
        rdbR3_9.setOpaque(false);
        pnlR3.add(rdbR3_9);

        rdbR3_8 = new JRadioButton("");
        rdbR3_8.setOpaque(false);
        pnlR3.add(rdbR3_8);

        rdbR3_7 = new JRadioButton("");
        rdbR3_7.setOpaque(false);
        pnlR3.add(rdbR3_7);

        rdbR3_6 = new JRadioButton("");
        rdbR3_6.setOpaque(false);
        pnlR3.add(rdbR3_6);

        rdbR3_5 = new JRadioButton("");
        rdbR3_5.setOpaque(false);
        pnlR3.add(rdbR3_5);

        rdbR3_4 = new JRadioButton("");
        rdbR3_4.setOpaque(false);
        pnlR3.add(rdbR3_4);

        rdbR3_3 = new JRadioButton("");
        rdbR3_3.setOpaque(false);
        pnlR3.add(rdbR3_3);

        rdbR3_2 = new JRadioButton("");
        rdbR3_2.setOpaque(false);
        pnlR3.add(rdbR3_2);

        rdbR3_1 = new JRadioButton("");
        rdbR3_1.setOpaque(false);
        pnlR3.add(rdbR3_1);

        textFieldR3 = new JTextField();
        textFieldR3.setEditable(false);
        textFieldR3.setColumns(10);
        pnlR3.add(textFieldR3);

        btnStoreR3 = new JButton("WRITE");
        btnStoreR3.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreR3.setBorder(new RoundedBorder(9));
        btnStoreR3.setBackground(Color.red);
        pnlR3.add(btnStoreR3);

        // adding hover animation

        btnStoreR3.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreR3.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreR3.setBackground((Color.RED));
                }
            }
        }));

        pnlX1 = new JPanel();
        pnlX1.setBackground(new Color(1, 36, 86));
        //pnlX1.setBounds(6, 15, 666, 31);

        lblX = new JLabel("X1");
        lblX.setForeground(Color.WHITE);
        pnlX1.add(lblX);

        rdbX1_16 = new JRadioButton("");
        rdbX1_16.setOpaque(false);
        pnlX1.add(rdbX1_16);

        rdbX1_15 = new JRadioButton("");
        rdbX1_15.setOpaque(false);
        pnlX1.add(rdbX1_15);

        rdbX1_14 = new JRadioButton("");
        rdbX1_14.setOpaque(false);
        pnlX1.add(rdbX1_14);

        rdbX1_13 = new JRadioButton("");
        rdbX1_13.setOpaque(false);
        pnlX1.add(rdbX1_13);

        rdbX1_12 = new JRadioButton("");
        rdbX1_12.setOpaque(false);
        pnlX1.add(rdbX1_12);

        rdbX1_11 = new JRadioButton("");
        rdbX1_11.setOpaque(false);
        pnlX1.add(rdbX1_11);

        rdbX1_10 = new JRadioButton("");
        rdbX1_10.setOpaque(false);
        pnlX1.add(rdbX1_10);

        rdbX1_9 = new JRadioButton("");
        rdbX1_9.setOpaque(false);
        pnlX1.add(rdbX1_9);

        rdbX1_8 = new JRadioButton("");
        rdbX1_8.setOpaque(false);
        pnlX1.add(rdbX1_8);

        rdbX1_7 = new JRadioButton("");
        rdbX1_7.setOpaque(false);
        pnlX1.add(rdbX1_7);

        rdbX1_6 = new JRadioButton("");
        rdbX1_6.setOpaque(false);
        pnlX1.add(rdbX1_6);

        rdbX1_5 = new JRadioButton("");
        rdbX1_5.setOpaque(false);
        pnlX1.add(rdbX1_5);

        rdbX1_4 = new JRadioButton("");
        rdbX1_4.setOpaque(false);
        pnlX1.add(rdbX1_4);

        rdbX1_3 = new JRadioButton("");
        rdbX1_3.setOpaque(false);
        pnlX1.add(rdbX1_3);

        rdbX1_2 = new JRadioButton("");
        rdbX1_2.setOpaque(false);
        pnlX1.add(rdbX1_2);

        rdbX1_1 = new JRadioButton("");
        rdbX1_1.setOpaque(false);
        pnlX1.add(rdbX1_1);

        textFieldX1 = new JTextField();
        textFieldX1.setEditable(false);
        textFieldX1.setColumns(10);
        pnlX1.add(textFieldX1);

        btnStoreX1 = new JButton("WRITE");
        btnStoreX1.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreX1.setBorder(new RoundedBorder(9));
        btnStoreX1.setBackground(Color.red);
        pnlX1.add(btnStoreX1);

        btnStoreX1.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX1.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX1.setBackground((Color.RED));
                }
            }
        }));

        pnlX2 = new JPanel();
        pnlX2.setBackground(new Color(1, 36, 86));

        lblX_1 = new JLabel("X2");
        lblX_1.setForeground(Color.WHITE);
        pnlX2.add(lblX_1);

        rdbX2_16 = new JRadioButton("");
        rdbX2_16.setOpaque(false);
        pnlX2.add(rdbX2_16);

        rdbX2_15 = new JRadioButton("");
        rdbX2_15.setOpaque(false);
        pnlX2.add(rdbX2_15);

        rdbX2_14 = new JRadioButton("");
        rdbX2_14.setOpaque(false);
        pnlX2.add(rdbX2_14);

        rdbX2_13 = new JRadioButton("");
        rdbX2_13.setOpaque(false);
        pnlX2.add(rdbX2_13);

        rdbX2_12 = new JRadioButton("");
        rdbX2_12.setOpaque(false);
        pnlX2.add(rdbX2_12);

        rdbX2_11 = new JRadioButton("");
        rdbX2_11.setOpaque(false);
        pnlX2.add(rdbX2_11);

        rdbX2_10 = new JRadioButton("");
        rdbX2_10.setOpaque(false);
        pnlX2.add(rdbX2_10);

        rdbX2_9 = new JRadioButton("");
        rdbX2_9.setOpaque(false);
        pnlX2.add(rdbX2_9);

        rdbX2_8 = new JRadioButton("");
        rdbX2_8.setOpaque(false);
        pnlX2.add(rdbX2_8);

        rdbX2_7 = new JRadioButton("");
        rdbX2_7.setOpaque(false);
        pnlX2.add(rdbX2_7);

        rdbX2_6 = new JRadioButton("");
        rdbX2_6.setOpaque(false);
        pnlX2.add(rdbX2_6);

        rdbX2_5 = new JRadioButton("");
        rdbX2_5.setOpaque(false);
        pnlX2.add(rdbX2_5);

        rdbX2_4 = new JRadioButton("");
        rdbX2_4.setOpaque(false);
        pnlX2.add(rdbX2_4);

        rdbX2_3 = new JRadioButton("");
        rdbX2_3.setOpaque(false);
        pnlX2.add(rdbX2_3);

        rdbX2_2 = new JRadioButton("");
        rdbX2_2.setOpaque(false);
        pnlX2.add(rdbX2_2);

        rdbX2_1 = new JRadioButton("");
        rdbX2_1.setOpaque(false);
        pnlX2.add(rdbX2_1);

        textFieldX2 = new JTextField();
        textFieldX2.setEditable(false);
        textFieldX2.setColumns(10);
        pnlX2.add(textFieldX2);

        btnStoreX2 = new JButton("WRITE");
        btnStoreX2.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreX2.setBorder(new RoundedBorder(9));
        btnStoreX2.setBackground(Color.red);
        pnlX2.add(btnStoreX2);

        //adding hover animation

        btnStoreX2.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX2.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX2.setBackground((Color.RED));
                }
            }
        }));

        pnlX3 = new JPanel();
        pnlX3.setBackground((new Color(1, 36, 86)));
        pnlX3.setBounds(6, 97, 666, 31);

        lblX_2 = new JLabel("X3");
        lblX_2.setForeground(Color.WHITE);
        pnlX3.add(lblX_2);

        rdbX3_16 = new JRadioButton("");
        rdbX3_16.setOpaque(false);
        pnlX3.add(rdbX3_16);

        rdbX3_15 = new JRadioButton("");
        rdbX3_15.setOpaque(false);
        pnlX3.add(rdbX3_15);

        rdbX3_14 = new JRadioButton("");
        rdbX3_14.setOpaque(false);
        pnlX3.add(rdbX3_14);

        rdbX3_13 = new JRadioButton("");
        rdbX3_13.setOpaque(false);
        pnlX3.add(rdbX3_13);

        rdbX3_12 = new JRadioButton("");
        rdbX3_12.setOpaque(false);
        pnlX3.add(rdbX3_12);

        rdbX3_11 = new JRadioButton("");
        rdbX3_11.setOpaque(false);
        pnlX3.add(rdbX3_11);

        rdbX3_10 = new JRadioButton("");
        rdbX3_10.setOpaque(false);
        pnlX3.add(rdbX3_10);

        rdbX3_9 = new JRadioButton("");
        rdbX3_9.setOpaque(false);
        pnlX3.add(rdbX3_9);

        rdbX3_8 = new JRadioButton("");
        rdbX3_8.setOpaque(false);
        pnlX3.add(rdbX3_8);

        rdbX3_7 = new JRadioButton("");
        rdbX3_7.setOpaque(false);
        pnlX3.add(rdbX3_7);

        rdbX3_6 = new JRadioButton("");
        rdbX3_6.setOpaque(false);
        pnlX3.add(rdbX3_6);

        rdbX3_5 = new JRadioButton("");
        rdbX3_5.setOpaque(false);
        pnlX3.add(rdbX3_5);

        rdbX3_4 = new JRadioButton("");
        rdbX3_4.setOpaque(false);
        pnlX3.add(rdbX3_4);

        rdbX3_3 = new JRadioButton("");
        rdbX3_3.setOpaque(false);
        pnlX3.add(rdbX3_3);

        rdbX3_2 = new JRadioButton("");
        rdbX3_2.setOpaque(false);
        pnlX3.add(rdbX3_2);

        rdbX3_1 = new JRadioButton("");
        rdbX3_1.setOpaque(false);
        pnlX3.add(rdbX3_1);

        textFieldX3 = new JTextField();
        textFieldX3.setEditable(false);
        textFieldX3.setColumns(10);
        pnlX3.add(textFieldX3);

        btnStoreX3 = new JButton("WRITE");
        btnStoreX3.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreX3.setBorder(new RoundedBorder(9));
        btnStoreX3.setBackground(Color.red);
        pnlX3.add(btnStoreX3);

        //adding hover animation

        btnStoreX3.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX3.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreX3.setBackground((Color.RED));
                }
            }
        }));

        pnlMAR = new JPanel();
        pnlMAR.setBackground(new Color(1, 36, 86));
        pnlMAR.setBounds(7, 10, 665, 31);

        lblMAR = new JLabel("MAR");
        lblMAR.setForeground(Color.WHITE);
        pnlMAR.add(lblMAR);

        rdbMAR_16 = new JRadioButton("");
        rdbMAR_16.setOpaque(false);
        pnlMAR.add(rdbMAR_16);

        rdbMAR_15 = new JRadioButton("");
        rdbMAR_15.setOpaque(false);
        pnlMAR.add(rdbMAR_15);

        rdbMAR_14 = new JRadioButton("");
        rdbMAR_14.setOpaque(false);
        pnlMAR.add(rdbMAR_14);

        rdbMAR_13 = new JRadioButton("");
        rdbMAR_13.setOpaque(false);
        pnlMAR.add(rdbMAR_13);

        rdbMAR_12 = new JRadioButton("");
        rdbMAR_12.setOpaque(false);
        pnlMAR.add(rdbMAR_12);

        rdbMAR_11 = new JRadioButton("");
        rdbMAR_11.setOpaque(false);
        pnlMAR.add(rdbMAR_11);

        rdbMAR_10 = new JRadioButton("");
        rdbMAR_10.setOpaque(false);
        pnlMAR.add(rdbMAR_10);

        rdbMAR_9 = new JRadioButton("");
        rdbMAR_9.setOpaque(false);
        pnlMAR.add(rdbMAR_9);

        rdbMAR_8 = new JRadioButton("");
        rdbMAR_8.setOpaque(false);
        pnlMAR.add(rdbMAR_8);

        rdbMAR_7 = new JRadioButton("");
        rdbMAR_7.setOpaque(false);
        pnlMAR.add(rdbMAR_7);

        rdbMAR_6 = new JRadioButton("");
        rdbMAR_6.setOpaque(false);
        pnlMAR.add(rdbMAR_6);

        rdbMAR_5 = new JRadioButton("");
        rdbMAR_5.setOpaque(false);
        pnlMAR.add(rdbMAR_5);

        rdbMAR_4 = new JRadioButton("");
        rdbMAR_4.setOpaque(false);
        pnlMAR.add(rdbMAR_4);

        rdbMAR_3 = new JRadioButton("");
        rdbMAR_3.setOpaque(false);
        pnlMAR.add(rdbMAR_3);

        rdbMAR_2 = new JRadioButton("");
        rdbMAR_2.setOpaque(false);
        pnlMAR.add(rdbMAR_2);

        rdbMAR_1 = new JRadioButton("");
        rdbMAR_1.setOpaque(false);
        pnlMAR.add(rdbMAR_1);

        textFieldMAR = new JTextField();
        textFieldMAR.setEditable(false);
        textFieldMAR.setColumns(10);
        pnlMAR.add(textFieldMAR);

        btnStoreMAR = new JButton("WRITE");
        btnStoreMAR.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreMAR.setBorder(new RoundedBorder(9));
        btnStoreMAR.setBackground(Color.red);
        pnlMAR.add(btnStoreMAR);

        //adding hover animation

        
        btnStoreMAR.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMAR.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMAR.setBackground((Color.RED));
                }
            }
        }));


        pnlMBR = new JPanel();
        pnlMBR.setBackground(new Color(1, 36, 86));
        pnlMBR.setBounds(7, 45, 665, 31);

        lblMBR = new JLabel("MBR");
        lblMBR.setForeground(Color.WHITE);
        pnlMBR.add(lblMBR);

        rdbMBR_16 = new JRadioButton("");
        rdbMBR_16.setOpaque(false);
        pnlMBR.add(rdbMBR_16);

        rdbMBR_15 = new JRadioButton("");
        rdbMBR_15.setOpaque(false);
        pnlMBR.add(rdbMBR_15);

        rdbMBR_14 = new JRadioButton("");
        rdbMBR_14.setOpaque(false);
        pnlMBR.add(rdbMBR_14);

        rdbMBR_13 = new JRadioButton("");
        rdbMBR_13.setOpaque(false);
        pnlMBR.add(rdbMBR_13);

        rdbMBR_12 = new JRadioButton("");
        rdbMBR_12.setOpaque(false);
        pnlMBR.add(rdbMBR_12);

        rdbMBR_11 = new JRadioButton("");
        rdbMBR_11.setOpaque(false);
        pnlMBR.add(rdbMBR_11);

        rdbMBR_10 = new JRadioButton("");
        rdbMBR_10.setOpaque(false);
        pnlMBR.add(rdbMBR_10);

        rdbMBR_9 = new JRadioButton("");
        rdbMBR_9.setOpaque(false);
        pnlMBR.add(rdbMBR_9);

        rdbMBR_8 = new JRadioButton("");
        rdbMBR_8.setOpaque(false);
        pnlMBR.add(rdbMBR_8);

        rdbMBR_7 = new JRadioButton("");
        rdbMBR_7.setOpaque(false);
        pnlMBR.add(rdbMBR_7);

        rdbMBR_6 = new JRadioButton("");
        rdbMBR_6.setOpaque(false);
        pnlMBR.add(rdbMBR_6);

        rdbMBR_5 = new JRadioButton("");
        rdbMBR_5.setOpaque(false);
        pnlMBR.add(rdbMBR_5);

        rdbMBR_4 = new JRadioButton("");
        rdbMBR_4.setOpaque(false);
        pnlMBR.add(rdbMBR_4);

        rdbMBR_3 = new JRadioButton("");
        rdbMBR_3.setOpaque(false);
        pnlMBR.add(rdbMBR_3);

        rdbMBR_2 = new JRadioButton("");
        rdbMBR_2.setOpaque(false);
        pnlMBR.add(rdbMBR_2);

        rdbMBR_1 = new JRadioButton("");
        rdbMBR_1.setOpaque(false);
        pnlMBR.add(rdbMBR_1);

        textFieldMBR = new JTextField();
        textFieldMBR.setEditable(false);
        textFieldMBR.setColumns(10);
        pnlMBR.add(textFieldMBR);

        btnStoreMBR = new JButton("WRITE");
        btnStoreMBR.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreMBR.setBorder(new RoundedBorder(9));
        btnStoreMBR.setBackground(Color.red);
        pnlMBR.add(btnStoreMBR);

        //adding hover animation

        btnStoreMBR.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMBR.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMBR.setBackground((Color.RED));
                }
            }
        }));

        pnlMSR = new JPanel();
        pnlMSR.setBackground(new Color(1, 36, 86));
        pnlMSR.setBounds(7, 81, 665, 31);

        lblMSR = new JLabel("MSR");
        lblMSR.setForeground(Color.WHITE);
        pnlMSR.add(lblMSR);

        rdbMSR_16 = new JRadioButton("");
        rdbMSR_16.setOpaque(false);
        pnlMSR.add(rdbMSR_16);

        rdbMSR_15 = new JRadioButton("");
        rdbMSR_15.setOpaque(false);
        pnlMSR.add(rdbMSR_15);

        rdbMSR_14 = new JRadioButton("");
        rdbMSR_14.setOpaque(false);
        pnlMSR.add(rdbMSR_14);

        rdbMSR_13 = new JRadioButton("");
        rdbMSR_13.setOpaque(false);
        pnlMSR.add(rdbMSR_13);

        rdbMSR_12 = new JRadioButton("");
        rdbMSR_12.setOpaque(false);
        pnlMSR.add(rdbMSR_12);

        rdbMSR_11 = new JRadioButton("");
        rdbMSR_11.setOpaque(false);
        pnlMSR.add(rdbMSR_11);

        rdbMSR_10 = new JRadioButton("");
        rdbMSR_10.setOpaque(false);
        pnlMSR.add(rdbMSR_10);

        rdbMSR_9 = new JRadioButton("");
        rdbMSR_9.setOpaque(false);
        pnlMSR.add(rdbMSR_9);

        rdbMSR_8 = new JRadioButton("");
        rdbMSR_8.setOpaque(false);
        pnlMSR.add(rdbMSR_8);

        rdbMSR_7 = new JRadioButton("");
        rdbMSR_7.setOpaque(false);
        pnlMSR.add(rdbMSR_7);

        rdbMSR_6 = new JRadioButton("");
        rdbMSR_6.setOpaque(false);
        pnlMSR.add(rdbMSR_6);

        rdbMSR_5 = new JRadioButton("");
        rdbMSR_5.setOpaque(false);
        pnlMSR.add(rdbMSR_5);

        rdbMSR_4 = new JRadioButton("");
        rdbMSR_4.setOpaque(false);
        pnlMSR.add(rdbMSR_4);

        rdbMSR_3 = new JRadioButton("");
        rdbMSR_3.setOpaque(false);
        pnlMSR.add(rdbMSR_3);

        rdbMSR_2 = new JRadioButton("");
        rdbMSR_2.setOpaque(false);
        pnlMSR.add(rdbMSR_2);

        rdbMSR_1 = new JRadioButton("");
        rdbMSR_1.setOpaque(false);
        pnlMSR.add(rdbMSR_1);

        textFieldMSR = new JTextField();
        textFieldMSR.setEditable(false);
        textFieldMSR.setColumns(10);
        pnlMSR.add(textFieldMSR);

        btnStoreMSR = new JButton("WRITE");
        btnStoreMSR.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreMSR.setBorder(new RoundedBorder(9));
        btnStoreMSR.setBackground(Color.red);
        pnlMSR.add(btnStoreMSR);

//adding hover
        btnStoreMSR.addMouseListener((new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMSR.setBackground(Color.GREEN);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(enableFlag == 1){
                    btnStoreMSR.setBackground((Color.RED));
                }
            }
        }));


        pnlIR = new JPanel();

        pnlIR.setBackground(new Color(1, 36, 86));

        lblIR = new JLabel("IR");
        lblIR.setForeground(Color.white);
        pnlIR.add(lblIR);

        rdbIR_16 = new JRadioButton("");
        rdbIR_16.setOpaque(false);
        pnlIR.add(rdbIR_16);

        rdbIR_15 = new JRadioButton("");
        rdbIR_15.setOpaque(false);
        pnlIR.add(rdbIR_15);

        rdbIR_14 = new JRadioButton("");
        rdbIR_14.setOpaque(false);
        pnlIR.add(rdbIR_14);

        rdbIR_13 = new JRadioButton("");
        rdbIR_13.setOpaque(false);
        pnlIR.add(rdbIR_13);

        rdbIR_12 = new JRadioButton("");
        rdbIR_12.setOpaque(false);
        pnlIR.add(rdbIR_12);

        rdbIR_11 = new JRadioButton("");
        rdbIR_11.setOpaque(false);
        pnlIR.add(rdbIR_11);

        rdbIR_10 = new JRadioButton("");
        rdbIR_10.setOpaque(false);
        pnlIR.add(rdbIR_10);

        rdbIR_9 = new JRadioButton("");
        rdbIR_9.setOpaque(false);
        pnlIR.add(rdbIR_9);

        rdbIR_8 = new JRadioButton("");
        rdbIR_8.setOpaque(false);
        pnlIR.add(rdbIR_8);

        rdbIR_7 = new JRadioButton("");
        rdbIR_7.setOpaque(false);
        pnlIR.add(rdbIR_7);

        rdbIR_6 = new JRadioButton("");
        rdbIR_6.setOpaque(false);
        pnlIR.add(rdbIR_6);

        rdbIR_5 = new JRadioButton("");
        rdbIR_5.setOpaque(false);
        pnlIR.add(rdbIR_5);

        rdbIR_4 = new JRadioButton("");
        rdbIR_4.setOpaque(false);
        pnlIR.add(rdbIR_4);

        rdbIR_3 = new JRadioButton("");
        rdbIR_3.setOpaque(false);
        pnlIR.add(rdbIR_3);

        rdbIR_2 = new JRadioButton("");
        rdbIR_2.setOpaque(false);
        pnlIR.add(rdbIR_2);

        rdbIR_1 = new JRadioButton("");
        rdbIR_1.setOpaque(false);
        pnlIR.add(rdbIR_1);

        textFieldIR = new JTextField();
        textFieldIR.setEditable(false);
        textFieldIR.setColumns(10);
        pnlIR.add(textFieldIR);

        btnStoreIR = new JButton("WRITE");
        btnStoreIR.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreIR.setBorder(new RoundedBorder(9));
        btnStoreIR.setBackground(Color.red);
        btnStoreIR.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        //adding hover animation to loadR3BTN
        btnStoreIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreIR.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreIR.setBackground(Color.RED);
            }
        }
        });

        pnlIR.add(btnStoreIR);

        pnlPC = new JPanel();
        pnlPC.setBackground(new Color(1, 36, 86));

        lblPC = new JLabel("PC");
        lblPC.setForeground(Color.WHITE);
        pnlPC.add(lblPC);

        rdbPC_12 = new JRadioButton("");
        rdbPC_12.setOpaque(false);
        pnlPC.add(rdbPC_12);

        rdbPC_11 = new JRadioButton("");
        rdbPC_11.setOpaque(false);
        pnlPC.add(rdbPC_11);

        rdbPC_10 = new JRadioButton("");
        rdbPC_10.setOpaque(false);
        pnlPC.add(rdbPC_10);

        rdbPC_9 = new JRadioButton("");
        rdbPC_9.setOpaque(false);
        pnlPC.add(rdbPC_9);

        rdbPC_8 = new JRadioButton("");
        rdbPC_8.setOpaque(false);
        pnlPC.add(rdbPC_8);

        rdbPC_7 = new JRadioButton("");
        rdbPC_7.setOpaque(false);
        pnlPC.add(rdbPC_7);

        rdbPC_6 = new JRadioButton("");
        rdbPC_6.setOpaque(false);
        pnlPC.add(rdbPC_6);

        rdbPC_5 = new JRadioButton("");
        rdbPC_5.setOpaque(false);
        pnlPC.add(rdbPC_5);

        rdbPC_4 = new JRadioButton("");
        rdbPC_4.setOpaque(false);
        pnlPC.add(rdbPC_4);

        rdbPC_3 = new JRadioButton("");
        rdbPC_3.setOpaque(false);
        pnlPC.add(rdbPC_3);

        rdbPC_2 = new JRadioButton("");
        rdbPC_2.setOpaque(false);
        pnlPC.add(rdbPC_2);

        rdbPC_1 = new JRadioButton("");
        rdbPC_1.setOpaque(false);
        pnlPC.add(rdbPC_1);

        textFieldPC = new JTextField();
        textFieldPC.setEditable(false);
        textFieldPC.setColumns(10);
        pnlPC.add(textFieldPC);

        btnStorePC = new JButton("WRITE");
        btnStorePC.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStorePC.setBorder(new RoundedBorder(9));
        btnStorePC.setBackground(Color.red);
        btnStorePC.setBorder(new RoundedBorder(9));
        btnStorePC.setBackground(Color.red);
        pnlPC.add(btnStorePC);

        //adding hover effects

        btnStorePC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStorePC.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStorePC.setBackground(Color.RED);
            }
        }
        });
        
        pnlRegisters.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 1));
        //pnlRegisters.add(pnlPC);
       // pnlRegisters.add(pnlIR);

        pnlR0 = new JPanel();
        pnlR0.setBackground(new Color(1, 36, 86));
        //pnlR0.setBounds(6, 15, 666, 31);

        lblR = new JLabel("R0");
        lblR.setForeground(Color.WHITE);
        pnlR0.add(lblR);

        rdbR0_16 = new JRadioButton("");
        rdbR0_16.setOpaque(false);  
        pnlR0.add(rdbR0_16);

        rdbR0_15 = new JRadioButton("");
        rdbR0_15.setOpaque(false);  
        pnlR0.add(rdbR0_15);

        rdbR0_14 = new JRadioButton("");
        rdbR0_14.setOpaque(false);  
        pnlR0.add(rdbR0_14);

        rdbR0_13 = new JRadioButton("");
        rdbR0_13.setOpaque(false);  
        pnlR0.add(rdbR0_13);

        rdbR0_12 = new JRadioButton("");
        rdbR0_12.setOpaque(false);  
        pnlR0.add(rdbR0_12);

        rdbR0_11 = new JRadioButton("");
        rdbR0_11.setOpaque(false);  
        pnlR0.add(rdbR0_11);

        rdbR0_10 = new JRadioButton("");
        rdbR0_10.setOpaque(false);  
        pnlR0.add(rdbR0_10);

        rdbR0_9 = new JRadioButton("");
        rdbR0_9.setOpaque(false);  
        pnlR0.add(rdbR0_9);

        rdbR0_8 = new JRadioButton("");
        rdbR0_8.setOpaque(false);  
        pnlR0.add(rdbR0_8);

        rdbR0_7 = new JRadioButton("");
        rdbR0_7.setOpaque(false);  
        pnlR0.add(rdbR0_7);

        rdbR0_6 = new JRadioButton("");
        rdbR0_6.setOpaque(false);  
        pnlR0.add(rdbR0_6);

        rdbR0_5 = new JRadioButton("");
        rdbR0_5.setOpaque(false);  
        pnlR0.add(rdbR0_5);

        rdbR0_4 = new JRadioButton("");
        rdbR0_4.setOpaque(false);  
        pnlR0.add(rdbR0_4);

        rdbR0_3 = new JRadioButton("");
        rdbR0_3.setOpaque(false);  
        pnlR0.add(rdbR0_3);

        rdbR0_2 = new JRadioButton("");
        rdbR0_2.setOpaque(false);  
        pnlR0.add(rdbR0_2);

        rdbR0_1 = new JRadioButton("");
        rdbR0_1.setOpaque(false);  
        pnlR0.add(rdbR0_1);

        textFieldR0 = new JTextField();
        textFieldR0.setEditable(false);
        pnlR0.add(textFieldR0);
        textFieldR0.setColumns(10);

        btnStoreR0 = new JButton("WRITE");
        btnStoreR0.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreR0.setBorder((new RoundedBorder((9))));
        btnStoreR0.setBackground(Color.red);
        btnStoreR0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        pnlR0.add(btnStoreR0);
        btnStoreR0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR0.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR0.setBackground(Color.RED);
            }
        }
        });

        pnlRegisters.add(pnlR0);

        pnlR1 = new JPanel();
        pnlR1.setBackground(new Color(1, 36, 86));
        //pnlR1.setBounds(6, 56, 666, 31);
       
        lblR_1 = new JLabel("R1");
        lblR_1.setForeground(Color.WHITE);
        pnlR1.add(lblR_1);

        rdbR1_16 = new JRadioButton("");
        rdbR1_16.setOpaque(false);
        pnlR1.add(rdbR1_16);

        rdbR1_15 = new JRadioButton("");
        rdbR1_15.setOpaque(false);
        pnlR1.add(rdbR1_15);

        rdbR1_14 = new JRadioButton("");
        rdbR1_14.setOpaque(false);
        pnlR1.add(rdbR1_14);

        rdbR1_13 = new JRadioButton("");
        rdbR1_13.setOpaque(false);
        pnlR1.add(rdbR1_13);

        rdbR1_12 = new JRadioButton("");
        rdbR1_12.setOpaque(false);
        pnlR1.add(rdbR1_12);

        rdbR1_11 = new JRadioButton("");
        rdbR1_11.setOpaque(false);
        pnlR1.add(rdbR1_11);

        rdbR1_10 = new JRadioButton("");
        rdbR1_10.setOpaque(false);
        pnlR1.add(rdbR1_10);

        rdbR1_9 = new JRadioButton("");
        rdbR1_9.setOpaque(false);
        pnlR1.add(rdbR1_9);

        rdbR1_8 = new JRadioButton("");
        rdbR1_8.setOpaque(false);
        pnlR1.add(rdbR1_8);

        rdbR1_7 = new JRadioButton("");
        rdbR1_7.setOpaque(false);
        pnlR1.add(rdbR1_7);

        rdbR1_6 = new JRadioButton("");
        rdbR1_6.setOpaque(false);
        pnlR1.add(rdbR1_6);

        rdbR1_5 = new JRadioButton("");
        rdbR1_5.setOpaque(false);
        pnlR1.add(rdbR1_5);

        rdbR1_4 = new JRadioButton("");
        rdbR1_4.setOpaque(false);
        pnlR1.add(rdbR1_4);

        rdbR1_3 = new JRadioButton("");
        rdbR1_3.setOpaque(false);
        pnlR1.add(rdbR1_3);

        rdbR1_2 = new JRadioButton("");
        rdbR1_2.setOpaque(false);
        pnlR1.add(rdbR1_2);

        rdbR1_1 = new JRadioButton("");
        rdbR1_1.setOpaque(false);
        pnlR1.add(rdbR1_1);

        textFieldR1 = new JTextField();
        textFieldR1.setEditable(false);
        textFieldR1.setColumns(10);
        pnlR1.add(textFieldR1);

        btnStoreR1 = new JButton("WRITE");
        btnStoreR1.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreR1.setBorder(new RoundedBorder(9));
        btnStoreR1.setBackground(Color.red);

        pnlR1.add(btnStoreR1);

        //adding hover animation
        btnStoreR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR1.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR1.setBackground(Color.RED);
            }
        }
        });

        pnlRegisters.add(pnlR1);

        pnlR2 = new JPanel();
        pnlR2.setBackground(new Color(1, 36, 86));
        //pnlR2.setBounds(6, 97, 666, 31);

        lblR_2 = new JLabel("R2");
        lblR_2.setForeground(Color.WHITE);
        pnlR2.add(lblR_2);

        rdbR2_16 = new JRadioButton("");
        rdbR2_16.setOpaque(false);
        pnlR2.add(rdbR2_16);

        rdbR2_15 = new JRadioButton("");
        rdbR2_15.setOpaque(false);
        pnlR2.add(rdbR2_15);

        rdbR2_14 = new JRadioButton("");
        rdbR2_14.setOpaque(false);
        pnlR2.add(rdbR2_14);

        rdbR2_13 = new JRadioButton("");
        rdbR2_13.setOpaque(false);
        pnlR2.add(rdbR2_13);

        rdbR2_12 = new JRadioButton("");
        rdbR2_12.setOpaque(false);
        pnlR2.add(rdbR2_12);

        rdbR2_11 = new JRadioButton("");
        rdbR2_11.setOpaque(false);
        pnlR2.add(rdbR2_11);

        rdbR2_10 = new JRadioButton("");
        rdbR2_10.setOpaque(false);
        pnlR2.add(rdbR2_10);

        rdbR2_9 = new JRadioButton("");
        rdbR2_9.setOpaque(false);
        pnlR2.add(rdbR2_9);

        rdbR2_8 = new JRadioButton("");
        rdbR2_8.setOpaque(false);
        pnlR2.add(rdbR2_8);

        rdbR2_7 = new JRadioButton("");
        rdbR2_7.setOpaque(false);
        pnlR2.add(rdbR2_7);

        rdbR2_6 = new JRadioButton("");
        rdbR2_6.setOpaque(false);
        pnlR2.add(rdbR2_6);

        rdbR2_5 = new JRadioButton("");
        rdbR2_5.setOpaque(false);
        pnlR2.add(rdbR2_5);

        rdbR2_4 = new JRadioButton("");
        rdbR2_4.setOpaque(false);
        pnlR2.add(rdbR2_4);

        rdbR2_3 = new JRadioButton("");
        rdbR2_3.setOpaque(false);
        pnlR2.add(rdbR2_3);

        rdbR2_2 = new JRadioButton("");
        rdbR2_2.setOpaque(false);
        pnlR2.add(rdbR2_2);

        rdbR2_1 = new JRadioButton("");
        rdbR2_1.setOpaque(false);
        pnlR2.add(rdbR2_1);

        textFieldR2 = new JTextField();
        textFieldR2.setEditable(false);
        textFieldR2.setColumns(10);
        pnlR2.add(textFieldR2);

        btnStoreR2 = new JButton("WRITE");
        btnStoreR2.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreR2.setBorder((new RoundedBorder(9)));
        btnStoreR2.setBackground(Color.red);
        pnlR2.add(btnStoreR2);

        //adding hover animation
        btnStoreR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR1.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreR1.setBackground(Color.RED);
            }
        }
        });


        pnlRegisters.add(pnlR2);
        pnlRegisters.add(pnlR3);
        pnlRegisters.add(pnlX1);
        pnlRegisters.add(pnlX2);
        pnlRegisters.add(pnlX3);
        pnlRegisters.add(pnlMAR);
        pnlRegisters.add(pnlMBR);
        pnlRegisters.add(pnlMSR);
        pnlRegisters.add(pnlPC);
        pnlRegisters.add(pnlIR);

        pnlCC = new JPanel();
        pnlCC.setBackground(new Color(1, 36, 86));

        lblCC = new JLabel("CC");
        lblCC.setForeground(Color.WHITE);
        pnlCC.add(lblCC);

        rdbCC_4 = new JRadioButton("");
        rdbCC_4.setOpaque(false);
        pnlCC.add(rdbCC_4);

        rdbCC_3 = new JRadioButton("");
        rdbCC_3.setOpaque(false);
        pnlCC.add(rdbCC_3);

        rdbCC_2 = new JRadioButton("");
        rdbCC_2.setOpaque(false);
        pnlCC.add(rdbCC_2);

        rdbCC_1 = new JRadioButton("");
        rdbCC_1.setOpaque(false);
        pnlCC.add(rdbCC_1);

        textFieldCC = new JTextField();
        textFieldCC.setEditable(false);
        textFieldCC.setColumns(10);
        pnlCC.add(textFieldCC);

        btnStoreCC = new JButton("WRITE");
        btnStoreCC.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnStoreCC.setBorder(new RoundedBorder(9));
        btnStoreCC.setBackground(Color.red);
        pnlCC.add(btnStoreCC);
        pnlRegisters.add(pnlCC);

        //adding hover

        btnStoreCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreCC.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnStoreCC.setBackground(Color.RED);
            }
        }
        });

        btnIPL = new JButton("IPL");
        btnIPL.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        // btnIPL.setBorder(new RoundedBorder(9));
        btnIPL.setBackground(Color.red);
        btnIPL.setBounds(100, 30, 158, 33);

        //adding hover effects

        btnIPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIPL.setBackground(Color.GREEN);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIPL.setBackground(Color.RED);
            }
        });
        btnIPL.setBounds(36, 29, 136, 69);

        testPanel = new JPanel();
        testPanel.setBackground(new Color(1, 36, 86));
        testPanel.setBounds(808, 565, 208, 165);
        testPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        lblTestPanel = new JLabel("Memory interface");
        lblTestPanel.setForeground((Color.white));
        testPanel.add(lblTestPanel);

        pnlAddress = new JPanel();
        pnlAddress.setBackground(new Color(1, 36, 86));
        testPanel.add(pnlAddress);
        pnlAddress.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblAddress = new JLabel("ADDRESS");
        lblAddress.setFont(new Font("Verdana Bold", Font.ITALIC, 12));
        lblAddress.setForeground(Color.RED);
        lblAddress.setBackground(new Color(1, 36, 86));
        pnlAddress.add(lblAddress);

        textFieldAddress = new JTextField();
        textFieldAddress.setText("0");
        pnlAddress.add(textFieldAddress);
        textFieldAddress.setColumns(10);

        pnlValue = new JPanel();
        pnlValue.setBackground(new Color(1, 36, 86));
        testPanel.add(pnlValue);
        pnlValue.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblValue = new JLabel("VALUE");
        lblValue.setFont(new Font("Verdana Bold",Font.ITALIC, 12));
        lblValue.setForeground(Color.RED);
        pnlValue.add(lblValue);

        textFieldValue = new JTextField();
        textFieldValue.setText("0");
        pnlValue.add(textFieldValue);
        textFieldValue.setColumns(10);

        pnlButton = new JPanel();
        pnlButton.setBackground(new Color(1, 36, 86));
        testPanel.add(pnlButton);
        pnlButton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        btnStore = new JButton("STORE");
        btnStore.setBackground(Color.red);
        btnStore.setFont(f);
        pnlButton.add(btnStore);

        //adding hover effects

        btnStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStore.setBackground(Color.GREEN);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStore.setBackground(Color.RED);
            }
        });
        
        

        btnLoad = new JButton("LOAD");
        btnLoad.setBackground(Color.red);
        btnLoad.setFont(f);
        pnlButton.add(btnLoad);
        setEnableForPanel(pnlRegisters, false);

        //Adding hover effects
        
        btnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoad.setBackground(Color.GREEN);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoad.setBackground(Color.RED);
            }
        });        

        pnlPrinter = new JPanel();
        pnlPrinter.setBackground(new Color(1, 36, 86));
        pnlPrinter.setBounds(808, 6, 254, 201);
        pnlPrinter.setLayout(new BoxLayout(pnlPrinter, BoxLayout.Y_AXIS));

        lblPrinter = new JLabel("Console");
        lblPrinter.setForeground(Color.WHITE);
        lblPrinter.setFont(new Font("Verdana Bold", Font.ITALIC,12));
        pnlPrinter.add(lblPrinter);

        scrollPane1 = new JScrollPane();
        pnlPrinter.add(scrollPane1);

        consolePrinter = new JTextArea();
        consolePrinter.setLineWrap(true);
        consolePrinter.setEditable(false);
        scrollPane1.setViewportView(consolePrinter);

        pnlOp = new JPanel();
        pnlOp.setBackground(new Color(1, 36, 86));
        pnlOp.setBounds(6, 111, 715, 56);
        pnlOp.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        pnlIns = new JPanel();
        pnlIns.setBackground(new Color(1, 36, 86));
        pnlOp.add(pnlIns);
        pnlIns.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblIns = new JLabel("Instruction");
        lblIns.setForeground(Color.WHITE);
        pnlIns.add(lblIns);

        rdbIns_16 = new JRadioButton("");
        rdbIns_16.setBackground(new Color(240, 240, 240));
        rdbIns_16.setOpaque(false);
        pnlIns.add(rdbIns_16);

        rdbIns_15 = new JRadioButton("");
        rdbIns_15.setBackground(new Color(240, 240, 240));
        rdbIns_15.setOpaque(false);
        pnlIns.add(rdbIns_15);

        rdbIns_14 = new JRadioButton("");
        rdbIns_14.setBackground(new Color(240, 240, 240));
        rdbIns_14.setOpaque(false);
        pnlIns.add(rdbIns_14);

        rdbIns_13 = new JRadioButton("");
        rdbIns_13.setBackground(new Color(240, 240, 240));
        rdbIns_13.setOpaque(false);
        pnlIns.add(rdbIns_13);

        rdbIns_12 = new JRadioButton("");
        rdbIns_12.setBackground(new Color(240, 240, 240));
        rdbIns_12.setOpaque(false);
        pnlIns.add(rdbIns_12);

        rdbIns_11 = new JRadioButton("");
        rdbIns_11.setOpaque(false);
        pnlIns.add(rdbIns_11);

        rdbIns_10 = new JRadioButton("");
        rdbIns_10.setOpaque(false);
        pnlIns.add(rdbIns_10);

        rdbIns_9 = new JRadioButton("");
        rdbIns_9.setOpaque(false);
        pnlIns.add(rdbIns_9);

        rdbIns_8 = new JRadioButton("");
        rdbIns_8.setOpaque(false);
        pnlIns.add(rdbIns_8);

        rdbIns_7 = new JRadioButton("");
        rdbIns_7.setOpaque(false);
        pnlIns.add(rdbIns_7);

        rdbIns_6 = new JRadioButton("");
        rdbIns_6.setOpaque(false);
        pnlIns.add(rdbIns_6);

        rdbIns_5 = new JRadioButton("");
        rdbIns_5.setOpaque(false);
        pnlIns.add(rdbIns_5);

        rdbIns_4 = new JRadioButton("");
        rdbIns_4.setOpaque(false);
        pnlIns.add(rdbIns_4);

        rdbIns_3 = new JRadioButton("");
        rdbIns_3.setOpaque(false);
        pnlIns.add(rdbIns_3);

        rdbIns_2 = new JRadioButton("");
        rdbIns_2.setOpaque(false);
        pnlIns.add(rdbIns_2);

        rdbIns_1 = new JRadioButton("");
        rdbIns_1.setOpaque(false);
        pnlIns.add(rdbIns_1);

        btnExecute = new JButton("RUN");
        btnExecute.setBorder(new RoundedBorder(9));
        btnExecute.setBackground(Color.red);
        btnExecute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnExecute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnExecute.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnExecute.setBackground(Color.RED);
            }
        }
        });

        pnlIns.add(btnExecute);

        // set the panels to disabled
        // after you push the IPL button on the frontpanel, these panels will be
        // set to enabled
        setEnableForPanel(pnlIns, false);

        pnlCache = new JPanel();
        pnlCache.setBackground(new Color(1, 36, 86));
        pnlCache.setBounds(808, 418, 254, 147);

        lblCache = new JLabel("Cache");
        lblCache.setForeground(Color.white);

        scrollPane3 = new JScrollPane();

        tableCache = new JTable(16, 2);
        tableCache.setEnabled(false);
        scrollPane3.setViewportView(tableCache);
        tableCache.setModel(new DefaultTableModel(
                new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
                        { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
                        { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, },
                new String[] { "Tag", "Data" }));
        pnlCache.setLayout(new BoxLayout(pnlCache, BoxLayout.Y_AXIS));
        pnlCache.add(lblCache);
        pnlCache.add(scrollPane3);

        pnlProgram1 = new JPanel();
        pnlProgram1.setBackground(new Color(1, 36, 86));
        pnlProgram1.setBounds(392, 6, 162, 92);

        lblProgram1 = new JLabel("Program 1");
        lblProgram1.setForeground(Color.WHITE);
        pnlProgram1.add(lblProgram1);

        btnNums = new JButton("read 20 numbers");
        pnlProgram1.add(btnNums);
        btnNums.setBackground(Color.red);
        btnNums.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnNums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnNums.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnNums.setBackground(Color.RED);
            }
        }
        });

        btnCompare = new JButton("compare");
        btnCompare.setBackground(Color.red);
        btnCompare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnCompare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnCompare.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnCompare.setBackground(Color.RED);
            }
        }
        });
        pnlProgram1.add(btnCompare);

        setEnableForPanel(pnlProgram1, false);
        frmCsciClassProject.getContentPane().setLayout(null);
        frmCsciClassProject.getContentPane().add(pnlOp);
        frmCsciClassProject.getContentPane().add(pnlRegisters);
        
       
        
                pnlMFR = new JPanel();
                pnlMFR.setBackground(new Color(1, 36, 86));

                        lblMFR = new JLabel("MFR");
                        lblMFR.setForeground(Color.WHITE);
                        pnlMFR.add(lblMFR);
                        
                                rdbMFR_4 = new JRadioButton("");
                                rdbMFR_4.setOpaque(false);
                                pnlMFR.add(rdbMFR_4);
                                
                                        rdbMFR_3 = new JRadioButton("");
                                        rdbMFR_3.setOpaque(false);
                                        pnlMFR.add(rdbMFR_3);
                                        
                                                rdbMFR_2 = new JRadioButton("");
                                                rdbMFR_2.setOpaque(false);
                                                pnlMFR.add(rdbMFR_2);
                                                
                                                        rdbMFR_1 = new JRadioButton("");
                                                        rdbMFR_1.setOpaque(false);
                                                        pnlMFR.add(rdbMFR_1);
                                                        
                                                                textFieldMFR = new JTextField();
                                                                textFieldMFR.setEditable(false);
                                                                textFieldMFR.setColumns(10);
                                                                pnlMFR.add(textFieldMFR);
                                                                
                                                                        btnStoreMFR = new JButton("WRITE");
                                                                        btnStoreMFR.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
                                                                        btnStoreMFR.setBorder(new RoundedBorder(9));
                                                                        btnStoreMFR.setBackground(Color.red);
                                                                        
                                                                        //adding hover

                                                                        btnStoreMFR.addMouseListener(new java.awt.event.MouseAdapter(){
                                                                            public void mouseEntered(java.awt.event.MouseEvent evt){
                                                                                if(enableFlag == 1){
                                                                                    btnStoreMFR.setBackground((Color.GREEN));
                                                                                }
                                                                            }
                                                                            public void mouseExited(java.awt.event.MouseEvent evt){
                                                                                if(enableFlag == 1){
                                                                                    btnStoreMFR.setBackground((Color.RED));
                                                                                }
                                                                            }
                                                                        });

                                                                        btnStoreMFR.addActionListener(new ActionListener() {
                                                                        	public void actionPerformed(ActionEvent e) {
                                                                        	}
                                                                        });
                                                                        pnlMFR.add(btnStoreMFR);
                                                                        pnlRegisters.add(pnlMFR);
        frmCsciClassProject.getContentPane().add(btnIPL);
        frmCsciClassProject.getContentPane().add(pnlPrinter);
        frmCsciClassProject.getContentPane().add(testPanel);
        frmCsciClassProject.getContentPane().add(pnlProgram1);
        frmCsciClassProject.getContentPane().add(pnlCache);

        pnlKeyb = new JPanel();
        pnlKeyb.setBackground(new Color(1, 36, 86));
        pnlKeyb.setBounds(808, 215, 254, 201);
        frmCsciClassProject.getContentPane().add(pnlKeyb);
        pnlKeyb.setLayout(new BoxLayout(pnlKeyb, BoxLayout.Y_AXIS));

        lblKeyboard = new JLabel("Console Keyboard");
        lblKeyboard.setForeground(Color.WHITE);
        lblKeyboard.setFont(new Font("Verdana Bold", Font.ITALIC, 12));
        pnlKeyb.add(lblKeyboard);

        scrollPane2 = new JScrollPane();
        pnlKeyb.add(scrollPane2);

        consoleKeyboard = new JTextArea();
        consoleKeyboard.setLineWrap(true);
        scrollPane2.setViewportView(consoleKeyboard);

        btnRunSingleStep = new JButton("SS");
        btnRunSingleStep.setFont(new Font("Verbana Bold", Font.ITALIC, 12));
        btnRunSingleStep.setBorder(new RoundedBorder(9));
        btnRunSingleStep.setBackground(Color.red);
        btnRunSingleStep.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnRunSingleStep.setBounds(186, 29, 153, 69);
        btnRunSingleStep.setEnabled(false);
        frmCsciClassProject.getContentPane().add(btnRunSingleStep);

        btnRunSingleStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
               if(enableFlag == 1){
                btnRunSingleStep.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnRunSingleStep.setBackground(Color.RED);
            }
        }
        });   
        pnlProgram2 = new JPanel();
        pnlProgram2.setBackground(new Color(1, 36, 86));
        pnlProgram2.setBounds(568, 6, 153, 92);
        frmCsciClassProject.getContentPane().add(pnlProgram2);

        lblProgram = new JLabel("Program 2");
        lblProgram.setForeground(Color.white);
        pnlProgram2.add(lblProgram);

        btnLoadSentences = new JButton("load sentences");
        btnLoadSentences.setBackground(Color.red);
        btnLoadSentences.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnLoadSentences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnLoadSentences.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnLoadSentences.setBackground(Color.RED);
            }
        }
        });
        pnlProgram2.add(btnLoadSentences);

        btnFindWord = new JButton("find word");
        btnFindWord.setBackground(Color.red);
        btnFindWord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });

        btnFindWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnFindWord.setBackground(Color.GREEN);
            }
        }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(enableFlag == 1){
                btnFindWord.setBackground(Color.RED);
            }
        }
        });
        pnlProgram2.add(btnFindWord);
        setEnableForPanel(pnlProgram2, false);
        
        

    }

    /**
     * Add listeners to the components
     */
    private void addListeners() {

        // add listener to the store button of R0. when you push the store
        // button, the selecting status of the radiobuttons will be read, and
        // this method will calculate the value of the register, then put it
        // into the textfield and store it into the
        // register. no effective value will be read from textfield
        btnStoreR0.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR0.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR0.setText(String.valueOf(value));
                registers.setR0(value);
                System.out.println("R0 is set to: " + value);
                printConsole("R0 is set to: " + value);
            }
        });
        // add listener to the store button of R1
        btnStoreR1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR1.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR1.setText(String.valueOf(value));
                registers.setR1(value);
                System.out.println("R1 is set to: " + value);
                printConsole("R1 is set to: " + value);
            }
        });
        // add listener to the store button of R2
        btnStoreR2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR2.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR2.setText(String.valueOf(value));
                registers.setR2(value);
                System.out.println("R2 is set to: " + value);
                printConsole("R2 is set to: " + value);
            }
        });
        // add listener to the store button of R3
        btnStoreR3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR3.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR3.setText(String.valueOf(value));
                registers.setR3(value);
                System.out.println("R3 is set to: " + value);
                printConsole("R3 is set to: " + value);
            }
        });
        // add listener to the store button of X1
        btnStoreX1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX1.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX1.setText(String.valueOf(value));
                registers.setX1(value);
                System.out.println("X1 is set to: " + value);
                printConsole("X1 is set to: " + value);
            }
        });
        // add listener to the store button of X2
        btnStoreX2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX2.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX2.setText(String.valueOf(value));
                registers.setX2(value);
                System.out.println("X2 is set to: " + value);
                printConsole("X2 is set to: " + value);
            }
        });
        // add listener to the store button of X3
        btnStoreX3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX3.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX3.setText(String.valueOf(value));
                registers.setX1(value);
                System.out.println("X3 is set to: " + value);
                printConsole("X3 is set to: " + value);
            }
        });
        // add listener to the store button of MAR
        btnStoreMAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMAR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMAR.setText(String.valueOf(value));
                registers.setMAR(value);
                System.out.println("MAR is set to: " + value);
                printConsole("MAR is set to: " + value);
            }
        });
        // add listener to the store button of MBR
        btnStoreMBR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMBR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMBR.setText(String.valueOf(value));
                registers.setMBR(value);
                System.out.println("MBR is set to: " + value);
                printConsole("MBR is set to: " + value);
            }
        });
        // add listener to the store button of MSR
        btnStoreMSR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMSR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMSR.setText(String.valueOf(value));
                registers.setMSR(value);
                System.out.println("MSR is set to: " + value);
                printConsole("MSR is set to: " + value);
            }
        });
        // add listener to the store button of MFR
        btnStoreMFR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMFR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMFR.setText(String.valueOf(value));
                registers.setMFR(value);
                System.out.println("MFR is set to: " + value);
                printConsole("MFR is set to: " + value);
            }
        });
        // add listener to the store button of PC
        btnStorePC.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlPC.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldPC.setText(String.valueOf(value));
                registers.setPC(value);
                System.out.println("PC is set to: " + value);
                printConsole("PC is set to: " + value);
            }
        });
        // add listener to the store button of IR
        btnStoreIR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlIR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }

                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldIR.setText(String.valueOf(value));
                registers.setIR(value);
                System.out.println("IR is set to: " + value);
                printConsole("IR is set to: " + value);
            }
        });
        // add listener to the store button of CC
        btnStoreCC.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlCC.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldCC.setText(String.valueOf(value));
                registers.setCC(value);
                System.out.println("CC is set to: " + value);
                printConsole("CC is set to: " + value);
            }
        });
        
        // add listener to the store button of FR0
       
        // add listener to the execute button of instruction
        btnExecute.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlIns.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                // refreshRegistersPanel();

                mcu.storeIntoCache(registers.getPC(), value);
                registers.setMAR(registers.getPC());
                registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                registers.setIR(registers.getMBR());
                // refreshRegistersPanel();
                String ins = registers.getBinaryStringIr();
                printConsole("PC: " + registers.getPC() + ", instruction: " + ins);
                runInstruction(ins, registers, mcu);
                // registers.increasePCByOne(); // TODO fix it
                refreshRegistersPanel();
            }

        });
        this.btnRunSingleStep.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                registers.setMAR(registers.getPC());
                registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                registers.setIR(registers.getMBR());
                String ins = registers.getBinaryStringIr();
                printConsole("PC: " + registers.getPC() + ", instruction: " + ins);
                runInstruction(ins, registers, mcu);
            }
        });
        // add listener to the IPL button
        btnIPL.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                initCPU();
                prog1Step = 0;
                prog2Step = 0;
                mcu.loadProgram(Const.TB);
                if (enableFlag == 0) {
                    setEnableForPanel(pnlIns, true);
                    setEnableForPanel(pnlRegisters, true);
                    setEnableForPanel(pnlProgram1, true);
                    setEnableForPanel(pnlProgram2, true);
                    btnRunSingleStep.setEnabled(true);
                    // prog1Step = 0;
                    enableFlag = 1;

                }
                // refreshRegistersPanel();

                // mcu.loadMemoryFromROM();
                registers.setPC(Const.BOOT_PROG_BASE);
                // int end = Const.ROM.size() + Const.BOOT_PROG_BASE;
                //
                // do {
                // refreshRegistersPanel();
                // registers.setMAR(registers.getPC());
                // registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                // registers.setIR(registers.getMBR());
                // runInstruction(registers.getBinaryStringIr(), registers,
                // mcu);
                // refreshRegistersPanel();
                // //registers.increasePCByOne();// TODO fix it
                //
                // } while (registers.getPC() < end);
                // registers.setPC(8);
                refreshRegistersPanel();
                printConsole("IPL complete!");
            }
        });
        btnLoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int address = Integer.parseInt(textFieldAddress.getText());
                if (address > mcu.getCurrentMemorySize() - 1 || address < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Memory between 0 and " + (mcu.getCurrentMemorySize() - 1) + "!");
                } else {
                    int value = mcu.fetchFromMemory(address);
                    textFieldValue.setText(String.valueOf(value));
                }
            }
        });

        btnStore.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int address = Integer.parseInt(textFieldAddress.getText());
                int value = Integer.parseInt(textFieldValue.getText());
                if (address > mcu.getCurrentMemorySize() - 1 || address < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Memory between 0 and " + (mcu.getCurrentMemorySize() - 1) + "!");
                } else if (value > 0xffff || value < 0) {
                    JOptionPane.showMessageDialog(null, "Value between 0 and 65535!");
                } else {
                    mcu.storeIntoMemory(address, value);
                    textFieldAddress.setText("0");
                    textFieldValue.setText("0");
                    printConsole("store memory address " + address + " with value " + value);
                }
            }
        });

        textFieldAddress.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent arg0) {
                textFieldAddress.selectAll();
            }

            @Override
            public void focusLost(FocusEvent arg0) {

            }
        });
        textFieldValue.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent arg0) {
                textFieldValue.selectAll();
            }

            @Override
            public void focusLost(FocusEvent arg0) {

            }
        });
        consoleKeyboard.addKeyListener(new KeyAdapter() { // TODO
            public void keyReleased(KeyEvent e) {
                mcu.setKeyboardBuffer(consoleKeyboard.getText());
            }
        });

        btnNums.addMouseListener(new MouseAdapter() { // TODO
            public void mousePressed(MouseEvent e) {
                if (prog1Step == 0) {
                    // read 20 numbers from the console keyboard
                    System.out.println("start reading numbers");
                    if (consoleKeyboard.getText() == null || consoleKeyboard.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "type 20 numbers in the console keyboard");

                    } else {
                        printConsole("Below are the 20 numbers: ");
                        mcu.loadProgram(Const.Pre);
                        mcu.loadProgram(Const.PG1_20);
                        registers.setPC(Const.PG_20_BASE);

                        // refreshRegistersPanel();
                        do {
                            // refreshRegistersPanel();
                            registers.setMAR(registers.getPC());
                            registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                            registers.setIR(registers.getMBR());
                            runInstruction(registers.getBinaryStringIr(), registers, mcu);
                            // refreshRegistersPanel();
                            // pushConsoleBuffer();
                        } while (registers.getPC() <= Const.PG_20_END && registers.getPC() >= Const.PG_20_BASE);
                        refreshRegistersPanel();
                        prog1Step = 1;
                        printConsole("Please enter 1 number (end with ',') and press the compare button. ");
                    }
                }

            }
        });

        btnCompare.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (prog1Step == 1) {
                    System.out.println("read 1 number");
                    mcu.loadProgram(Const.PG1_20);
                    registers.setPC(Const.PG_20_BASE);

                    // refreshRegistersPanel();
                    do {
                        // refreshRegistersPanel();
                        registers.setMAR(registers.getPC());
                        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                        registers.setIR(registers.getMBR());
                        runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        // refreshRegistersPanel();
                        // pushConsoleBuffer();
                    } while (registers.getPC() <= Const.PG_20_END && registers.getPC() >= Const.PG_20_BASE);

                    System.out.println("start comparing numbers");
                    printConsole("compare result: the closest number is");
                    mcu.loadProgram(Const.PG1_10);
                    registers.setPC(Const.PG_10BASE);

                    do {
                        registers.setMAR(registers.getPC());
                        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                        registers.setIR(registers.getMBR());
                        runInstruction(registers.getBinaryStringIr(), registers, mcu);
                    } while (registers.getPC() <= Const.PG_10END && registers.getPC() >= Const.PG_10BASE);

                    System.out.println("print the result in m(30)");
                    mcu.loadProgram(Const.PG_P);
                    registers.setPC(Const.PG_P_BASE);
                    do {
                        registers.setMAR(registers.getPC());
                        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                        registers.setIR(registers.getMBR());
                        runInstruction(registers.getBinaryStringIr(), registers, mcu);
                    } while (registers.getPC() <= Const.PG_P_END && registers.getPC() >= Const.PG_P_BASE);

                    refreshRegistersPanel();
                    prog1Step = 0;

                }
            }
        });

        this.btnLoadSentences.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (prog2Step == 0) {
                    String sentences = "Once upon a midnight dreary, while I pondered, weak and weary. "
                            + "Over many a quaint and curious volume of forgotten lore. "
                            + "While I nodded, nearly napping, suddenly there came a tapping. "
                            + "As of some one gently rapping, rapping at my chamber door. "
                            + "Tis some visitor I muttered tapping at my chamber door only this and nothing more. "
                            + "Ah distinctly I remember it was in the bleak December. ";
                    mcu.setCardBuffer(sentences);
                    System.out.println("start to read sentences");

                    mcu.loadProgram(Const.PRE_PROG2);
                    mcu.loadProgram(Const.PROG2_0);
                    registers.setPC(Const.PG2_0_BASE);
                    do {
                        registers.setMAR(registers.getPC());
                        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                        registers.setIR(registers.getMBR());
                        runInstruction(registers.getBinaryStringIr(), registers, mcu);
                    } while (registers.getPC() <= Const.PG2_0_END && registers.getPC() >= Const.PG2_0_BASE);
                    printConsole("Please enter a word in the console keyboard and press the find word button. ");

                    refreshRegistersPanel();
                    prog2Step = 1;
                }
            }
        });

        this.btnFindWord.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (prog2Step == 1) {
                    System.out.println("start to read the word");
                    if (consoleKeyboard.getText() == null || consoleKeyboard.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "type a word in the console keyboard");

                    } else {
                        // read the word
                        printConsole("search result: the word is");
                        mcu.loadProgram(Const.PROG2_1);
                        registers.setPC(Const.PG2_1_BASE);
                        do {
                            registers.setMAR(registers.getPC());
                            registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                            registers.setIR(registers.getMBR());
                            runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        } while (registers.getPC() <= Const.PG2_1_END && registers.getPC() >= Const.PG2_1_BASE);
                        // find the word
                        printConsole("the word number is");
                        mcu.loadProgram(Const.PROG2_2);
                        registers.setPC(Const.PG2_2_BASE);
                        do {
                            registers.setMAR(registers.getPC());
                            registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                            registers.setIR(registers.getMBR());
                            runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        } while (registers.getPC() <= Const.PG2_2_END && registers.getPC() >= Const.PG2_2_BASE);
                        System.out.println("print the result in m(28)");

                        mcu.loadProgram(Const.PG_P1);
                        registers.setPC(Const.PG_P1_BASE);
                        do {
                            registers.setMAR(registers.getPC());
                            registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                            registers.setIR(registers.getMBR());
                            runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        } while (registers.getPC() <= Const.PG_P1_END && registers.getPC() >= Const.PG_P1_BASE);
                        System.out.println("print the result in m(29)");
                        printConsole("the sentence number is");
                        mcu.loadProgram(Const.PG_P2);
                        registers.setPC(Const.PG_P2_BASE);
                        do {
                            registers.setMAR(registers.getPC());
                            registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                            registers.setIR(registers.getMBR());
                            runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        } while (registers.getPC() <= Const.PG_P2_END && registers.getPC() >= Const.PG_P2_BASE);

                        refreshRegistersPanel();
                        prog2Step = 0;
                    }
                }
            }
        });
        
     

    }

    private void refreshCacheTable() {
        int row = 0;
        for (CacheLine line : mcu.getCache().getCacheLines()) {
            this.tableCache.setValueAt(line.getTag(), row, 0);
            this.tableCache.setValueAt(line.getData(), row, 1);
            row++;
        }

    }

    private void pushConsoleBuffer() {
        if (mcu.getPrinterBuffer() != null) {
            consolePrinter.append(mcu.getPrinterBuffer());
            mcu.setPrinterBuffer("");
        }
        if (mcu.getKeyboardBuffer() != null) {
            consoleKeyboard.setText(mcu.getKeyboardBuffer());
        }
    }

    /**
     * This method will read the value of every register and set the radio
     * buttons and text field according to the value of the register.
     */
    private void refreshRegistersPanel() {
        for (Component com : pnlRegisters.getComponents()) {
            if (com instanceof JPanel) {
                JPanel pnl = (JPanel) com;
                int regVal = 0;
                int bitLong = 0;
                String bitString = "";
                int i = 0;
                for (Component comm : pnl.getComponents()) {
                    if (comm instanceof JLabel) {
                        JLabel lbl = (JLabel) comm;
                        regVal = registers.getRegistersByName(lbl.getText());
                        bitLong = registers.getBitLongByName(lbl.getText());
                        bitString = StringUtil.decimalToBinary(regVal, bitLong);
                        i = bitLong;
                    }
                    if (comm instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) comm;
                        if (bitString.charAt(bitLong - i) == '1') {
                            rdb.setSelected(true);
                        } else {
                            rdb.setSelected(false);
                        }
                        i--;
                    }
                    if (comm instanceof JTextField) {
                        JTextField txt = (JTextField) comm;
                        txt.setText(String.valueOf(regVal));
                    }
                }
            }
        }
    }

    /**
     * 
     * set every component in the panel enabled/disabled according to the flag
     * 
     * @param panel
     * @param flag
     *            true: enable; false: disable
     * 
     */
    private void setEnableForPanel(JPanel panel, boolean flag) {
        for (Component com : panel.getComponents()) {
            if (com instanceof JPanel) {
                JPanel subPanel = (JPanel) com;
                this.setEnableForPanel(subPanel, flag);
            } else {
                com.setEnabled(flag);
            }
        }
    }

    /**
     * 
     * print a message in the console
     * 
     * @param message
     *            the message you want to print
     * 
     */
    private void printConsole(String message) {
        consolePrinter.append(message + "\n");
    }

    /**
     * 
     * run the instruction
     * 
     * @param instruction
     *            instruction in binary String, for example "0000000000000000".
     * @param registers
     * @param mcu
     * 
     */
    private void runInstruction(String instruction, Registers registers, MCU mcu) {

        // execute button event
        String opCode = instruction.substring(0, 6);
        try {
            if (Const.OPCODE.containsKey(opCode)) {

                @SuppressWarnings("deprecation")
				AbstractInstruction instr = (AbstractInstruction) Class
                        .forName("alu.instruction." + Const.OPCODE.get(opCode)).newInstance();
                instr.execute(instruction, registers, mcu);
                System.out.println("PC: " + registers.getPC() + ", instruction: " + instruction);
                // printConsole("instruction: " + instruction);
                refreshCacheTable();
                pushConsoleBuffer();

                String message = instr.getExecuteMessage();
                System.out.println(message);
                //
                // TODO do something with this message
                //

            } else {
                // we don't have that kind of instruction
                throw new MachineFaultException(Const.FaultCode.ILL_OPRC.getValue(),
                        Const.FaultCode.ILL_OPRC.getMessage());
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MachineFaultException t) {
            // handle the machine fault

            t.printStackTrace();
            handleMachineFault(t.getFaultCode(), t.getMessage());
        }
    }

    private void handleMachineFault(int faultCode, String message) {
        // when a machine fault occurs, we should save current values of PC and
        // MSR into reserved locations in memory.
        registers.setMAR(4);
        registers.setMBR(registers.getPC());
        mcu.storeIntoCache(registers.getMAR(), registers.getMBR());

        registers.setMAR(5);
        registers.setMBR(registers.getMSR());
        mcu.storeIntoCache(registers.getMAR(), registers.getMBR()); // location
                                                                    // 5 in
                                                                    // memory is
                                                                    // not used,
                                                                    // so we can
                                                                    // store MSR
                                                                    // for
                                                                    // machine
                                                                    // fault in
                                                                    // address 5

        registers.setMFR(faultCode);

        JOptionPane.showMessageDialog(null, message, "Fault Code: " + faultCode, JOptionPane.WARNING_MESSAGE);

        // now we should fetch from location 1 into the PC
        registers.setPC(mcu.fetchFromCache(1));

    }
}