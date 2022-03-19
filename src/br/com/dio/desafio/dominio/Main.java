package br.com.dio.desafio.dominio;


import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alexandre:" + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alexandre:" + devAlexandre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alexandre:" + devAlexandre.getConteudosConcluidos());
        System.out.println("XP:" + devAlexandre.calcularTotalXp());
        System.out.println("-------");

        Dev devSonia = new Dev();
        devSonia.setNome("Sonia");
        devSonia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sonia:" + devSonia.getConteudosInscritos());
        devSonia.progredir();
        devSonia.progredir();
        devSonia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sonia:" + devSonia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sonia:" + devSonia.getConteudosConcluidos());
        System.out.println("XP:" + devSonia.calcularTotalXp());

        Dev devArthur = new Dev();
        devArthur.setNome("Artur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());
        System.out.println("-------");
    }
}



