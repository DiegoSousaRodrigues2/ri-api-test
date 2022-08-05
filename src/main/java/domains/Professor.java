package domains;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_RATE_PROFESSOR")
@SequenceGenerator(name = "professor", sequenceName = "SQ_TB_PROFESSOR", allocationSize = 1)
public class Professor {

    //Construtor padrão
    public Professor() {
    }

    //Construtor sem id
    public Professor(String nmProfessor, Date dtNascimento, String stProfessor) {
        this.nmProfessor = nmProfessor;
        this.dtNascimento = dtNascimento;
        this.stProfessor = stProfessor;
    }

    //Construtor completo
    public Professor(Integer cdProfessor, String nmProfessor, Date dtNascimento, String stProfessor) {
        this.cdProfessor = cdProfessor;
        this.nmProfessor = nmProfessor;
        this.dtNascimento = dtNascimento;
        this.stProfessor = stProfessor;
    }

    @Id
    @Column(name = "cd_professor", nullable = false, length = 3)
    @GeneratedValue(generator = "professor", strategy =  GenerationType.SEQUENCE)
    private Integer cdProfessor;

    @Column(name = "nm_professor", nullable = false, length = 50)
    private String nmProfessor;

    @Column(name = "dt_nascimento", nullable = false)
    private Date dtNascimento;

    @Column(name = "st_professor", nullable = false, length = 1)
    private String stProfessor;

    public Integer getCdProfessor() {
        return cdProfessor;
    }

    public void setCdProfessor(Integer cdProfessor) {
        this.cdProfessor = cdProfessor;
    }

    public String getNmProfessor() {
        return nmProfessor;
    }

    public void setNmProfessor(String nmProfessor) {
        this.nmProfessor = nmProfessor;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getStProfessor() {
        return stProfessor;
    }

    public void setStProfessor(String stProfessor) {
        this.stProfessor = stProfessor;
    }
}
