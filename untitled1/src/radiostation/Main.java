package radiostation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        song song1 = new song("By-by", "Zeppelin", 5);
        interview inter1 = new interview("Robki",3);
        advertisement adver = new advertisement("mokko", 2);

       List<Parts> parts = new ArrayList<>();
       Translation radio = new Translation(10, parts);
        radio.addToList(song1);
        radio.addToList(inter1);
        radio.addToList(adver);

        radio.printParts();
        System.out.println(radio.getPrice()+"translation price");
//нельзя так сделать
        song song2 = new song("Руддщ", "фгерщк2", 6);
        radio.addToList(song2);
//нельзя так сделать
        Translation radio2 = new Translation(10, new ArrayList<>());
        radio.addToList(song2);
        radio.addToList(inter1);
        radio.addToList(adver);
        //создаем хоста родного
        host mainHost = new host("Xromov");
        mainHost.setExperience(10);
        List<Translation> list = new ArrayList<Translation>();
        list.add(radio);
        mainHost.setBroadcasts(list);
        //создаем хоста с резюме

        host guestHost = new host("filipov", "I m the best host in the world");
        guestHost.setBroadcasts(list);
        guestHost.setExperience(5);


    }
}
