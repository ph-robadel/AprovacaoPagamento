package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class GerenteGeral extends Gestor{
    private DiretorFinanceiro gestorSuperior;
    private final float LIMITE = 1500f;
    
    public GerenteGeral(String nome) {
        super(nome);
    }

    public GerenteGeral(String nome, DiretorFinanceiro gestorSuperior) {
        super(nome);
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(DiretorFinanceiro gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }

    @Override
    public float getLimite() {
        return this.LIMITE;
    }
    
    
}
