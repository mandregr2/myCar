package br.com.myCarApp.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Abastecimento {
	

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long idVeiculo;
    private java.util.Date dataAbastecimento;
    private String combustivel;
    private double kilometragem;
    private double valorTotal;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public java.util.Date getDataAbastecimento() {
		return dataAbastecimento;
	}
	public void setDataAbastecimento(java.util.Date dataAbastecimento) {
		this.dataAbastecimento = dataAbastecimento;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
