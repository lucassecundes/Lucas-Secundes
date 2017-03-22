/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

import javax.swing.*;
        
public class TesteJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String retorno = JOptionPane.showInputDialog(null, "Digite seu nome");
        System.out.println(retorno);
        
        JOptionPane.showMessageDialog(null, "Bem Vindo " + retorno 
                , "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "ERRO "
                , "ERRO", JOptionPane.ERROR_MESSAGE);
        
       int opcaoSelecionada = JOptionPane.showConfirmDialog(null, "Deseja realmente sair", "Logout"
                ,JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if  (opcaoSelecionada==0){
            JOptionPane.showMessageDialog(null,"Logout efetuado "
                    + "com sucesso");
            
        }
        else  {
            JOptionPane.showMessageDialog(null,"Você cancelou o "
                    + "Logout");
        }
       
                
        
    }
    
}
