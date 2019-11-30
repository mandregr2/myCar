package br.com.myCarApp.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String tipoVeiculo;
    private String marcaVeiculo;
    private double kilometragem;

    protected Veiculo() {}

    public Veiculo(String tipo, String marca, double km) {
        this.tipoVeiculo = tipo;
        this.marcaVeiculo = marca;
        this.kilometragem = km;
    }

    @Override
    public String toString() {
        return String.format(
                "Veiculo[id=%d, tipoVeiculo='%s', marcaVeiculo='%s', kilometragem=%d]",
                id, tipoVeiculo, marcaVeiculo, kilometragem);
    }

	public Long getId() {
		return id;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public double getKilometragem() {
		return kilometragem;
	}
}
