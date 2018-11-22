package th.ac.ku.sci.todolistapp.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TodoItem implements Serializable {
    private SimpleStringProperty title ;
    private SimpleStringProperty detail;

    private SimpleObjectProperty<Date> created;
    private SimpleObjectProperty<Date> start;
    private SimpleObjectProperty<Date> end ;
    private SimpleBooleanProperty isDone ;

    public SimpleBooleanProperty isDoneProperty(){
        return isDone;
    }

    public TodoItem(){
        initializeProperty();
    }

    public TodoItem(String title, String detail,
                    Date created, Date start, Date end) {
        this();
        this.title.set(title);
        this.detail.set(detail);
        this.created.set(created);
        this.start.set(start);
        setEnd(end);
    }

    public String getTitle() {
        return title.get();
    }

    public String getDetail() {
        return detail.get();
    }

    public void setTitle(String title) {
        if(title == null){
            title = "";
        }
        this.title.set(title);
    }

    public void setDetail(String detail) {
        if(detail == null){
            detail = "";
        }
        this.detail.set(detail);
    }

    public Date getCreated() {
        return created.get();
    }

    public void setCreated(Date created) {
        this.created.set(created);
    }

    public Date getStart() {
        return start.get();
    }

    public void setStart(Date start) {
        if(this.end.get() != null && start != null && this.end.get().compareTo(start) < 0) {
            this.start.set(this.end.get());
            this.end.set(start);
        }else{
            this.start.set(start);
        }
    }

    public Date getEnd() {
        return end.get();
    }

    public void setEnd(Date end) {
        if(this.start.get() != null && end != null && this.start.get().compareTo(end) > 0) {
            this.end.set(this.start.get());
            this.start.set(end);
        }else{
            this.end.set(end);
        }
    }

    public Boolean getIsDone(){
        return isDone.get();
    }

    public void setIsDone(boolean done){
        isDone.set(done);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != TodoItem.class){
            return false;
        }
        TodoItem t = (TodoItem)obj;
        return this.title.isEqualTo(t.title)
                .and(this.detail.isEqualTo(t.detail))
                .and(this.created.isEqualTo(t.created))
                .and(this.start.isEqualTo(t.start))
                .and(this.end.isEqualTo(t.end))
                .and(this.isDone.isEqualTo(t.isDone))
                .get();
    }

    private boolean equalDate(Date d1, Date d2){
        if(d1 == null && d2 == null){
            return true;
        }else{
            return d1 != null && d2 != null && d1.equals(d2);
        }
    }

    public static TodoItem createRandomTodoItem(){
        Calendar c = Calendar.getInstance();
        Random random = new Random();
        c.set(2018,1+random.nextInt(11),1+random.nextInt(27));
        Date d1 = c.getTime();
        c.set(2018,1+random.nextInt(11),1+random.nextInt(27));
        Date d2 = c.getTime();
        c.set(2018,1+random.nextInt(11),1+random.nextInt(27));
        Date d3 = c.getTime();
        return new TodoItem("Title"+ random.nextInt(),
                "Detail"+random.nextInt(), d1,d2,d3);
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.writeObject(this.title.get());
        s.writeObject(this.detail.get());
        s.writeObject(this.created.get());
        s.writeObject(this.start.get());
        s.writeObject(this.end.get());
        s.writeBoolean(this.isDone.get());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        initializeProperty();
        this.title.set((String)s.readObject());
        this.detail.set((String)s.readObject());
        this.created.set((Date)s.readObject());
        this.start.set((Date)s.readObject());
        this.end.set((Date)s.readObject());
        this.isDone.set(s.readBoolean());
    }

    private void initializeProperty() {
        title = new SimpleStringProperty("");
        detail = new SimpleStringProperty("");

        created = new SimpleObjectProperty<Date>(null);
        start = new SimpleObjectProperty<Date>(null);
        end = new SimpleObjectProperty<Date>(null);
        isDone = new SimpleBooleanProperty(false);
    }
}
