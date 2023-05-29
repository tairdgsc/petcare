package model;

import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Despesa.Tipo;
import model.Ong;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-28T22:27:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Despesa.class)
public class Despesa_ { 

    public static volatile SingularAttribute<Despesa, Tipo> tipo_despesa;
    public static volatile SingularAttribute<Despesa, Date> data;
    public static volatile SingularAttribute<Despesa, Double> valor;
    public static volatile SingularAttribute<Despesa, Ong> ong;
    public static volatile SingularAttribute<Despesa, String> decricao;
    public static volatile SingularAttribute<Despesa, Integer> id;

}