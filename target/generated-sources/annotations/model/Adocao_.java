package model;

import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Animal;
import model.Ong;
import model.Pessoa;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-28T22:27:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Adocao.class)
public class Adocao_ { 

    public static volatile SingularAttribute<Adocao, String> nome_adotante;
    public static volatile SingularAttribute<Adocao, Date> data_adocao;
    public static volatile SingularAttribute<Adocao, String> historico_animal;
    public static volatile SingularAttribute<Adocao, String> historico_adotante;
    public static volatile SingularAttribute<Adocao, Ong> ong;
    public static volatile SingularAttribute<Adocao, Animal> animal;
    public static volatile SingularAttribute<Adocao, Integer> id;
    public static volatile SingularAttribute<Adocao, Pessoa> adotante;
    public static volatile SingularAttribute<Adocao, String> nome_animal;

}