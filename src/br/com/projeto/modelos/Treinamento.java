package br.com.projeto.modelos;

/**
 *
 * @author Katarine Albuquerque
 */
public abstract class Treinamento {
    protected String titulo;
    protected String descricao;

    public Treinamento() {
    }

    public Treinamento(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}