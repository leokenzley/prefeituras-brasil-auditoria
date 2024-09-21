package com.prefeituras.contract.controller;

import com.prefeituras.contract.domain.contracts.ContractService;
import com.prefeituras.contract.domain.contracts.request.ContractRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/contracts/audit")
public class ContractAuditController {

    @Autowired
    private ContractService contractService;

    @PostMapping("/key-words")
    private ResponseEntity<List<Map<String, Object>>> findContractsByContractData(@RequestBody ContractRequest request){
        return ResponseEntity.ok(contractService.findContractData(request));
    }

    @PostMapping("/supplier-name")
    private ResponseEntity<List<Map<String, Object>>> findContractsByContractDataSupplierTaxname(@RequestBody ContractRequest request){
        return ResponseEntity.ok(contractService.findContractDataBySupplierTaxName(request));
    }

    @PostMapping("/supplier-taxid")
    private ResponseEntity<List<Map<String, Object>>> findContractsByContractDataSupplierTaxId(@RequestBody ContractRequest request){
        return ResponseEntity.ok(contractService.findContractDataBySupplierTaxId(request));
    }
}
