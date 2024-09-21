package com.prefeituras.contract.domain.contracts.implementation;

import com.prefeituras.contract.domain.contracts.ContractDataRequest;
import com.prefeituras.contract.domain.contracts.ContractService;
import com.prefeituras.contract.domain.contracts.request.ContractRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContractServiceImpl implements ContractService {

    @Override
    public List<Map<String, Object>> findContractData(ContractRequest request) {
        if(request.getContratos().getDados().isEmpty())
            throw new RuntimeException("Contract data is required");

        List<Map<String, Object>> contratosEncontradosList = new ArrayList<>();
        for (ContractDataRequest contracts : request.getContratos().getDados()) {
            for (String palavra: request.getPalavrasChave()){
                if(contracts.getObjeto().toString().contains(palavra)){
                    contratosEncontradosList.add(toMap(contracts));
                }
            }
        }
        return contratosEncontradosList;
    }

    @Override
    public List<Map<String, Object>> findContractDataBySupplierTaxName(ContractRequest request) {
        if(request.getContratos().getDados().isEmpty())
            throw new RuntimeException("Contract data is required");

        List<Map<String, Object>> contratosEncontradosList = new ArrayList<>();
        for (ContractDataRequest contracts : request.getContratos().getDados()) {
            for (String palavra: request.getPalavrasChave()){
                if(Objects.nonNull(contracts.getFornecedorNome()) &&
                contracts.getFornecedorNome().toString().contains(palavra)){
                    contratosEncontradosList.add(toMap(contracts));
                }
            }
        }
        return contratosEncontradosList;
    }

    @Override
    public List<Map<String, Object>> findContractDataBySupplierTaxId(ContractRequest request) {
        if(request.getContratos().getDados().isEmpty())
            throw new RuntimeException("Contract data is required");

        List<Map<String, Object>> contratosEncontradosList = new ArrayList<>();
        for (ContractDataRequest contracts : request.getContratos().getDados()) {
            for (String palavra: request.getPalavrasChave()){
                if(Objects.nonNull(contracts.getFornecedorCpfCnpj()) &&
                        contracts.getFornecedorCpfCnpj().toString().contains(palavra)){
                    contratosEncontradosList.add(toMap(contracts));
                }
            }
        }
        return contratosEncontradosList;
    }

    private Map<String, Object> toMap(ContractDataRequest contracts){
        Map<String, Object> map = new HashMap<>();
        map.put("contractValue", contracts.getValor());
        map.put("contractYear", contracts.getAno());
        map.put("contractDescription", contracts.getObjeto());
        map.put("contractNumber", contracts.getNumero());
        map.put("contractLabel", contracts.getLabel());
        map.put("contractSituation", contracts.getSituacao());
        map.put("contractAdjustmentType", contracts.getTipoAjuste());
        map.put("contractSuplierName", contracts.getFornecedorNome());
        map.put("contractSuplierTaxId", contracts.getFornecedorCpfCnpj());
        return map;
    }
}
