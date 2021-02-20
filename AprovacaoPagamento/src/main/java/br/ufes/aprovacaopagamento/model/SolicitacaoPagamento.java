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
    private boolean aprovado;
    private LocalDate dataSolicitacao;

    public SolicitacaoPagamento(Funcionario funcionario, Gestor gestor, float valor) {
        this.funcionario = funcionario;
        this.gestor = gestor;
        this.valor = valor;
        this.aprovado = false;
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

    public boolean isAprovado() {
        return aprovado;
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

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario Solicitante: ").append(this.funcionario.getNome()).append(" - ").append(this.funcionario.getCargo()).append("\n");
        sb.append("Valor: R$ ").append(this.valor).append("\n");
        sb.append("Data da solicitação: ").append(this.dataSolicitacao).append("\n");
        
        if(isAprovado()){
            sb.append("Solicitação: Aprovada\n");
            sb.append("Aprovada pelo gestor : ").append(this.gestor).append("\n");
        }else{
            sb.append("Solicitação: Reprovada\n");
            sb.append("Reprovada pelo gestor : ").append(this.gestor).append("\n");
        }
        
        return sb.toString();
    }
    
    
}
