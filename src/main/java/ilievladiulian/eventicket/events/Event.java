package ilievladiulian.eventicket.events;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Vlad on 27/05/2017.
 */
@Entity
public class Event {

    @Id
    private long id;
    private String title;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
