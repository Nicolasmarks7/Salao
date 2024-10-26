public class Servico {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean verificaDescricao(String descricao){
        return descricao.length() >= 30;
    }

    public boolean verificaValorZero(float valor){
        return valor == 0.0f;
    }

    private String nome;
    private String descricao;
    private float valor;

}