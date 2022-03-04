package co.edu.unbosque.model;

public class Player {
	private  int  fichapos1;
	private int fichapos2;
	private int fichapos3;
	private int fichapos4;
	private int dadosal;
	private int posini;
	public Player(int fichapos1, int fichapos2, int fichapos3, int fichapos4,int dadosal,int posini) {
		super();
		this.fichapos1 = fichapos1;
		this.fichapos2 = fichapos2;
		this.fichapos3 = fichapos3;
		this.fichapos4 = fichapos4;
		this.dadosal=dadosal;
		this.posini=posini;
	}
	
	public int getPosini() {
		return posini;
	}

	public void setPosini(int posini) {
		this.posini = posini;
	}

	public int getDadosal() {
		return dadosal;
	}

	public void setDadosal(int dadosal) {
		this.dadosal = dadosal;
	}

	public int getFichapos1() {
		return fichapos1;
	}
	public void setFichapos1(int fichapos1) {
		this.fichapos1 = fichapos1;
	}
	public int getFichapos2() {
		return fichapos2;
	}
	public void setFichapos2(int fichapos2) {
		this.fichapos2 = fichapos2;
	}
	public int getFichapos3() {
		return fichapos3;
	}
	public void setFichapos3(int fichapos3) {
		this.fichapos3 = fichapos3;
	}
	public int getFichapos4() {
		return fichapos4;
	}
	public void setFichapos4(int fichapos4) {
		this.fichapos4 = fichapos4;
	}
	

}
