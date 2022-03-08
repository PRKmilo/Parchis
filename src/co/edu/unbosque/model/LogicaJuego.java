package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class LogicaJuego {
private Player player1;
private Player player2;
private Player player3;
private Player player4;
private ArrayList<Player> listplayer;
public static  ArrayList<Player> twolistplayer;
	public LogicaJuego() {
		ArrayList twolistplayer = new ArrayList<>();
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
	
	public void until() {
		boolean  condicion1=player1.getFichapos1()==63 && player1.getFichapos2()==63 && player1.getFichapos3()==63 && player1.getFichapos4() == 63;
		boolean condicion2=player2.getFichapos1()==80 && player2.getFichapos2()==80 && player2.getFichapos3()==80 && player2.getFichapos4()==80;
		boolean condicion3=player3.getFichapos1()==97 && player3.getFichapos2()==97 && player3.getFichapos3()== 97 && player3.getFichapos4()==97;
		boolean condicion4=player4.getFichapos1()==115 && player4.getFichapos2()==115 && player4.getFichapos3()==115 && player4.getFichapos4()==115;
	while(condicion1==false &&  condicion2==false && condicion3==false && condicion4==false) {
		movimientos();
		
	}
	
	
	}
	
	public void movimientos() {
		for(Player p:twolistplayer) {
			int dadoone=dados();
			int dadotwo=dados();
			if(p.getFichapos1() == 0 && p.getFichapos2() == 0 && p.getFichapos3() == 0 && p.getFichapos4() == 0) {
				if(dadoone == 5 || dadotwo == 5) {
					p.setFichapos1(p.getPosini());
					p.setFichapos2(p.getPosini());
					p.setFichapos3(p.getPosini());
					p.setFichapos4(p.getPosini());
				}
			}else if(p.getFichapos1() == 0 || p.getFichapos2() ==  0 || p.getFichapos3() == 0 || p.getFichapos4() == 0){
			 ArrayList<Integer> ls = new ArrayList<Integer> ();
			 ls.add(p.getFichapos1());
			 ls.add(p.getFichapos2());
			 ls.add(p.getFichapos3());
			 ls.add(p.getFichapos4());
			 for(int s=0;s<ls.size();s++) {
				 if(ls.get(s) == 0) {
					 ls.remove(s);
				 }
			 }
			 String poss="";
			 for(int s=0;s<ls.size();s++) {
				 poss += (s+1)+"ficha que esta en la posicion "+ls.get(s)+"\n";
			 }
			 int r=Integer.parseInt(JOptionPane.showInputDialog("ingrese que quiere hacer con los dados 1 repartilos entre dos fichas"+
			 "\n"+" o 2  poner todos los puntos en una sola ficha"));
			 switch(r) {
			 case 1:
				 
				 break;
			 case 2:
				 int t=Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion que quiere mover "+poss));
				 switch(t) {
				 case 1:
					 if(p.getFichapos1() != 0) {
						 p.setFichapos1(p.getFichapos1()+dadoone);
					 }
				 case 2:
					 
					 break;
				 }
				 break;
			 }
			}
		}
	}
	
	public void comerfichas(int posicion) {

		for (int i=0; i< twolistplayer.size();i++) {
			
	
			ArrayList fichas=new  ArrayList<>();
			fichas.add(twolistplayer.get(i).getFichapos1());
			fichas.add(twolistplayer.get(i).getFichapos2());
			fichas.add(twolistplayer.get(i).getFichapos3());
			fichas.add(twolistplayer.get(i).getFichapos4());
			
			for (int k=0;k<fichas.size();k++) {
				
				if(fichas.get(k)==posicion) {
					
				}
				
			}
			
		}
		
		
		
	}
}
