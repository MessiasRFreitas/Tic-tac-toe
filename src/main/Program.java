package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.JV;

public class Program {

	public static void main(String[] args) {
	   JV jv = new JV();
	   //Scanner sc = new Scanner(System.in);
	   
	   String P1 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 1");
	   String P2 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 2");
	   
	   jv.p1 = P1;
	   jv.p2 = P2;
	   
	   
	   
	   
	}

}
