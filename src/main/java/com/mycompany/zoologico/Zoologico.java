/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoologico;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Zoologico {

    public static void main(String[] args) {
        
        //CAMELO
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setNumPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Deserto");
        camelo.setVelocidade(2);
        
        //TUBARAO
        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(250);
        tubarao.setCaracteristicas("Barbatanas, Caudas");
        tubarao.setCor("cinza");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidade(4.5);
        
        //URSO
        mamifero urso = new mamifero();
        urso.setNome("Urso");
        urso.setAlimento("Mel");
        urso.setNumPatas(4);
        urso.setComprimento(280);
        urso.setCor("Marrom");
        urso.setAmbiente("Terra");
        urso.setVelocidade(2.5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
                
      // System.out.println(tubarao); 
       //System.out.println(camelo); 
        //JOptionPane.showMessageDialog(null, urso);
        
        
        System.out.println("-----------------");
                for (Animal animal : animais) {
                    System.out.println(animal);
                    System.out.println("-----------------");
                }
    }

    
}
