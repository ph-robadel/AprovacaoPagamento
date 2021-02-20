package br.ufes.aprovacaopagamento.business;

import br.ufes.aprovacaopagamento.model.Funcionario;
import br.ufes.aprovacaopagamento.model.SolicitacaoPagamento;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class PagamentoBusiness {
    public SolicitacaoPagamento solicitar(Funcionario funcionario, float valor){
        return new SolicitacaoPagamento(funcionario, funcionario.getGerenteResponsavel(), valor);
    }
    
    public void processarSolicitacao(SolicitacaoPagamento solicitacao){
        while(true){
            if(solicitacao.getLimiteGestor() >= solicitacao.getValor()){
                aprovar(solicitacao);
                return;
            }

            var gestorSuperior = solicitacao.getGestorSuperior();

            if(gestorSuperior == null){
                reprovar(solicitacao);
                return;
            }
            solicitacao.setGestor(gestorSuperior);
        }
    }
    
    private void aprovar(SolicitacaoPagamento solicitacao){
        solicitacao.setStatus("Pagamento aprovado");
    }
    
    private void reprovar(SolicitacaoPagamento solicitacao){
        solicitacao.setStatus("Pagamento reprovado");
    }
    
    
}
