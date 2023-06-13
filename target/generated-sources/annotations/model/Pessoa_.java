package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Atividade;
import model.Endereco;
import model.Ong;
import model.Pessoa.Papel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-03T18:44:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SetAttribute<Pessoa, Atividade> atividades;
    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, Endereco> endereco;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Integer> id;
    public static volatile SingularAttribute<Pessoa, String> email;
    public static volatile SingularAttribute<Pessoa, Papel> papel;
    public static volatile SetAttribute<Pessoa, Ong> ongs;

}