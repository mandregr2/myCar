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
    private String idLogin;

    protected Veiculo() {}

   

    @Override
    public String toString() {
        return String.format(
                "Veiculo[id=%d, tipoVeiculo='%s', marcaVeiculo='%s', kilometragem=%d]",
                id, tipoVeiculo, marcaVeiculo, kilometragem);
    }

    
	public Veiculo(Long id, String tipoVeiculo, String marcaVeiculo, double kilometragem, String idLogin) {
		super();
		this.id = id;
		this.tipoVeiculo = tipoVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.kilometragem = kilometragem;
		this.idLogin = idLogin;
	}



	public String getIdLogin() {
		return idLogin;
	}



	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
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