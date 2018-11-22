package th.ac.ku.sci.todolistapp.model;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.io.*;

public class DataModel {

    // Singleton design pattern
    private static DataModel dataModel;

    private ObservableList<TodoItem> observableList;

    private DataModel() {
    }

    public static DataModel getInstance(){
        if(DataModel.dataModel == null){
            DataModel.dataModel = new DataModel();
        }
        return dataModel;
    }



    /* We make this inner class private so that other programmer
        cannot use it as a listener
     */
    private class TodoListChangeListener implements ListChangeListener<TodoItem>{

        @Override
        public void onChanged(Change<? extends TodoItem> c) {
            while (c.next()) {
                if (c.wasPermutated()) {
                    for (int i = c.getFrom(); i < c.getTo(); ++i) {
                        //permutate
                    }
                } else if (c.wasUpdated()) {
                    //update item
                } else {
                    for (TodoItem remitem : c.getRemoved()) {
                        //System.out.println(remitem);
                    }
                    for (TodoItem additem : c.getAddedSubList()) {
                        //System.out.println(additem);
                    }
                }
            }
        }
    }

    /**
     * Save data to file
     */
    public void save(File saveFile) throws IOException,FileNotFoundException {
        if(saveFile == null){
            throw new FileNotFoundException();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(saveFile,false);
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        if(this.observableList != null){
            // Write size first
            int total = this.observableList.size();
            out.writeInt(total);
            for (TodoItem i:this.observableList) {
                out.writeObject(i);
            }
        }else{
            // If there is nothing to save.  Just write 0
            out.writeInt(0);
        }
        out.close();
        fileOutputStream.close();
    }

    /**
     * Load data from file
     * */
    public void load(File saveFile) throws IOException, FileNotFoundException,ClassNotFoundException{
        if(saveFile == null){
            throw new FileNotFoundException();
        }
        FileInputStream fileInputStream = new FileInputStream(saveFile);
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        if(this.observableList != null) {
            this.observableList.clear();
        }else {
            this.observableList = FXCollections.observableArrayList();
        }

        // Write size first
        int total = in.readInt();
        for (int i = 0; i < total; i++) {
            this.observableList.add((TodoItem) in.readObject());
        }
        in.close();
        fileInputStream.close();
    }

    /**
     * @return ObservableList from FXCollections.observableArrayList().
     * */
    public ObservableList<TodoItem> getObservableList() {
        if(this.observableList == null){
            this.observableList = FXCollections.observableArrayList();
            this.observableList.addListener(new TodoListChangeListener());
        }
        return observableList;
    }
}
