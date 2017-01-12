package Java;


import java.util.*;

public class JavaComparator {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		int diff=((Player)o2).score-((Player)o1).score;
		if(diff!=0)
			return diff;
		return ((Player)o1).name.compareTo(((Player)o2).name);
	}
	
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}