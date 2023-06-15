package model;

import java.sql.Time;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Ong;
import model.Pessoa;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-14T20:03:39", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Atividade.class)
public class Atividade_ { 

    public static volatile SingularAttribute<Atividade, String> nome_atividade;
    public static volatile SingularAttribute<Atividade, Pessoa> pessoa;
    public static volatile SingularAttribute<Atividade, Ong> ong;
    public static volatile SingularAttribute<Atividade, Time> data_hora;
    public static volatile SingularAttribute<Atividade, Integer> id;
    public static volatile SingularAttribute<Atividade, String> descricao;

}