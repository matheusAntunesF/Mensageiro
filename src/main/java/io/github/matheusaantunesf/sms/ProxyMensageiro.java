/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.sms;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class ProxyMensageiro
        implements Mensageiro {

    private Mensageiro mensageiroReal;
    private String senhaCorreta;

    public ProxyMensageiro() {
    }
    
    public ProxyMensageiro(Mensageiro mensageiroReal, String senha){
        this.mensageiroReal = mensageiroReal;
        this.senhaCorreta = senha;
    }
    
    @Override
    public void enviar(String mensagem, String senhaFornecida) {
        if(senhaCorreta.equals(senhaFornecida)){
            System.out.println("Senha correta. Acesso liberado.");
            mensageiroReal.enviar(mensagem, senhaFornecida);
        } else{
            System.out.println("Senha incorreta. Acesso negado.");
        }
    }
}
