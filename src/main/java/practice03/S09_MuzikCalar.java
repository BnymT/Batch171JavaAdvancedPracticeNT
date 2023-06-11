package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S09_MuzikCalar {

    public static void main(String[] args) {

        /*
    Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
    Kullanıcılar, çalma listelerine şarkı ekleyebilmeli, şarkıları sıralayabilmeli ve
    şarkıları listeden silebilmelidir.
    Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
    */


        Scanner input = new Scanner(System.in);
        String songName = "";
        String removeSong;
        int selection;
        List<String> musicList = new ArrayList<>();


            System.out.println("Welcome to BT MusicPlayer. \uD83D\uDE04");

        do {
            System.out.println("Please enter a number for what if you want to do\n1)Add music\n2)Remove music\n3)Sorting\n4)Remove the PlayList\n5)Exit");


            selection = input.nextInt();


            if (selection == 1) {

                System.out.println("Please enter a song name for adding.");

                songName = input.nextLine();
                songName = input.nextLine();

                addSong(musicList, songName);

                System.out.println(musicList);


            } else if (selection == 2) {

                System.out.println("Please enter a name for which song do you want to remove");

                removeSong = input.nextLine();
                removeSong = input.nextLine();

                removeSong(musicList, removeSong);

            } else if (selection == 3) {

                sortingPlaylist(musicList);

            } else if (selection == 4) {

                removeList(musicList);

            } else if (selection == 5) {

                System.out.println("Good bye!");

                break;

            } else {

                System.out.println("Invalid entry");

            }

        }while (true);


    }

    public static void addSong(List<String> musicList, String songName) {

        if (musicList.contains(songName)) {

            System.out.println("Your song to add to playlist is already have");

        } else {

            musicList.add(songName);

            System.out.println(songName + " added to your playlist!");

        }


    }

    public static void removeSong(List<String> musicList, String songName) {

        if (musicList.contains(songName)) {

            musicList.remove(songName);

            System.out.println(songName + " is removed from your playlist.");
            System.out.println(musicList);

        } else {

            System.out.println("Your playlist does not have a music in this name");

        }

    }

    public static void sortingPlaylist(List<String> musicList) {

        Scanner input = new Scanner(System.in);

        int index1;
        int index2;

        System.out.println(musicList);

        System.out.println("Please select the song you want to change the order above");

        String song1 = input.nextLine();

        if (musicList.size() > 1) {

            if (musicList.contains(song1)) {

                List<String> dummyList = new ArrayList<>();

                System.out.println("Your selection is " + song1 + "\nPlease select which row do you want");

                index1 = musicList.indexOf(song1);
                index2 = input.nextInt();

                dummyList.add(0, musicList.get(index2-1));
                musicList.set(index2-1, song1);
                musicList.set(index1, dummyList.get(0));

                System.out.println("Your new music order is\n" + musicList);

            } else {

                System.out.println("There is no song by this name in your playlist");

            }


        } else {

            System.out.println("You can not to sort your playlist, cause you have 1 song in playlist.");

        }


    }

    public static void removeList(List<String> musicList) {

        if (musicList.size() == 0) {

            System.out.println("There is no song in your playlist...");


        } else {

            musicList.clear();

            System.out.println("Your list is cleard");

        }

    }



}


