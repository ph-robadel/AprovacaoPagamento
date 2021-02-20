package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class DiretorFinanceiro extends Gestor{
    
    public DiretorFinanceiro(String nome, float limite) {
        super(nome, limite, "Financeiro");
    }

    @Override
    public Gestor getGestorSuperior() {
        return null;
    }
    
}
