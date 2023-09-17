package ProjetoVeiculo;

public class Onibus extends BaseVeiculoTerrestre{
    private int qtdeOcupantes;

    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }

    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            Double pesoLiquido, Double pesoTotal, String fabricante, Double protencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, int assentos,
            int portas, String placa, int eixos, String codigoRenavam, int qtdeOcupantes) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, fabricante,
                protencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, rodas, assentos, portas,
                placa, eixos, codigoRenavam);
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
}
