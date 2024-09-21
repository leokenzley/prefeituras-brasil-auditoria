package com.prefeituras.contract.domain.contracts.request;

import lombok.Data;

import java.util.List;

@Data
public class ContractRequest {
    private List<String> palavrasChave;
    private Contratos contratos;
}


