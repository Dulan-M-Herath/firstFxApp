package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import table_model.Customer_TM;

import static sun.net.www.MimeTable.loadTable;

public class TableFormController {
    public TableView<Customer_TM> tblCustomer;

    public void initialize(){
        loadTable();

        tblCustomer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("CID"));
        tblCustomer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblCustomer.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));

        tblCustomer.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Customer_TM>() {
            @Override
            public void changed(ObservableValue<? extends Customer_TM> observable, Customer_TM oldValue, Customer_TM newValue) {
                Customer_TM selectedItem = tblCustomer.getSelectionModel().getSelectedItem();

                System.out.println(selectedItem.getName());
                System.out.println(selectedItem.getAddress());
                System.out.println(selectedItem.getCID());
                System.out.println(selectedItem.getContact());
            }
        });
    }

    public void loadTable(){
        ObservableList<Customer_TM> customerList = tblCustomer.getItems();

        Customer_TM c1 = new Customer_TM("C001","Saman","Galle","011-1002003");
        Customer_TM c2 = new Customer_TM("C002","Nimal","Kalutara","011-1002004");
        Customer_TM c3 = new Customer_TM("C003","Amal","Kandy","011-1002005");
        Customer_TM c4 = new Customer_TM("C004","Kamal","Colombo","011-1002006");
        Customer_TM c5 = new Customer_TM("C005","Wimal","Panadura","011-1002007");

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

        tblCustomer.refresh();
    }
}
