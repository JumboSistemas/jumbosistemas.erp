/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 T2Ti.COM
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: t2ti.com@gmail.com
*
* @author Claudio de Barros (T2Ti.com)
* @version 2.0
*/
package com.com.jumbo.nfe.java;

import adm.com.jumbo.cadastros.java.ClienteVO;
import adm.com.jumbo.cadastros.java.EmpresaVO;
import adm.com.jumbo.cadastros.java.FornecedorVO;
import com.com.jumbo.tributacao.java.TributOperacaoFiscalVO;
import com.com.jumbo.vendas.java.VendaCabecalhoVO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.openswing.swing.message.receive.java.ValueObjectImpl;

/**
 *
 * @author vovo
 */
@Entity
@Table(name = "NFE_CABECALHO")
public class NfeCabecalhoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "UF_EMITENTE")
    private Integer ufEmitente;
    @Column(name = "CODIGO_NUMERICO")
    private String codigoNumerico;
    @Column(name = "NATUREZA_OPERACAO")
    private String naturezaOperacao;
    @Column(name = "INDICADOR_FORMA_PAGAMENTO")
    private Integer indicadorFormaPagamento;
    @Column(name = "CODIGO_MODELO")
    private String codigoModelo;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "NUMERO")
    private String numero;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA_EMISSAO")
    private Date dataHoraEmissao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA_ENTRADA_SAIDA")
    private Date dataHoraEntradaSaida;
    @Column(name = "TIPO_OPERACAO")
    private Integer tipoOperacao;
    @Column(name = "LOCAL_DESTINO")
    private Integer localDestino;
    @Column(name = "CODIGO_MUNICIPIO")
    private Integer codigoMunicipio;
    @Column(name = "FORMATO_IMPRESSAO_DANFE")
    private Integer formatoImpressaoDanfe;
    @Column(name = "TIPO_EMISSAO")
    private Integer tipoEmissao;
    @Column(name = "CHAVE_ACESSO")
    private String chaveAcesso;
    @Column(name = "DIGITO_CHAVE_ACESSO")
    private String digitoChaveAcesso;
    @Column(name = "AMBIENTE")
    private Integer ambiente;
    @Column(name = "FINALIDADE_EMISSAO")
    private Integer finalidadeEmissao;
    @Column(name = "CONSUMIDOR_OPERACAO")
    private Integer consumidorOperacao;
    @Column(name = "CONSUMIDOR_PRESENCA")
    private Integer consumidorPresenca;
    @Column(name = "PROCESSO_EMISSAO")
    private Integer processoEmissao;
    @Column(name = "VERSAO_PROCESSO_EMISSAO")
    private String versaoProcessoEmissao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_ENTRADA_CONTINGENCIA")
    private Date dataEntradaContingencia;
    @Column(name = "JUSTIFICATIVA_CONTINGENCIA")
    private String justificativaContingencia;
    @Column(name = "BASE_CALCULO_ICMS")
    private BigDecimal baseCalculoIcms;
    @Column(name = "VALOR_ICMS")
    private BigDecimal valorIcms;
    @Column(name = "VALOR_ICMS_DESONERADO")
    private BigDecimal valorIcmsDesonerado;
    @Column(name = "BASE_CALCULO_ICMS_ST")
    private BigDecimal baseCalculoIcmsSt;
    @Column(name = "VALOR_ICMS_ST")
    private BigDecimal valorIcmsSt;
    @Column(name = "VALOR_TOTAL_PRODUTOS")
    private BigDecimal valorTotalProdutos;
    @Column(name = "VALOR_FRETE")
    private BigDecimal valorFrete;
    @Column(name = "VALOR_SEGURO")
    private BigDecimal valorSeguro;
    @Column(name = "VALOR_DESCONTO")
    private BigDecimal valorDesconto;
    @Column(name = "VALOR_IMPOSTO_IMPORTACAO")
    private BigDecimal valorImpostoImportacao;
    @Column(name = "VALOR_IPI")
    private BigDecimal valorIpi;
    @Column(name = "VALOR_PIS")
    private BigDecimal valorPis;
    @Column(name = "VALOR_COFINS")
    private BigDecimal valorCofins;
    @Column(name = "VALOR_DESPESAS_ACESSORIAS")
    private BigDecimal valorDespesasAcessorias;
    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;
    @Column(name = "VALOR_SERVICOS")
    private BigDecimal valorServicos;
    @Column(name = "BASE_CALCULO_ISSQN")
    private BigDecimal baseCalculoIssqn;
    @Column(name = "VALOR_ISSQN")
    private BigDecimal valorIssqn;
    @Column(name = "VALOR_PIS_ISSQN")
    private BigDecimal valorPisIssqn;
    @Column(name = "VALOR_COFINS_ISSQN")
    private BigDecimal valorCofinsIssqn;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PRESTACAO_SERVICO")
    private Date dataPrestacaoServico;
    @Column(name = "VALOR_DEDUCAO_ISSQN")
    private BigDecimal valorDeducaoIssqn;
    @Column(name = "OUTRAS_RETENCOES_ISSQN")
    private BigDecimal outrasRetencoesIssqn;
    @Column(name = "DESCONTO_INCONDICIONADO_ISSQN")
    private BigDecimal descontoIncondicionadoIssqn;
    @Column(name = "DESCONTO_CONDICIONADO_ISSQN")
    private BigDecimal descontoCondicionadoIssqn;
    @Column(name = "TOTAL_RETENCAO_ISSQN")
    private BigDecimal totalRetencaoIssqn;
    @Column(name = "REGIME_ESPECIAL_TRIBUTACAO")
    private Integer regimeEspecialTributacao;
    @Column(name = "VALOR_RETIDO_PIS")
    private BigDecimal valorRetidoPis;
    @Column(name = "VALOR_RETIDO_COFINS")
    private BigDecimal valorRetidoCofins;
    @Column(name = "VALOR_RETIDO_CSLL")
    private BigDecimal valorRetidoCsll;
    @Column(name = "BASE_CALCULO_IRRF")
    private BigDecimal baseCalculoIrrf;
    @Column(name = "VALOR_RETIDO_IRRF")
    private BigDecimal valorRetidoIrrf;
    @Column(name = "BASE_CALCULO_PREVIDENCIA")
    private BigDecimal baseCalculoPrevidencia;
    @Column(name = "VALOR_RETIDO_PREVIDENCIA")
    private BigDecimal valorRetidoPrevidencia;
    @Column(name = "COMEX_UF_EMBARQUE")
    private String comexUfEmbarque;
    @Column(name = "COMEX_LOCAL_EMBARQUE")
    private String comexLocalEmbarque;
    @Column(name = "COMEX_LOCAL_DESPACHO")
    private String comexLocalDespacho;
    @Column(name = "COMPRA_NOTA_EMPENHO")
    private String compraNotaEmpenho;
    @Column(name = "COMPRA_PEDIDO")
    private String compraPedido;
    @Column(name = "COMPRA_CONTRATO")
    private String compraContrato;
    @Column(name = "INFORMACOES_ADD_FISCO")
    private String informacoesAddFisco;
    @Column(name = "INFORMACOES_ADD_CONTRIBUINTE")
    private String informacoesAddContribuinte;
    @Column(name = "STATUS_NOTA")
    private Integer statusNota;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
    @ManyToOne
    private ClienteVO cliente;
    @JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID")
    @ManyToOne
    private FornecedorVO fornecedor;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private EmpresaVO empresa;
    @JoinColumn(name = "ID_VENDA_CABECALHO", referencedColumnName = "ID")
    @ManyToOne
    private VendaCabecalhoVO vendaCabecalho;
    @JoinColumn(name = "ID_TRIBUT_OPERACAO_FISCAL", referencedColumnName = "ID")
    @ManyToOne
    private TributOperacaoFiscalVO tributOperacaoFiscal;
    @OneToOne(mappedBy = "nfeCabecalho", cascade = CascadeType.ALL)
    private NfeDestinatarioVO destinatario;
    @OneToOne(mappedBy = "nfeCabecalho", cascade = CascadeType.ALL)
    private NfeLocalEntregaVO localEntrega;
    @OneToOne(mappedBy = "nfeCabecalho", cascade = CascadeType.ALL)
    private NfeLocalRetiradaVO localRetirada;
    @OneToOne(mappedBy = "nfeCabecalho", cascade = CascadeType.ALL)
    private NfeTransporteVO transporte;
    @OneToOne(mappedBy = "nfeCabecalho", cascade = CascadeType.ALL)
    private NfeFaturaVO fatura;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeDetalheVO> listaNfeDetalhe;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeCupomFiscalReferenciadoVO> listaCupomFiscalReferenciado;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeDuplicataVO> listaDuplicata;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeReferenciadaVO> listaNfeReferenciada;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeNfReferenciadaVO> listaNfReferenciada;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeCteReferenciadoVO> listaCteReferenciado;
    @OneToMany(mappedBy="nfeCabecalho", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeProdRuralReferenciadaVO> listaProdRuralReferenciada;

    public NfeCabecalhoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUfEmitente() {
        return ufEmitente;
    }

    public void setUfEmitente(Integer ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public Integer getIndicadorFormaPagamento() {
        return indicadorFormaPagamento;
    }

    public void setIndicadorFormaPagamento(Integer indicadorFormaPagamento) {
        this.indicadorFormaPagamento = indicadorFormaPagamento;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(Date dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public Date getDataHoraEntradaSaida() {
        return dataHoraEntradaSaida;
    }

    public void setDataHoraEntradaSaida(Date dataHoraEntradaSaida) {
        this.dataHoraEntradaSaida = dataHoraEntradaSaida;
    }

    public Integer getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(Integer tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Integer getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(Integer localDestino) {
        this.localDestino = localDestino;
    }

    public Integer getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(Integer codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public Integer getFormatoImpressaoDanfe() {
        return formatoImpressaoDanfe;
    }

    public void setFormatoImpressaoDanfe(Integer formatoImpressaoDanfe) {
        this.formatoImpressaoDanfe = formatoImpressaoDanfe;
    }

    public Integer getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getDigitoChaveAcesso() {
        return digitoChaveAcesso;
    }

    public void setDigitoChaveAcesso(String digitoChaveAcesso) {
        this.digitoChaveAcesso = digitoChaveAcesso;
    }

    public Integer getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Integer ambiente) {
        this.ambiente = ambiente;
    }

    public Integer getFinalidadeEmissao() {
        return finalidadeEmissao;
    }

    public void setFinalidadeEmissao(Integer finalidadeEmissao) {
        this.finalidadeEmissao = finalidadeEmissao;
    }

    public Integer getConsumidorOperacao() {
        return consumidorOperacao;
    }

    public void setConsumidorOperacao(Integer consumidorOperacao) {
        this.consumidorOperacao = consumidorOperacao;
    }

    public Integer getConsumidorPresenca() {
        return consumidorPresenca;
    }

    public void setConsumidorPresenca(Integer consumidorPresenca) {
        this.consumidorPresenca = consumidorPresenca;
    }

    public Integer getProcessoEmissao() {
        return processoEmissao;
    }

    public void setProcessoEmissao(Integer processoEmissao) {
        this.processoEmissao = processoEmissao;
    }

    public String getVersaoProcessoEmissao() {
        return versaoProcessoEmissao;
    }

    public void setVersaoProcessoEmissao(String versaoProcessoEmissao) {
        this.versaoProcessoEmissao = versaoProcessoEmissao;
    }

    public Date getDataEntradaContingencia() {
        return dataEntradaContingencia;
    }

    public void setDataEntradaContingencia(Date dataEntradaContingencia) {
        this.dataEntradaContingencia = dataEntradaContingencia;
    }

    public String getJustificativaContingencia() {
        return justificativaContingencia;
    }

    public void setJustificativaContingencia(String justificativaContingencia) {
        this.justificativaContingencia = justificativaContingencia;
    }

    public BigDecimal getBaseCalculoIcms() {
        return baseCalculoIcms;
    }

    public void setBaseCalculoIcms(BigDecimal baseCalculoIcms) {
        this.baseCalculoIcms = baseCalculoIcms;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public BigDecimal getValorIcmsDesonerado() {
        return valorIcmsDesonerado;
    }

    public void setValorIcmsDesonerado(BigDecimal valorIcmsDesonerado) {
        this.valorIcmsDesonerado = valorIcmsDesonerado;
    }

    public BigDecimal getBaseCalculoIcmsSt() {
        return baseCalculoIcmsSt;
    }

    public void setBaseCalculoIcmsSt(BigDecimal baseCalculoIcmsSt) {
        this.baseCalculoIcmsSt = baseCalculoIcmsSt;
    }

    public BigDecimal getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public BigDecimal getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(BigDecimal valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorImpostoImportacao() {
        return valorImpostoImportacao;
    }

    public void setValorImpostoImportacao(BigDecimal valorImpostoImportacao) {
        this.valorImpostoImportacao = valorImpostoImportacao;
    }

    public BigDecimal getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(BigDecimal valorIpi) {
        this.valorIpi = valorIpi;
    }

    public BigDecimal getValorPis() {
        return valorPis;
    }

    public void setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
    }

    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
    }

    public BigDecimal getValorDespesasAcessorias() {
        return valorDespesasAcessorias;
    }

    public void setValorDespesasAcessorias(BigDecimal valorDespesasAcessorias) {
        this.valorDespesasAcessorias = valorDespesasAcessorias;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorServicos() {
        return valorServicos;
    }

    public void setValorServicos(BigDecimal valorServicos) {
        this.valorServicos = valorServicos;
    }

    public BigDecimal getBaseCalculoIssqn() {
        return baseCalculoIssqn;
    }

    public void setBaseCalculoIssqn(BigDecimal baseCalculoIssqn) {
        this.baseCalculoIssqn = baseCalculoIssqn;
    }

    public BigDecimal getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(BigDecimal valorIssqn) {
        this.valorIssqn = valorIssqn;
    }

    public BigDecimal getValorPisIssqn() {
        return valorPisIssqn;
    }

    public void setValorPisIssqn(BigDecimal valorPisIssqn) {
        this.valorPisIssqn = valorPisIssqn;
    }

    public BigDecimal getValorCofinsIssqn() {
        return valorCofinsIssqn;
    }

    public void setValorCofinsIssqn(BigDecimal valorCofinsIssqn) {
        this.valorCofinsIssqn = valorCofinsIssqn;
    }

    public Date getDataPrestacaoServico() {
        return dataPrestacaoServico;
    }

    public void setDataPrestacaoServico(Date dataPrestacaoServico) {
        this.dataPrestacaoServico = dataPrestacaoServico;
    }

    public BigDecimal getValorDeducaoIssqn() {
        return valorDeducaoIssqn;
    }

    public void setValorDeducaoIssqn(BigDecimal valorDeducaoIssqn) {
        this.valorDeducaoIssqn = valorDeducaoIssqn;
    }

    public BigDecimal getOutrasRetencoesIssqn() {
        return outrasRetencoesIssqn;
    }

    public void setOutrasRetencoesIssqn(BigDecimal outrasRetencoesIssqn) {
        this.outrasRetencoesIssqn = outrasRetencoesIssqn;
    }

    public BigDecimal getDescontoIncondicionadoIssqn() {
        return descontoIncondicionadoIssqn;
    }

    public void setDescontoIncondicionadoIssqn(BigDecimal descontoIncondicionadoIssqn) {
        this.descontoIncondicionadoIssqn = descontoIncondicionadoIssqn;
    }

    public BigDecimal getDescontoCondicionadoIssqn() {
        return descontoCondicionadoIssqn;
    }

    public void setDescontoCondicionadoIssqn(BigDecimal descontoCondicionadoIssqn) {
        this.descontoCondicionadoIssqn = descontoCondicionadoIssqn;
    }

    public BigDecimal getTotalRetencaoIssqn() {
        return totalRetencaoIssqn;
    }

    public void setTotalRetencaoIssqn(BigDecimal totalRetencaoIssqn) {
        this.totalRetencaoIssqn = totalRetencaoIssqn;
    }

    public Integer getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    public void setRegimeEspecialTributacao(Integer regimeEspecialTributacao) {
        this.regimeEspecialTributacao = regimeEspecialTributacao;
    }

    public BigDecimal getValorRetidoPis() {
        return valorRetidoPis;
    }

    public void setValorRetidoPis(BigDecimal valorRetidoPis) {
        this.valorRetidoPis = valorRetidoPis;
    }

    public BigDecimal getValorRetidoCofins() {
        return valorRetidoCofins;
    }

    public void setValorRetidoCofins(BigDecimal valorRetidoCofins) {
        this.valorRetidoCofins = valorRetidoCofins;
    }

    public BigDecimal getValorRetidoCsll() {
        return valorRetidoCsll;
    }

    public void setValorRetidoCsll(BigDecimal valorRetidoCsll) {
        this.valorRetidoCsll = valorRetidoCsll;
    }

    public BigDecimal getBaseCalculoIrrf() {
        return baseCalculoIrrf;
    }

    public void setBaseCalculoIrrf(BigDecimal baseCalculoIrrf) {
        this.baseCalculoIrrf = baseCalculoIrrf;
    }

    public BigDecimal getValorRetidoIrrf() {
        return valorRetidoIrrf;
    }

    public void setValorRetidoIrrf(BigDecimal valorRetidoIrrf) {
        this.valorRetidoIrrf = valorRetidoIrrf;
    }

    public BigDecimal getBaseCalculoPrevidencia() {
        return baseCalculoPrevidencia;
    }

    public void setBaseCalculoPrevidencia(BigDecimal baseCalculoPrevidencia) {
        this.baseCalculoPrevidencia = baseCalculoPrevidencia;
    }

    public BigDecimal getValorRetidoPrevidencia() {
        return valorRetidoPrevidencia;
    }

    public void setValorRetidoPrevidencia(BigDecimal valorRetidoPrevidencia) {
        this.valorRetidoPrevidencia = valorRetidoPrevidencia;
    }

    public String getComexUfEmbarque() {
        return comexUfEmbarque;
    }

    public void setComexUfEmbarque(String comexUfEmbarque) {
        this.comexUfEmbarque = comexUfEmbarque;
    }

    public String getComexLocalEmbarque() {
        return comexLocalEmbarque;
    }

    public void setComexLocalEmbarque(String comexLocalEmbarque) {
        this.comexLocalEmbarque = comexLocalEmbarque;
    }

    public String getComexLocalDespacho() {
        return comexLocalDespacho;
    }

    public void setComexLocalDespacho(String comexLocalDespacho) {
        this.comexLocalDespacho = comexLocalDespacho;
    }

    public String getCompraNotaEmpenho() {
        return compraNotaEmpenho;
    }

    public void setCompraNotaEmpenho(String compraNotaEmpenho) {
        this.compraNotaEmpenho = compraNotaEmpenho;
    }

    public String getCompraPedido() {
        return compraPedido;
    }

    public void setCompraPedido(String compraPedido) {
        this.compraPedido = compraPedido;
    }

    public String getCompraContrato() {
        return compraContrato;
    }

    public void setCompraContrato(String compraContrato) {
        this.compraContrato = compraContrato;
    }

    public String getInformacoesAddFisco() {
        return informacoesAddFisco;
    }

    public void setInformacoesAddFisco(String informacoesAddFisco) {
        this.informacoesAddFisco = informacoesAddFisco;
    }

    public String getInformacoesAddContribuinte() {
        return informacoesAddContribuinte;
    }

    public void setInformacoesAddContribuinte(String informacoesAddContribuinte) {
        this.informacoesAddContribuinte = informacoesAddContribuinte;
    }

    public Integer getStatusNota() {
        return statusNota;
    }

    public void setStatusNota(Integer statusNota) {
        this.statusNota = statusNota;
    }

    public ClienteVO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
    }

    public FornecedorVO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorVO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public EmpresaVO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaVO empresa) {
        this.empresa = empresa;
    }

    public VendaCabecalhoVO getVendaCabecalho() {
        return vendaCabecalho;
    }

    public void setVendaCabecalho(VendaCabecalhoVO vendaCabecalho) {
        this.vendaCabecalho = vendaCabecalho;
    }

    public TributOperacaoFiscalVO getTributOperacaoFiscal() {
        return tributOperacaoFiscal;
    }

    public void setTributOperacaoFiscal(TributOperacaoFiscalVO tributOperacaoFiscal) {
        this.tributOperacaoFiscal = tributOperacaoFiscal;
    }

    public NfeDestinatarioVO getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(NfeDestinatarioVO destinatario) {
        this.destinatario = destinatario;
    }

    public NfeLocalEntregaVO getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(NfeLocalEntregaVO localEntrega) {
        this.localEntrega = localEntrega;
    }

    public NfeLocalRetiradaVO getLocalRetirada() {
        return localRetirada;
    }

    public void setLocalRetirada(NfeLocalRetiradaVO localRetirada) {
        this.localRetirada = localRetirada;
    }

    public NfeTransporteVO getTransporte() {
        return transporte;
    }

    public void setTransporte(NfeTransporteVO transporte) {
        this.transporte = transporte;
    }

    public NfeFaturaVO getFatura() {
        return fatura;
    }

    public void setFatura(NfeFaturaVO fatura) {
        this.fatura = fatura;
    }

    public List<NfeDetalheVO> getListaNfeDetalhe() {
        return listaNfeDetalhe;
    }

    public void setListaNfeDetalhe(List<NfeDetalheVO> listaNfeDetalhe) {
        this.listaNfeDetalhe = listaNfeDetalhe;
    }

    public List<NfeCupomFiscalReferenciadoVO> getListaCupomFiscalReferenciado() {
        return listaCupomFiscalReferenciado;
    }

    public void setListaCupomFiscalReferenciado(List<NfeCupomFiscalReferenciadoVO> listaCupomFiscalReferenciado) {
        this.listaCupomFiscalReferenciado = listaCupomFiscalReferenciado;
    }

    public List<NfeDuplicataVO> getListaDuplicata() {
        return listaDuplicata;
    }

    public void setListaDuplicata(List<NfeDuplicataVO> listaDuplicata) {
        this.listaDuplicata = listaDuplicata;
    }

    public List<NfeReferenciadaVO> getListaNfeReferenciada() {
        return listaNfeReferenciada;
    }

    public void setListaNfeReferenciada(List<NfeReferenciadaVO> listaNfeReferenciada) {
        this.listaNfeReferenciada = listaNfeReferenciada;
    }
    
    public List<NfeNfReferenciadaVO> getListaNfReferenciada() {
        return listaNfReferenciada;
    }

    public void setListaNfReferenciada(List<NfeNfReferenciadaVO> listaNfReferenciada) {
        this.listaNfReferenciada = listaNfReferenciada;
    }

    public List<NfeCteReferenciadoVO> getListaCteReferenciado() {
        return listaCteReferenciado;
    }

    public void setListaCteReferenciado(List<NfeCteReferenciadoVO> listaCteReferenciado) {
        this.listaCteReferenciado = listaCteReferenciado;
    }

    public List<NfeProdRuralReferenciadaVO> getListaProdRuralReferenciada() {
        return listaProdRuralReferenciada;
    }

    public void setListaProdRuralReferenciada(List<NfeProdRuralReferenciadaVO> listaProdRuralReferenciada) {
        this.listaProdRuralReferenciada = listaProdRuralReferenciada;
    }

    @Override
    public String toString() {
        return "com.com.jumbo.nfe.java.NfeCabecalhoVO[id=" + id + "]";
    }
    
}
