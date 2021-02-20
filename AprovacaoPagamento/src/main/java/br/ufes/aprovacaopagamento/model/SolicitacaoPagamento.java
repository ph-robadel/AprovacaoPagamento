package br.ufes.aprovacaopagamento.model;

import java.time.LocalDate;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class SolicitacaoPagamento{
    private Funcionario funcionario;
    private Gestor gestor;
    private float valor;
    private String status;
    private LocalDate dataSolicitacao;

    public SolicitacaoPagamento(Funcionario funcionario, Gestor gestor, float valor) {
        this.funcionario = funcionario;
        this.gestor = gestor;
        this.valor = valor;
        this.status = "Aguardando aprovação";
        this.dataSolicitacao = LocalDate.now();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public float getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }
    
    public float getLimiteGestor(){
        return this.gestor.getLimite();
    }
    
    public Gestor getGestorSuperior(){
        return this.gestor.getGestorSuperior();
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
