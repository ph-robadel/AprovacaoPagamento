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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNome()).append(" - ").append("Diretor Geral");
        return sb.toString();
    }
    
}
