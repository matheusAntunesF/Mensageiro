/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.sms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class HorarioDecorator 
    extends Decorator{
    public HorarioDecorator(){
        
    }
    public HorarioDecorator(Mensageiro mensageiro){
        super(mensageiro);
    }
    
    @Override
    public void enviar(String mensagem, String senha){
        String horario = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/dyyyy HH:mm:ss"));
        String novaMensagem = "[" + horario + "]" + mensagem;
        
        super.enviar(novaMensagem, senha);
    }
}
