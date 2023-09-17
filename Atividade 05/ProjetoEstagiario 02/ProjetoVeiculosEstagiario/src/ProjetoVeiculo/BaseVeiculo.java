package ProjetoVeiculo;

public abstract class BaseVeiculo {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected int anoModelo;
    protected int anoFabricacao;
    protected Double pesoLiquido;
    protected Double pesoTotal;
    protected String fabricante;
    protected Double protencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected int rodas;
    protected int assentos;
    protected int portas;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public Double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public Double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public Double getProtencia() {
        return protencia;
    }
    public void setProtencia(Double protencia) {
        this.protencia = protencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public BaseVeiculo(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo,
            int anoFabricacao, Double pesoLiquido, Double pesoTotal, String fabricante, Double protencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int rodas, int assentos, int portas) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.fabricante = fabricante;
        this.protencia = protencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.rodas = rodas;
        this.assentos = assentos;
        this.portas = portas;
    }
}
