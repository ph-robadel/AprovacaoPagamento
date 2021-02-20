package br.ufes.aprovacaopagamento.principal;

import br.ufes.aprovacaopagamento.business.PagamentoBusiness;
import br.ufes.aprovacaopagamento.model.DiretorFinanceiro;
import br.ufes.aprovacaopagamento.model.DiretorGeral;
import br.ufes.aprovacaopagamento.model.Funcionario;
import br.ufes.aprovacaopagamento.model.GerenteFuncionario;
import br.ufes.aprovacaopagamento.model.GerenteGeral;
import br.ufes.aprovacaopagamento.model.SolicitacaoPagamento;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class Principal {
    public static void main(String[] args){
        GerenteFuncionario gerenteFuncionario = new GerenteFuncionario("Pedro", "RH");
        Funcionario funcionario = new Funcionario("Lucas", "Recrutador", gerenteFuncionario);
        GerenteGeral gerenteGeral = new GerenteGeral("Henrique");
        DiretorFinanceiro diretorFinanceiro = new DiretorFinanceiro("Robadel");
        DiretorGeral diretorGeral = new DiretorGeral("Silva");
        
        PagamentoBusiness pagamentoBusiness = new PagamentoBusiness();
        SolicitacaoPagamento solicitacaoPagamento;
        
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 375.99f);
        System.out.println(solicitacaoPagamento);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 603.50f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        
        
        gerenteFuncionario.setGestorSuperior(gerenteGeral);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 603.50f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 1675.25f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        
        
        gerenteGeral.setGestorSuperior(diretorFinanceiro);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 1675.25f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 13897.85f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        
        
        diretorFinanceiro.setGestorSuperior(diretorGeral);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 13897.85f);
        System.out.println("\n\n"+solicitacaoPagamento);
        
        solicitacaoPagamento = pagamentoBusiness.solicitar(funcionario, 25450.85f);
        System.out.println("\n\n"+solicitacaoPagamento);
    }
}
