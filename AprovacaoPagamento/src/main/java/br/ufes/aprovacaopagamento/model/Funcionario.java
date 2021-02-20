package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private Gestor gerenteResponsavel;

    public Funcionario(String nome, String cargo, Gestor gerenteResponsavel) {
        this.nome = nome;
        this.cargo = cargo;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Gestor getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Gestor gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    
    
    
    
}
