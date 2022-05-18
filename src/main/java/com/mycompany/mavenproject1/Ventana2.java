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
 * @author PC-1
 */
public class Ventana2 extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBoxList;
    
    
    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(11,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
//        this.iniciarChecks();
//        this.iniciarCombo();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(10).setBackground(Color.WHITE);
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
       
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.add(new JLabel("Personal"));
        this.jLabelList.add(new JLabel("Apellidos: "));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("Nacionalidad: "));
        this.jLabelList.add(new JLabel("Genero: "));
        this.jLabelList.add(new JLabel("Correo Electronico Personal: "));
        this.jLabelList.add(new JLabel("Fecha Nacimiento: "));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("Whatsapp: "));
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
       
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(12);
        this.jTextFieldList.get(1).setColumns(12);
        this.jTextFieldList.get(2).setColumns(12);
        this.jTextFieldList.get(3).setColumns(12);
        this.jTextFieldList.get(4).setColumns(12);
        this.jTextFieldList.get(5).setColumns(12);
        this.jTextFieldList.get(6).setColumns(12);
        this.jTextFieldList.get(7).setColumns(12);
        this.jTextFieldList.get(8).setColumns(12);
        this.jPanelList.get(2).add(this.jTextFieldList.get(0));
        this.jPanelList.get(3).add(this.jTextFieldList.get(1));
        this.jPanelList.get(4).add(this.jTextFieldList.get(2));
        this.jPanelList.get(5).add(this.jTextFieldList.get(3));
        this.jPanelList.get(6).add(this.jTextFieldList.get(4));
        this.jPanelList.get(7).add(this.jTextFieldList.get(5));
        this.jPanelList.get(8).add(this.jTextFieldList.get(6));
        this.jPanelList.get(9).add(this.jTextFieldList.get(7));
        this.jPanelList.get(10).add(this.jTextFieldList.get(8));
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
    
}
