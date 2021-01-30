package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.OS;
import br.edu.iftm.os.repository.OsRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author Trabalho luiz fernando
 */
public class OsLogic implements CrudLogic<OS> {

    @Inject
    private OsRepository repository;

    @Override
    @Transacao
    public OS salvar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        if (entidade.getCodigoOS() == null || entidade.getCodigoOS().equals("")) {
            throw new ErroNegocioException("Código da OS  é obrigatório");
        }
        if (entidade.getDescricaoEquipamento() == null || entidade.getDescricaoEquipamento().equals("")) {
            throw new ErroNegocioException("Descrição do equipamento  é obrigatório");
        }
        if(entidade.getDataAbertura() == null){
            entidade.setDataAbertura(new Date());
        }
        return repository.salvar(entidade);
    }

    @Override
    @Transacao
    public void deletar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        repository.remover(entidade.getId());
    }

    @Override
    public OS buscarPorId(OS entidade) throws ErroNegocioException, ErroSistemaException {
        if (entidade == null || entidade.getId() == null) {
            throw new ErroNegocioException("Cliente não pode ser carregado.");
        }
        entidade = repository.buscarPorId(entidade.getId());
        return entidade;

    }

    @Override
    public List<OS> buscar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        List clientes = repository.listar();
        return clientes;
    }

}
