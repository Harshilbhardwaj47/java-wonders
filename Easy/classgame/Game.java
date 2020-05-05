package exp3;

import java.util.Scanner;

class player {
	String name;
	int fees;
	int add = 0;

	player() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter fees deposited");
		int fees = in.nextInt();
		if (fees == 1000) {
			System.out.println("Enter Player name");
			Scanner in1 = new Scanner(System.in);
			name = in1.nextLine();
			add = 1;
		} else {
			add = 2;
		}
	}

}

class hockeyplayer extends player {
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own Hockey stick for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}

	}
}

class cricketplayer extends player {
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own L-guard for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}
	}
}

class footballplayer extends player {
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own pair of football boots for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}
	}
}

public class Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the sport you play");
		System.out.println("1) Hockey(Rs 1000 per month to be deposited in advance)");
		System.out.println("2) Cricket(Rs 1000 per month to be deposited in advance)");
		System.out.println("3) Football(Rs 1000 per month to be deposited in advance)");
		int sport = in.nextInt();
		switch (sport) {
		case 1: {
			hockeyplayer obj = new hockeyplayer();
			obj.needofmaterial();
			break;
		}
		case 2: {
			cricketplayer obj = new cricketplayer();
			obj.needofmaterial();
			break;
		}
		case 3: {
			footballplayer obj = new footballplayer();
			obj.needofmaterial();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sport);
		}
	}

}

