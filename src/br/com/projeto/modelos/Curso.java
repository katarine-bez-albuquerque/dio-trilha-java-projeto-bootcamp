package br.com.projeto.modelos;

/**
 *
 * @author Katarine Albuquerque
 */
public class Curso extends Treinamento implements CalculaPonto{
    private Integer CargaHoraria;
    private Bootcamp bootcamp;
        
    public Curso() {
    }

    public Curso(Integer CargaHoraria, Bootcamp bootcamp, String titulo, String descricao) {
        super(titulo, descricao);
        this.CargaHoraria = CargaHoraria;
        this.bootcamp = bootcamp;
    }
    
    public Integer getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(Integer CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }
    
    @Override
    public int valorDoPonto(int valor) {
        return valor;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo)
                .append("( ")
                .append(this.CargaHoraria)
                .append("h )");
        return sb.toString();
    }    
}