/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Comp_Decomp.compressor;
import Comp_Decomp.decompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aashish Kumar Yadav
 */
public class AppFrame extends JFrame implements ActionListener {
    
    JButton CumpressButton;
    JButton DecomressButton;

    AppFrame(){
        
       this. setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       CumpressButton = new JButton("Select File To Compress");
       CumpressButton.setBounds(20, 100, 200, 30);
       CumpressButton.addActionListener(this);
       
       DecomressButton = new JButton("Select File To Decompress");
       DecomressButton.setBounds(250, 100, 200, 30);
       DecomressButton.addActionListener(this);
       
       this.add(CumpressButton);
       this.add(DecomressButton);
       
       this.setSize(1000, 500);
       this.getContentPane().setBackground(Color.red);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == CumpressButton){
            JFileChooser fileChooser = new JFileChooser();
            int respones =fileChooser.showSaveDialog(null);
            
            if(respones==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compressor.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        
         if(e.getSource() ==  DecomressButton){
              JFileChooser fileChooser = new JFileChooser();
            int respones =fileChooser.showSaveDialog(null);
            
            if(respones==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    decompressor.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
         }
    }

    
}
