package model;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Taila
 */
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome_atividade")
    private String nome_atividade;
    
    @Column(name = "data_hora")
    private Time data_hora;
    
    @Column(name = "decricao")
    private String decricao;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;
    
    @Column(name = "pessoa_id")
    private int pessoa_id;

public Atividade() {
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_atividade() {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade) {
        this.nome_atividade = nome_atividade;
    }

    public Time getData_hora() {
        return data_hora;
    }

    public void setData_hora(Time data_hora) {
        this.data_hora = data_hora;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

}
