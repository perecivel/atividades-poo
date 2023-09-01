package Projeto;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome;
    private String registro;
    private String usuario;
    
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
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BasePessoa(int codigo, String nome, String registro, String usuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.registro = registro;
        this.usuario = usuario;
    }
}
