package utilities;

import java.util.Scanner;

public class GameEng {
	public static Scanner userinputgetter;
	public static String currentuserinput;

	public static Knight DarkKnight;
	public static Soldier SuperSoldier;
	public static Fairy MysticFairies;
	public static Valk Valkaryies;



	public static void main(String[]args){

		Soldier = new SuperSoldier();
		Knight = new DarkKnight();
		Fairy = new MysticFairies();
    Valk = new Valkaryies();
		userinputgetter= new Scanner(System.in);
		selectAttack();
	}


	public static void selectAttack(){
		System.out.println("Choose Attacker: Soldier, Knight, Valkaryies");
		currentuserinput=userinputgetter.nextLine();

		if(currentuserinput.equals("soldier")){
			chooseSoldierAttack(soldier , "soldier");
		}
		if(currentuserinput.equals("knight")){
			chooseKnightAttack(knight, "knight");
		}
		if(currentuserinput.equals("Valkaryies")){
			getArcherAttack(Valkaryie, "knight");
		}

	}


	public static void getSoldierAttack(Soldier Dark, String soldier) {
		System.out.println("Which attack would you like to use: Shoot or Bomb");
		currentuserinput=userinputgetter.nextLine();
		getSoldierAttackPropertyValue(Dark, soldier);
	}
	public static void getKnightAttack(Knight Dark, String knight){
		System.out.println("Which attack would you like to use: Slash or Stab");
		currentuserinput=userinputgetter.nextLine();
		getKnightAttackPropertyValue(Dark, knight);
	}
	public static void getValkaryiesAttack(Valkaryies army, String valkaryies){
		System.out.println("Which attack would you like to use: Whip or Punch");
		currentuserinput=userinputgetter.nextLine();
		getValkaryiesAttackPropertyValue(Dark, Valkaryies);
	}


	public static void getSoldierAttackPropertyValue(Soldier Dark, String soldier){
		if(currentuserinput.equals("shoot")){
			System.out.println("The " + soldier + " does " + army.getSoldierShoot() + " damage.");
			selectWhichAttack();
		}
		if(currentuserinput.equals("tank")){
			System.out.println("The " + soldier + " does " + army.getSoldierBomb() + " damage.");
			selectWhichAttack();
		}
	}
	public static void getKnightAttackPropertyValue(Knight Dark, String knight){
		if(currentuserinput.equals("slash")){
			System.out.println("The " + knight + " does " + army.getKnightslash() + " damage.");
			selectWhichAttack();
		}
		if(currentuserinput.equals("stab")){
			System.out.println("The " + knight + " does " + army.getKnightStab() + " damage.");
			selectWhichAttack();
		}
	}
