package com.prefeituras.contract.domain.contracts.request;

import com.prefeituras.contract.domain.contracts.ContractDataRequest;
import com.prefeituras.contract.domain.contracts.Contracts;
import lombok.Data;

import java.util.List;

@Data
public class Contratos   {
    private List<String> palavrasChave;
    private List<ContractDataRequest> dados;
    private String total;
    private Integer orgaoPrincipal;
    private Integer sgContratosOcultarAlertas;
}
