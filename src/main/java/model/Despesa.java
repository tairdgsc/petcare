package model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Taila
 */
@Entity
@Table(name = "despesa")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="data")
    private Date data;
    
    @Column(name="tipo_despesa")
    private Tipo tipo_despesa;
    
    @Column(name="decricao")
    private String decricao;
    
    @Column(name="valor")
    private double valor;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;

enum Tipo {
conta_luz,
conta_agua,
alimentacao,
consulta_medica,
medicacao,
outros}

public Despesa() {
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tipo getTipo_despesa() {
        return tipo_despesa;
    }

    public void setTipo_despesa(Tipo tipo_despesa) {
        this.tipo_despesa = tipo_despesa;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}