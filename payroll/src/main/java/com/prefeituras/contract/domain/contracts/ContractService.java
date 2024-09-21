package com.prefeituras.contract.domain.contracts;

import com.prefeituras.contract.domain.contracts.request.ContractRequest;
import com.prefeituras.contract.domain.contracts.response.ContractResponse;

import java.util.List;
import java.util.Map;

public interface ContractService {
    List<Map<String, Object>> findContractData(ContractRequest request);

    List<Map<String, Object>> findContractDataBySupplierTaxName(ContractRequest request);

    List<Map<String, Object>> findContractDataBySupplierTaxId(ContractRequest request);
}
