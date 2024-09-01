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



    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamb Java");
    bootcamp.setDescricao("Descrição do bootcamp");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    
    System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
    devCamila.progredir();
    devCamila.progredir();
    devCamila.progredir();
    System.out.println("***");
    System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
    System.out.println("Conteúdos Comcluídos Camila: " + devCamila.getConteudosConcluido());
    System.out.println("XP = " + devCamila.calcularTotalXp());
    System.out.println("------------------");


    Dev devJefferson = new Dev();
    devJefferson.setNome("Jefferson");
    devJefferson.inscreverBootcamp(bootcamp);

    System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
    devJefferson.progredir();
    devCamila.progredir();

    System.out.println("***");
    System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Jefferson:" + devJefferson.getConteudosConcluido());
    System.out.println("XP = " + devJefferson.calcularTotalXp());

}
} 
