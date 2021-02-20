package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class DiretorGeral extends Gestor{
    private final float LIMITE = 15000f;
    
    public DiretorGeral(String nome) {
        super(nome);
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return null;
    }

    @Override
    public float getLimite() {
        return this.LIMITE;
    }
    
    
    
}
