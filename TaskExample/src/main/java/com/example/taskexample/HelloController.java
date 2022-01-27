package com.example.taskexample;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

public class HelloController {

    @FXML
    private ListView listView;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressLabel;

    private Service<ObservableList<String>> service;

    public void initialize(){
//        task = new Task<ObservableList<String>>() {
//            @Override
//            protected ObservableList<String> call() throws Exception {
//
//                String[] names = { "Mihajlo Ristevski",
//                        "Bojan Tasevski",
//                        "Viktor Damcevski",
//                        "Stefan Petrovski",
//                        "Nikola Gramosli"};
//
//                ObservableList<String> employees = FXCollections.observableArrayList();
//                for(int i = 0 ; i < 5 ; i++){
//                    employees.add(names[i]);
//                    updateMessage("Added " + names[i] + " to the list.");
//                    updateProgress(i + 1, 5);
//                    Thread.sleep(400);
//                }
////                Platform.runLater(new Runnable() {
////                    @Override
////                    public void run() {
////                        listView.setItems(employees);
////                    }
////                });
//                return employees;
//            }
//        };
        service = new EmployeeService();
        progressBar.progressProperty().bind(service.progressProperty());
        progressLabel.textProperty().bind(service.messageProperty());
        listView.itemsProperty().bind(service.valueProperty());

        // Pokazuvanje na progressBar i progressLabel za vreme na rabota
//        service.setOnRunning(new EventHandler<WorkerStateEvent>() {
//            @Override
//            public void handle(WorkerStateEvent workerStateEvent) {
//                progressBar.setVisible(true);
//                progressLabel.setVisible(true);
//            }
//        });
//          Trganje na progressBar i progressLabel ko kje se zavrhsi
//        service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
//            @Override
//            public void handle(WorkerStateEvent workerStateEvent) {
//                progressBar.setVisible(false);
//                progressLabel.setVisible(false);
//            }
//        });



//        progressBar.setVisible(false);
//        progressBar.setVisible(false);
        progressBar.visibleProperty().bind(service.runningProperty());
        progressLabel.visibleProperty().bind(service.runningProperty());
    }

    @FXML
    public void buttonPressed(){
        if(service.getState() == Service.State.SUCCEEDED) {
            service.reset();
            service.start();
        }else if(service.getState() == Service.State.READY){
            service.start();
        }
    }
}
