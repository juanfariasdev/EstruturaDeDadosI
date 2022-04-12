/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanpablofarias.estruturadedados;

/**
 *
 * @author juanp
 */
public class Pallet {
    private String produto;
    private int qtd;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    @Override
    public String toString(){
        return getProduto()+ " : " + getQtd();
    }
    
}// fim classe
