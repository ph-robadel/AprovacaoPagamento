package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class GerenteGeral extends Gestor{
    private DiretorGeral gestorSuperior;
    
    public GerenteGeral(String nome, float limite, String departamento) {
        super(nome, limite, departamento);
    }

    public GerenteGeral(String nome, float limite, String departamento, DiretorGeral gestorSuperior) {
        super(nome, limite, departamento);
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(DiretorGeral gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }
    
    
}
