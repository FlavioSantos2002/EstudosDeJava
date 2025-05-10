import instrumentos.Piano;
import instrumentos.Violino;
import model.Aluno;
import model.Aula;
import model.Professor;

public class Aplication {
    public static void main(String[] args){

        Professor professor1 = new Professor("joao", 30, "joao@gmail.com", 3590.60);
        Professor professor2 = new Professor("Ana", 38, "ana@gmail.com", 3590.60);

        Aluno a1 = new Aluno("carlos", 12, "carlos@gmail.com");
        Aluno a2 = new Aluno("brenda", 13, "brenda@gmail.com");
        Aluno a3 = new Aluno("carol", 10, "carol@gmail.com");
        Aluno a4 = new Aluno("maria", 14, "maria@gmail.com");
        Aluno a5 = new Aluno("Leo", 12, "leo@gmail.com");

        Piano instrumento1 = new Piano();
        Violino instrumento2 = new Violino();

        Aula aula1 = new Aula(instrumento1, professor1);
        Aula aula2 = new Aula(instrumento2, professor2);

        aula1.novoAluno(a1);
        aula1.novoAluno(a4);

        aula2.novoAluno(a5);
        aula2.novoAluno(a3);
        aula2.novoAluno(a1);
        aula2.novoAluno(a2);

        System.out.println(aula2.toString());

    }
}