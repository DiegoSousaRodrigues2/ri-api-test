package domains;

import javax.persistence.*;

@Entity
@Table(name = "T_RATE_TURMA")
@SequenceGenerator(name = "turma", sequenceName = "SQ_TB_TURMA", allocationSize = 1)
public class Turma {

    //Construtor padrão
    public Turma() {
    }

    //Construtor sem id
    public Turma(String nmTurma, Professor professor) {
        this.nmTurma = nmTurma;
        this.professor = professor;
    }

    //Construtor completo
    public Turma(Integer cdTurma, String nmTurma, Professor professor) {
        this.cdTurma = cdTurma;
        this.nmTurma = nmTurma;
        this.professor = professor;
    }

    @Id
    @Column(name = "cd_turma", nullable = false, length = 3)
    @GeneratedValue(generator = "turma", strategy = GenerationType.SEQUENCE)
    private Integer cdTurma;

    @Column(name = "nm_turma", nullable = false,  length = 50)
    private String nmTurma;

    @ManyToOne
    @JoinColumn(name = "cd_professor", nullable = false)
    private Professor professor;

    public Integer getCdTurma() {
        return cdTurma;
    }

    public void setCdTurma(Integer cdTurma) {
        this.cdTurma = cdTurma;
    }

    public String getNmTurma() {
        return nmTurma;
    }

    public void setNmTurma(String nmTurma) {
        this.nmTurma = nmTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
