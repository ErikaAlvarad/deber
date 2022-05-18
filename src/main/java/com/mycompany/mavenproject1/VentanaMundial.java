/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author morti
 */
public class VentanaMundial extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBoxList;
    
    
    public VentanaMundial(String title) throws HeadlessException {
        super(title);
        this.setSize(400,300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.RED);
        this.jPanel1.setLayout(new GridLayout(5,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
//        this.iniciarChecks();
        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.LIGHT_GRAY);
    /*    this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(Color.BLUE);
        this.jPanelList.get(2).setBackground(Color.CYAN);
        this.jPanelList.get(3).setBackground(Color.YELLOW);*/
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
       
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INSCRIBETE"));
        this.jLabelList.add(new JLabel("Ingrese Sede: "));
        this.jLabelList.add(new JLabel("Tipo Documento: "));
        this.jLabelList.add(new JLabel("Ingrese su Identificacion: "));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
       
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(12);
        this.jPanelList.get(3).add(this.jTextFieldList.get(0));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));  
        this.jPanelList.get(4).add(this.jButtonList.get(0));
        
    }
    
//    public void iniciarChecks(){
//        this.jCheckboxList = new ArrayList<>();
//        this.jCheckboxList.add(new JCheckBox("Adidas"));
//        this.jCheckboxList.add(new JCheckBox("Nike"));
//        this.jCheckboxList.add(new JCheckBox("Coca Cola"));
//        this.jCheckboxList.add(new JCheckBox("Pepsi"));
//        this.jCheckboxList.add(new JCheckBox("FIFA",true));
//        this.jPanelList.get(4).add(this.jCheckboxList.get(0));
//        this.jPanelList.get(4).add(this.jCheckboxList.get(1)); 
//        this.jPanelList.get(4).add(this.jCheckboxList.get(2)); 
//        this.jPanelList.get(4).add(this.jCheckboxList.get(3)); 
//        this.jPanelList.get(4).add(this.jCheckboxList.get(4)); 
//               
//        
//        
//    }
    public void iniciarCombo(){
        
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.get(0).addItem("MATRIZ CUENCA");
        this.jComboBoxList.get(0).addItem("GUAYAQUIL");
        this.jComboBoxList.get(0).addItem("QUITO");
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jComboBoxList.get(1).addItem("CEDULA");
        this.jComboBoxList.get(1).addItem("PASAPORTE");
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));
    }
    
    
    
}