package com.prefeituras.contract.domain.contracts.response;

import lombok.Data;

@Data
public class ContractResponse {
    private int id;
    private String label;
    private int orgao;
    private String orgaoNome;
    private int licitacaoId;
    private String valor;
    private String numero;
    private int ano;
    private String dataPublicacao;
    private String dataFirmatura;
    private String inicioVigencia;
    private String fimVigencia;
    private String fornecedorNome;
    private String fornecedorCpfCnpj;
    private Object coronavirus; // Pode ser substituído por um tipo mais específico se necessário
    private String objeto;
    private String fiscalContrato;
    private String situacao;
    private Object acrescimos; // Pode ser substituído por um tipo mais específico se necessário
    private Object decrescimos; // Pode ser substituído por um tipo mais específico se necessário
    private Object rescisoes; // Pode ser substituído por um tipo mais específico se necessário
    private String assunto;
    private String tipoAjuste;
    private String tipo;
    private String opcoes;
    private String parcelas;
    //private List<Object> anexos; // Pode ser substituído por um tipo mais específico se necessário
}
