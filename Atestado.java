package Implementacao;

import java.util.Date;

public class Atestado extends Operacao{
	
	private int cid;

	public Atestado(Date inicio, Date fim, int cid) {
		super(inicio, fim);
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}
}
