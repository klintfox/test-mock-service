package com.klinux.request;

import java.io.Serializable;

public class DeudorRequest implements Serializable {

	private static final long serialVersionUID = -4398235212091539168L;

	private String numero;
	private String fechaIngreso;
	private String tipo;
	private String rut;
	private String razonSocial;
	private int cant;
	private int deudores;
	private double montoTotal;
	
	public DeudorRequest(String numero, String fechaIngreso, String tipo, String rut, String razonSocial, int cant,
			int deudores, double montoTotal) {
		super();
		this.numero = numero;
		this.fechaIngreso = fechaIngreso;
		this.tipo = tipo;
		this.rut = rut;
		this.razonSocial = razonSocial;
		this.cant = cant;
		this.deudores = deudores;
		this.montoTotal = montoTotal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getDeudores() {
		return deudores;
	}

	public void setDeudores(int deudores) {
		this.deudores = deudores;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
