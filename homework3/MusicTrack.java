package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicTrack {

	public static void main(String[] args) {
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("How many play list want to add: ");
	int number = sc.nextInt();
	
	ArrayList<Playlist> playlist = new ArrayList<>();
	
	for(int i=0;i<number;i++){
		sc.nextLine(); //skip the line break
		System.out.println("Whats the title of the music: ");
		String title=sc.nextLine();
		System.out.println("Whats the artist of the music: ");
		String artist=sc.nextLine();
		System.out.println("Whats the duration of the music: ");
		String duration=sc.next();
		
		playlist.add(new Playlist(title, artist, duration));
	}
	System.out.println("Title \t\tArtist \t\tDuration \tNo.");
	for(int i=0;i<number;i++){
		System.out.println(playlist.get(i).getTitle()+"\t\t"+playlist.get(i).getArtist()+"\t\t"+
	playlist.get(i).getDuration()+"\t\t"+i);
		
	}
	System.out.println("Do you want to remove playlist?");
	System.out.println("Y/N");
	
	String decided = sc.next();
	while(decided.charAt(0) == 'Y'){
		System.out.println("which one you want to remove");
		int i = sc.nextInt();
		playlist.remove(i);
		for(Playlist a: playlist){
			System.out.println("Title \t\tArtist \t\tDuration ");
			System.out.println(a.getTitle()+"\t\t"+a.getArtist()+"\t\t"+
					a.getDuration()+"\t\t");
		}
		System.out.println("Do you want to remove another playlist?");
		System.out.println("Y/N");
		decided = sc.next();
		if(decided.charAt(0) == 'N') break;
	}

	}

}














//