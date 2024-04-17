/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task7;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import task7.MainForm;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import ex03.*;
import java.io.IOException;
public class DataManager implements Observable {
    private List<Observer> observers = new ArrayList<>();
    public static ViewResult view1 = new ViewResult();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void generateData(JTable jTable1) {
        // Имитация генерации данных
        
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // перебираем все строки первого столбца
    int column = 0; // индекс первого столбца
    
    for (int row = 0; row < model.getRowCount(); row++) {
        Object cellData = model.getValueAt(row, column);
        if(cellData == null){
            cellData = "";
        }
        System.out.println(cellData.toString().length()); // здесь вы можете сделать что угодно с данными ячейки
        Item2d item = new Item2d();
        item.setPhoneNumber(cellData.toString());
        view1.getItems().set(row, item);
    }
    view1.viewInit();
    view1.viewShow();
    column = 1;
    for (int row = 0; row < model.getRowCount(); row++) {
        model.setValueAt(view1.getItems().get(row).getMobileOperator(), row, column);
        
        
    }
       // notifyObservers("Данные сгенерированы");
    }

    public void restoreData(JTable jTable1) {
        // Имитация восстановления данных
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
	  view1.viewRestore();
	  } catch (Exception e) {
	  //Assert.fail(e.getMessage());
	  }
        for (int row = 0; row < model.getRowCount(); row++) {
        model.setValueAt(view1.getItems().get(row).getMobileOperator(), row, 1);
        model.setValueAt(view1.getItems().get(row).getPhoneNumber(), row, 0);
        
        
    }
        notifyObservers("Данные восстановлены из файла");
    }

    public void saveData(JTable jTable1) {
        // Имитация сохранения данных
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // перебираем все строки первого столбца
     // индекс первого столбца
    
    for (int row = 0; row < model.getRowCount(); row++) {
        Object cellData = model.getValueAt(row, 0);
        Object cellData1 = model.getValueAt(row, 1);
        if(cellData == null){
            cellData = "";
        }
        if(cellData1 == null){
            cellData1 = "";
        }
        //System.out.println(cellData.toString().length()); // здесь вы можете сделать что угодно с данными ячейки
        Item2d item = new Item2d();
        item.setPhoneNumber(cellData.toString());
        item.setMobileOperator(cellData1.toString());
        view1.getItems().set(row, item);
    }
         try {
	  view1.viewSave();
	  } catch (IOException e) {
	  //Assert.fail(e.getMessage());
	  }
        notifyObservers("Данные сохранены в файл");
    }

    public void runTests() {
        // Имитация выполнения тестов
        notifyObservers("Тесты выполнены");
    }
}
