/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author Lucas
 */
public class Animal {
    private String nome;
    private int comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    
    @Override
    public String toString() {
       String s = "Animal: " + nome;
       s += "\nComprimento: " + comprimento + " cm";
       s += "\nPatas: " + numPatas;
       s += "\nCor: " + cor;
       s += "\nAmbiente: " + ambiente;
       s += "\nVelociadade: " + velocidade + " m/s";
       return s;
    }
    
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    
    
    
    
    
}
