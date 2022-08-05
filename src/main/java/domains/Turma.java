package domains;

import javax.persistence.*;

@Entity
@Table(name = "T_RATE_TURMA")
@SequenceGenerator(name = "turma", sequenceName = "SQ_TB_TURMA", allocationSize = 1)
public class Turma {

    @Id
    @Column(name = "cd_turma", nullable = false, length = 3)
    @GeneratedValue(generator = "turma", strategy = GenerationType.SEQUENCE)
    private Integer cdTurma;

}
