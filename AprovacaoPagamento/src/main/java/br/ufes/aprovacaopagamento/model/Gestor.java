package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public abstract class Gestor {
    protected String nome;
    protected float limite;
    protected String departamento;

    public String getNome() {
        return nome;
    }

    public Gestor(String nome, float limite, String departamento) {
        this.nome = nome;
        this.limite = limite;
        this.departamento = departamento;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public abstract Gestor getGestorSuperior();
}

