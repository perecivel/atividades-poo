package ProjetoVeiculo;

public abstract class BaseVeiculoTerrestre extends BaseVeiculo{
    protected String placa;
    protected int eixos;
    protected String codigoRenavam;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    
    public BaseVeiculoTerrestre(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo,
            int anoFabricacao, Double pesoLiquido, Double pesoTotal, String fabricante, Double protencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int rodas, int assentos, int portas, String placa, int eixos, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, fabricante,
                protencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, rodas, assentos, portas);
        this.placa = placa;
        this.eixos = eixos;
        this.codigoRenavam = codigoRenavam;
    }
}
