package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class DiretorFinanceiro extends Gestor{
    private DiretorGeral gestorSuperior;
    private final float LIMITE = 5000f;
    
    public DiretorFinanceiro(String nome, String departamento) {
        super(nome);
    }

    public DiretorFinanceiro(String nome, DiretorGeral gestorSuperior) {
        super(nome);
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(DiretorGeral gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }

    @Override
    public float getLimite() {
        return this.LIMITE;
    }
    
}
