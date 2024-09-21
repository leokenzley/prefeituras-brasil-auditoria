package com.prefeituras.contract.domain.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContractDataRequest {
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
    @JsonProperty("fornecedor_nome")
    private String fornecedorNome;
    @JsonProperty("fornecedor_cpfcnpj")
    private String fornecedorCpfCnpj;
    private Object coronavirus;
    private String objeto;
    private String fiscalContrato;
    private String situacao;
    private Object acrescimos;
    private Object decrescimos;
    private Object rescisoes;
    private String assunto;
    private String tipoAjuste;
    private String tipo;
    private String opcoes;
    private String parcelas;
}
