/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.sms;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class MensageiroReal
    implements Mensageiro{

    @Override
    public void enviar(String mensagem, String senha) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
    
}
