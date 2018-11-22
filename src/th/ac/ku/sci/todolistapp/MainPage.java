package th.ac.ku.sci.todolistapp;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import th.ac.ku.sci.todolistapp.model.DataModel;
import th.ac.ku.sci.todolistapp.model.TodoItem;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class MainPage {

    TodoItem current = null;

    File saveFile = new File("todo.sav");

    DataModel dataModel = DataModel.getInstance();

    @FXML
    TableView<TodoItem> tableView;

    @FXML
    TableColumn isDoneColumn;

    @FXML
    TableColumn titleColumn;

    @FXML
    TableColumn createdColumn;

    @FXML
    TableColumn startColumn;

    @FXML
    TableColumn endColumn;

    @FXML
    TextField titleUpdateTextField;

    @FXML
    TextArea detailUpdateTextArea;

    @FXML
    CheckBox startUpdateCheckBox;

    @FXML
    CheckBox endUpdateCheckBox;

    @FXML
    DatePicker startUpdateDatePicker;

    @FXML
    DatePicker endUpdateDatePicker;

    @FXML
    TextField titleAddTextField;

    @FXML
    TextArea detailAddTextArea;

    @FXML
    CheckBox startAddCheckBox;

    @FXML
    CheckBox endAddCheckBox;

    @FXML
    DatePicker startAddDatePicker;

    @FXML
    DatePicker endAddDatePicker;

    @FXML
    Button addButton;

    @FXML
    void initialize(){
        this.isDoneColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TodoItem, Boolean>, ObservableValue<Boolean>>() {
                    public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<TodoItem, Boolean> c) {
                        return c.getValue().isDoneProperty();
                    }
                }
        );
        this.isDoneColumn.setCellFactory(CheckBoxTableCell.forTableColumn(isDoneColumn));
        this.titleColumn.setCellValueFactory(new PropertyValueFactory<TodoItem,String>("title"));
        this.createdColumn.setCellValueFactory(new PropertyValueFactory<TodoItem, Date>("created"));
        this.startColumn.setCellValueFactory(new PropertyValueFactory<TodoItem, Date>("start"));
        this.endColumn.setCellValueFactory(new PropertyValueFactory<TodoItem, Date>("end"));
        this.tableView.setItems(this.dataModel.getObservableList());

        this.tableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    this.current = newValue;
                    if(newValue != null) {
                        this.titleUpdateTextField.setText(newValue.getTitle());
                        this.detailUpdateTextArea.setText(newValue.getDetail());
                        if(newValue.getStart()!=null){
                            this.startUpdateCheckBox.setSelected(true);
                            this.startUpdateDatePicker.setValue(
                                    LocalDate.ofInstant(newValue.getStart().toInstant(),
                                            ZoneId.systemDefault()));
                        }else {
                            this.startUpdateCheckBox.setSelected(false);
                            this.startUpdateDatePicker.setValue(null);
                        }
                        if(newValue.getEnd()!=null){
                            this.endUpdateCheckBox.setSelected(true);
                            this.endUpdateDatePicker.setValue(
                                    LocalDate.ofInstant(newValue.getEnd().toInstant(),
                                            ZoneId.systemDefault()));
                        }else {
                            this.endUpdateCheckBox.setSelected(false);
                            this.endUpdateDatePicker.setValue(null);
                        }
                    }else{
                        this.titleUpdateTextField.setText("");
                        this.detailAddTextArea.setText("");
                        this.startUpdateCheckBox.setSelected(false);
                        this.startUpdateDatePicker.setValue(null);
                        this.endUpdateCheckBox.setSelected(false);
                        this.endUpdateDatePicker.setValue(null);
                    }
                });

        this.createRandomData();
    }

    @FXML
    public void clearDoneButtonActionHandler(ActionEvent e){
        ObservableList<TodoItem> list = this.dataModel.getObservableList();
        list.removeIf(todoItem -> {return todoItem.getIsDone();});
    }


        @FXML
    public void addButtonActionHandler(ActionEvent e){
        TodoItem item = new TodoItem(
                this.titleAddTextField.getText(),
                this.detailAddTextArea.getText(),
                Calendar.getInstance().getTime(),
                null,null);
        if(this.startAddCheckBox.isSelected() && this.startAddDatePicker.getValue() != null){
            item.setStart(
                    Date.from(this.startAddDatePicker.getValue()
                            .atStartOfDay(ZoneId.systemDefault()).toInstant())
            );
        }
        if(this.endAddCheckBox.isSelected() && this.endAddDatePicker.getValue() != null){
            item.setEnd(
                    Date.from(this.endAddDatePicker.getValue()
                            .atStartOfDay(ZoneId.systemDefault()).toInstant())
            );
        }
        this.dataModel.getObservableList().add(item);
    }

    @FXML
    public void updateButtonActionHandler(ActionEvent e){
        this.current.setTitle(this.titleUpdateTextField.getText());
        this.current.setDetail(this.detailUpdateTextArea.getText());
        if(this.startUpdateCheckBox.isSelected() && this.startUpdateDatePicker.getValue() != null){
            this.current.setStart(
                    Date.from(this.startUpdateDatePicker.getValue()
                            .atStartOfDay(ZoneId.systemDefault()).toInstant())
            );
        }else{
            this.current.setStart(null);
        }
        if(this.endUpdateCheckBox.isSelected() && this.endUpdateDatePicker.getValue() != null){
            this.current.setEnd(
                    Date.from(this.endUpdateDatePicker.getValue()
                            .atStartOfDay(ZoneId.systemDefault()).toInstant())
            );
        }else{
            this.current.setEnd(null);
        }
        this.tableView.refresh();
    }

    @FXML
    public void loadButtonActionHandler(ActionEvent e){
        if(saveFile.exists()) {
            try {
                this.dataModel.load(saveFile);
            } catch (Exception e1) {
                Alert alert = new Alert(Alert.AlertType.ERROR,
                        "Error reading "+saveFile.getAbsolutePath()+
                                ".\n"+ e1.getMessage(),
                        ButtonType.CLOSE);
                alert.show();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR,
                    saveFile.getAbsolutePath() + " does not exists.",
                    ButtonType.CLOSE);
            alert.showAndWait();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose new save file");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("TodoList save file", "*.sav"));
            this.saveFile = fileChooser.showOpenDialog(this.tableView.getScene().getWindow());
            if(this.saveFile != null){
                try {
                    this.dataModel.load(saveFile);
                } catch (Exception e1) {
                    alert = new Alert(Alert.AlertType.ERROR,
                            "Error reading "+saveFile.getAbsolutePath()+
                                    ".\n" + e1.getMessage(),
                            ButtonType.CLOSE);
                    alert.show();
                }
            }
        }
    }

    @FXML
    public void saveButtonActionHandler(ActionEvent e){
        if(saveFile.exists()) {
            try {
                this.dataModel.save(saveFile);
            } catch (IOException e1) {
                Alert alert = new Alert(Alert.AlertType.ERROR,
                        e1.getMessage(),
                        ButtonType.CLOSE);
                alert.show();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR,
                    saveFile.getAbsolutePath() + " does not exists.",
                    ButtonType.CLOSE);
            alert.showAndWait();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose new save file");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("TodoList save file", "*.sav"));
            this.saveFile = fileChooser.showSaveDialog(this.tableView.getScene().getWindow());
            if(this.saveFile != null){
                try {
                    this.dataModel.save(saveFile);
                } catch (IOException e1) {
                    alert = new Alert(Alert.AlertType.ERROR,
                            e1.getMessage(),
                            ButtonType.CLOSE);
                    alert.show();
                }
            }
        }
    }

    void createRandomData(){
        ObservableList<TodoItem> l = this.dataModel.getObservableList();

        for (int i = 0; i < 10; i++) {
            l.add(TodoItem.createRandomTodoItem());
        }
    }
}

