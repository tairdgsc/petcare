package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Adocao;
import model.Animal;
import model.Atividade;
import model.Despesa;
import model.Endereco;
import model.Pessoa;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-28T13:09:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Ong.class)
public class Ong_ { 

    public static volatile ListAttribute<Ong, Atividade> atividades;
    public static volatile SingularAttribute<Ong, String> senha;
    public static volatile SetAttribute<Ong, Pessoa> pessoas;
    public static volatile SingularAttribute<Ong, Endereco> endereco;
    public static volatile SingularAttribute<Ong, String> foco;
    public static volatile ListAttribute<Ong, Animal> animais;
    public static volatile SingularAttribute<Ong, String> nome;
    public static volatile SingularAttribute<Ong, Integer> id;
    public static volatile ListAttribute<Ong, Despesa> despesas;
    public static volatile SingularAttribute<Ong, String> contato;
    public static volatile ListAttribute<Ong, Adocao> adocoes;
    public static volatile SingularAttribute<Ong, String> email;

}