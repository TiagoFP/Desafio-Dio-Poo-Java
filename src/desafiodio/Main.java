package desafiodio;
import java.time.LocalDate;

import desafiodio.dominio.*;;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

       

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devTiago.getConteudosInscritos());
        devTiago.progredir();

        System.out.println("Conteudos Inscritos" + devTiago.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devTiago.getConteudosConcluidos());
        System.out.println("XP: " + devTiago.calcularTotalXp());
        System.out.println("---");

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devHeitor.getConteudosInscritos());
        devHeitor.progredir();

        System.out.println("-- -");

        System.out.println("Conteudos Inscritos" + devHeitor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devHeitor.getConteudosConcluidos());
        System.out.println("XP: " + devHeitor.calcularTotalXp());
    }
}
