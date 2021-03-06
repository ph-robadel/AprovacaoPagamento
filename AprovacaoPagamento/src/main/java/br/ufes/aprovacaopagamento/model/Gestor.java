package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public abstract class Gestor {
    protected String nome;

    public Gestor(String nome) {
        this.nome = nome;
    }
    
    public abstract float getLimite();
    
    public abstract Gestor getGestorSuperior();
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

