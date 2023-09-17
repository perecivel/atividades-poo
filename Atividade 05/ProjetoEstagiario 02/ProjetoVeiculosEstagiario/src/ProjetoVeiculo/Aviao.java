package ProjetoVeiculo;

public class Aviao extends BaseVeiculo {
    private int qtdeOcupantes;
    private int qtdeMotores;
    
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, int anoModelo, int anoFabricacao,
            Double pesoLiquido, Double pesoTotal, String fabricante, Double protencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, int assentos,
            int portas, int qtdeOcupantes, int qtdeMotores) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, fabricante,
                protencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, rodas, assentos, portas);
        this.qtdeOcupantes = qtdeOcupantes;
        this.qtdeMotores = qtdeMotores;
    }

}
