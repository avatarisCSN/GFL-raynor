package radiostation;

import java.util.List;

public class host {
    private String name;
    private int experience;
    private List<Translation> broadcasts;
    private String resume;

    public host(String name) {
        this.name = name;
    }

    public host(String name, String resume) {
        this.name = name;
        this.resume = resume;
       
    }
// здесь можно было бы и билдер применить, но параметра всего два
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setBroadcasts(List<Translation> broadcasts) {
        this.broadcasts = broadcasts;
    }
}
