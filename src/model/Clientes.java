package model;

/**
 *
 * @author Lucas
 */
public class Clientes {

    private int id;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String cpf;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * seta o valor de endereco
     *
     * @param pEndereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * return endereco
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * seta o valor de bairro
     *
     * @param pBairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * return bairro
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * seta o valor de cidade
     *
     * @param pCidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * return cidade
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * seta o valor de estado
     *
     * @param pEstado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * return estado
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * seta o valor de cep
     *
     * @param pCep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * return cep
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * seta o valor de telefone
     *
     * @param pTelefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * return telefone
     */
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }        
    
    public String getCpf()
    {
        return this.cpf;
    }

}
