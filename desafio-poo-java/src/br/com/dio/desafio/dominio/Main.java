package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
    Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso");
        curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());






    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);

}
} 
