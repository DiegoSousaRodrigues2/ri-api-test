package domains;

import javax.persistence.*;

@Entity
@Table(name = "T_RATE_AVALIACAO_DIARIA")
@SequenceGenerator(name = "avaliacaoDiaria", sequenceName = "SQ_TB_AVALIACAO_DIARIA", allocationSize = 1)
public class AvaliacaoDiaria {

    public AvaliacaoDiaria() {
    }

    public AvaliacaoDiaria(Aluno aluno, Materia materia) {
        this.aluno = aluno;
        this.materia = materia;
    }

    public AvaliacaoDiaria(Integer cdAvaliacaoDiaria, Aluno aluno, Materia materia) {
        this.cdAvaliacaoDiaria = cdAvaliacaoDiaria;
        this.aluno = aluno;
        this.materia = materia;
    }

    @Id
    @Column(name = "cd_avaliacao_diaria")
    @GeneratedValue(generator = "avaliacaoDiaria", strategy = GenerationType.SEQUENCE)
    private Integer cdAvaliacaoDiaria;

    @ManyToOne
    @JoinColumn(name = "cd_aluno", nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "cd_materia", nullable = false)
    private Materia materia;

    public Integer getCdAvaliacaoDiaria() {
        return cdAvaliacaoDiaria;
    }

    public void setCdAvaliacaoDiaria(Integer cdAvaliacaoDiaria) {
        this.cdAvaliacaoDiaria = cdAvaliacaoDiaria;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
