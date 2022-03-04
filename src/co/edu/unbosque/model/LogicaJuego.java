package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

public class LogicaJuego {
private Player player1;
private Player player2;
private Player player3;
private Player player4;
private ArrayList<Player> listplayer;
private ArrayList<Player> twolistplayer;
	public LogicaJuego() {
		ArrayList listplayer = new ArrayList<>();
		player1 =new Player(5,5,5,5,0,5);
		player2=new Player(22,22,22,22,0,22);
		player3=new Player(39,39,39,39,0,39);
		player4=new Player(56,56,56,56,0,56);
		listplayer.add(player1);
		listplayer.add(player2);
		listplayer.add(player3);
		listplayer.add(player4);
		twolistplayer=sacarfichas();
		
		
	}
	public int dados() {
		int res=(int)(Math.random() * 6) + 1;
		return res;
	}
	public static void sort2(ArrayList<Player> list)
    {
		list.sort((o1, o2)
                -> Integer.valueOf(o1.getDadosal()).compareTo(
                    o2.getDadosal()));
		
    }
	public ArrayList<Player> sacarfichas() {
		for(int i=0;i<listplayer.size();i++) {
			listplayer.get(i).setDadosal(dados());
		}
		sort2(listplayer);
		return listplayer;
	}
	
	public void movimientos() {
		for(Player p:twolistplayer) {
			int dadoone=dados();
			int dadotwo=dados();
			if(p.getFichapos1() == 0 && p.getFichapos2() == 0 && p.getFichapos3() == 0 && p.getFichapos4() == 0) {
				if(dadoone == 5 || dadotwo == 5) {
					
				}
			}
		}
	}
}
