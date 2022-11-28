package Implementacao;

public class Especialidade {
	
	private String dscricao;

	public String getDscricao() {
		return dscricao;
	}

	public void setDscricao(String dscricao) {
		this.dscricao = dscricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [dscricao=");
		builder.append(dscricao);
		builder.append("]");
		return builder.toString();
	}
}