package br.ufes.aprovacaopagamento.model;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class GerenteFuncionario extends Gestor{
    private GerenteGeral gestorSuperior;
    private String departamento;
    private final float LIMITE = 500f;
    
    public GerenteFuncionario(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    public GerenteFuncionario(String nome, String departamento, GerenteGeral gestorSuperior) {
        super(nome);
        this.departamento = departamento;
        this.gestorSuperior = gestorSuperior;
    }
    
    @Override
    public Gestor getGestorSuperior() {
        return gestorSuperior;
    }

    public void setGestorSuperior(GerenteGeral gestorSuperior) {
        this.gestorSuperior = gestorSuperior;
    }

    @Override
    public float getLimite() {
        return this.LIMITE;
    }
    
    
}
