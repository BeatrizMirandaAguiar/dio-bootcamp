import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso0 = new Curso();
        curso0.setTitulo("curso 0");
        curso0.setDescricao("descrição 0");
        curso0.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso 1");
        curso1.setDescricao("descrição 1");
        curso1.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria 0");
        mentoria.setDescricao("descrição 0");
        mentoria.setData(LocalDate.of(2024,07,8));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp 0");
        bootcamp.setDescricao("descrição0");
        bootcamp.getConteudos().add(curso0);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev0 = new Dev();
        dev0.setNome("Dev 0");
        dev0.inscreverBootcamp(bootcamp);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos:\n"+dev0.getConteudosInscrito()+"\nDev: "+dev0.getNome());
        dev0.progredir();
        System.out.println("XP "+dev0.getNome()+": "+dev0.calcularTotalXp());
        System.out.println("Conteudos concluídos:\n"+dev0.getConteudosConcluidos()+"\nDev: "+dev0.getNome());
        System.out.println("------------------------");
        System.out.println("Conteudos inscritos:\n"+dev1.getConteudosInscrito()+"\nDev: "+dev1.getNome());
        dev1.progredir();
        dev1.progredir();
        System.out.println("XP "+dev1.getNome()+": "+dev1.calcularTotalXp());
        System.out.println("Conteudos concluídos:\n"+dev1.getConteudosConcluidos()+"\nDev: "+dev1.getNome());
        System.out.println("------------------------");
        System.out.println("Conteudos inscritos:\n"+dev0.getConteudosInscrito()+"\nDev: "+dev0.getNome());
        System.out.println("Conteudos inscritos:\n"+dev1.getConteudosInscrito()+"\nDev: "+dev1.getNome());
    }
}