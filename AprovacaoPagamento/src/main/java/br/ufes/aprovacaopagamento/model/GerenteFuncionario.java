package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class GerenteFuncionario extends Gestor{
    private GerenteGeral gestorSuperior;
    
    public GerenteFuncionario(String nome, float limite, String departamento) {
        super(nome, limite, departamento);
    }

    public GerenteFuncionario(String nome, float limite, String departamento, GerenteGeral gestorSuperior) {
        super(nome, limite, departamento);
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(GerenteGeral gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }
    
    
}
