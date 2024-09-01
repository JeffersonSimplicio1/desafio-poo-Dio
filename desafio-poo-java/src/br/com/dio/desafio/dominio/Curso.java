package br.com.dio.desafio.dominio;

public class Curso  extends Conteudos{
   private String titulo;
   private String descricao;
   private int cargaHoraria;


   public Curso() {
}
@Override
public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
}
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
}
    @Override
    public String toString() {
        return "Curso [titulo = " + getTitulo() + ", descrição = " + getDescricao() + ", cargaHoraria = " + cargaHoraria + "]";
    }
    

    


}
