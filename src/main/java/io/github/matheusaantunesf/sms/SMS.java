/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.matheusaantunesf.sms;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class SMS {

    public static void main(String[] args) {
        Mensageiro mensageiro = new MensageiroReal();
        
        Mensageiro proxy = new ProxyMensageiro(mensageiro, "1234");
        Mensageiro mensageiroFinal = new HorarioDecorator(proxy);
        
        mensageiroFinal.enviar("Teste de envio de mensagem", "1234");
    }
}
