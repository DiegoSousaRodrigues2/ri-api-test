package domains;

import javax.persistence.*;

@Entity
@Table(name = "T_RATE_CURSO")
@SequenceGenerator(name = "curso", sequenceName = "SQ_TB_CURSO", allocationSize = 1)
public class Curso {

    //Construtor padrão
    public Curso() {
    }

    //Construtor sem id
    public Curso(String nmCurso, Integer nmPeriodo) {
        this.nmCurso = nmCurso;
        this.nmPeriodo = nmPeriodo;
    }

    //Construtor completo
    public Curso(Integer cdCurso, String nmCurso, Integer nmPeriodo) {
        this.cdCurso = cdCurso;
        this.nmCurso = nmCurso;
        this.nmPeriodo = nmPeriodo;
    }

    @Id
    @Column(name = "cd_curso", nullable = false, length = 3)
    @GeneratedValue(generator = "curso", strategy = GenerationType.SEQUENCE)
    private Integer cdCurso;

    @Column(name = "nm_curso", nullable = false, length = 50)
    private String nmCurso;

    @Column(name = "nm_periodo", nullable = false, length = 3)
    private Integer nmPeriodo;

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getNmCurso() {
        return nmCurso;
    }

    public void setNmCurso(String nmCurso) {
        this.nmCurso = nmCurso;
    }

    public Integer getNmPeriodo() {
        return nmPeriodo;
    }

    public void setNmPeriodo(Integer nmPeriodo) {
        this.nmPeriodo = nmPeriodo;
    }
}
