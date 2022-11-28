package Implementacao;

import java.util.Date;

public class Atendimento extends Operacao{
	
	private int prioridade;
	private int estado;
	protected Medico medico;
	protected Paciente paciente;
	
	public Atendimento(Date inicio, Date fim, int prioridade, int estado, Medico medico, Paciente paciente) {
		super(inicio, fim);
		this.prioridade = prioridade;
		this.estado = estado;
		this.medico = medico;
		this.paciente = paciente;
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append("]");
		return builder.toString();
	}
}
