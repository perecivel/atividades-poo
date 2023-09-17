package ProjetoVeiculo;

public class Caminhao extends BaseVeiculoTerrestre{
    private int comprimento;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            Double pesoLiquido, Double pesoTotal, String fabricante, Double protencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, int assentos,
            int portas, String placa, int eixos, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, fabricante,
                protencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, rodas, assentos, portas,
                placa, eixos, codigoRenavam);
    }


}
