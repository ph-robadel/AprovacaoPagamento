package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class DiretorGeral extends Gestor{
    private DiretorFinanceiro gestorSuperior;
    
    public DiretorGeral(String nome, float limite, String departamento) {
        super(nome, limite, departamento);
    }

    public DiretorGeral(String nome, float limite, String departamento, DiretorFinanceiro gestorSuperior) {
        super(nome, limite, departamento);
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(DiretorFinanceiro gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }
    
    
    
}
