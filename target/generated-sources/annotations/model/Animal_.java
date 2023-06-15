package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Animal.Sexo;
import model.Ong;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-14T20:03:39", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile SingularAttribute<Animal, String> especie;
    public static volatile SingularAttribute<Animal, Integer> idade;
    public static volatile SingularAttribute<Animal, String> tamanho;
    public static volatile SingularAttribute<Animal, String> historico_saude;
    public static volatile SingularAttribute<Animal, String> cor;
    public static volatile SingularAttribute<Animal, String> raca;
    public static volatile SingularAttribute<Animal, Ong> ong;
    public static volatile SingularAttribute<Animal, String> nome;
    public static volatile SingularAttribute<Animal, Integer> id;
    public static volatile SingularAttribute<Animal, Sexo> sexo;
    public static volatile SingularAttribute<Animal, String> comportamento;

}