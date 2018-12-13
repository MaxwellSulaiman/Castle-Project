// castle
package utilities;

public class Castle {
	public String King="George";
	public String Queen="Mary";
	public String Princess="Liz";
	public String Prince="Chester";

	private int SoldierCount=1000000;
	private int KnightCount=250000000;
	private int ValkaryiesCount=25000000;
	private int FairyCount=50000000;

	private int Population=10000000000000;
	private String EcoStatus="Law-Abiding";
	private int SoldierStr=5;
	private int KnightStr=9;
	private int ArcherStr=9;

	public int totalArmy=0;
	public int totalPop=0;

  public boolean KingLife=true;
  public boolean QueenLife=true;

	public Castle(String KingNum, String QueenNum, String PrincessNum, String PrinceNum, int SC, int KC, int VC, int FC, String ES){
		King=KingNum;
		Queen=QueenNum;
		Princess=PrincessNum;
		Prince=PrinceNum;
		SoldierCount=SC;
		KnightCount=KC;
		FairyCount=FC;
		ValkaryiesCount=VC;
	}
	public String getKing(){
		return King;
	}
	public void setKing(String KingNm){
		King=KingNm;
	}
	public String getQueen(){
		return Queen;
	}
	public void setQueen(String QueenNm){
		Queen=QueenNm;
	}
	public String getPrincess(){
		return Princess;
	}
	public void setPrincess(String PrincessNm){
		Princess=PrincessNm;
	}
	public String getPrince(){
		return Prince;
	}
	public void setPrince(String PrinceNm){
		Prince=PrinceNm;
	}

	public int calcArmyCnt(){
		totalArmy = SoldierCnt + KnightCnt + ArcherCnt;
		return totalArmy;
	}
	public int calcPopCnt(){
		totalPop = SoldierCnt + KnightCnt + ArcherCnt + Population;
		return totalPop;
	}

	public int getSoldierCnt() {
		return SoldierCnt;
	}
	public void setSoldierCnt(int SC) {
		SoldierCnt = SC;
	}

	public int getKnightCnt() {
		return KnightCnt;
	}
	public void setKnightCnt(int KC) {
		KnightCnt = KC;
	}

	public int getValkCnt() {
		return ValkCnt;
	}
	public void setValkCnt(int AC) {
		ValkCnt = AC;
	}

	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int PC) {
		Population = PC;
	}

	public String getEcoStatus() {
		return EcoStatus;
	}
	public void setEcoStatus(String ES) {
		EcoStatus = ES;
	}

	public int getSoldierStr() {
		return SoldierStr;
	}
	public void setSoldierStr(int soldierStr) {
		SoldierStr = soldierStr;
	}
	public int getKnightStr() {
		return KnightStr;
	}

	public void setKnightStr(int knightStr) {
		KnightStr = knightStr;
	}
	public int getValkStr() {
		return ValkStr;
	}
	public void setValkrStr(int ValkStr) {
		ValkStr = ValkStr;
	}
	public int getFairyCnt() {
		return FairyCnt;
	}
	public void setFairyCnt(int FC) {
		FairyCnt = FC;
	}






}
