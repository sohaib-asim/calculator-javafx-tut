/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author sohaib
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
  
       Circle circ = new Circle(0, 0, 25);
       
        Label label1 = new Label("Number 1:");
        Label label2 = new Label("Number 2:");
        TextField text1 = new TextField("Enter Number 1");
        TextField text2 = new TextField("Enter Number 2");
        Label results = new Label("");
        Button btn = new Button();
        btn.setText("Click To Sum");
        btn.setOnAction(event->{
            
            int n1 = Integer.parseInt(text1.getText().toString());
            int n2 = Integer.parseInt(text2.getText().toString());
            int sum = n1 + n2;
            results.setText(""+ sum);
        });
        
        //btn.setCursor(Cursor.TEXT);

        
        Group grp = new Group();
        grp.getChildren().addAll(circ);
        
        
        GridPane grid = new GridPane();
        grid.add(label1,0, 0);
        grid.add(label2,1, 0);
        grid.add(text1,0, 1);
        grid.add(text2,1, 1);
        grid.add(results, 2, 1);
        grid.add(btn,0, 3);
        grid.setAlignment(Pos.CENTER);
       // grid.setGridLinesVisible(true);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25));
        results.setId("result");
        
        
        Scene scene = new Scene(grid, 300, 250);
        Scene scene1 = new Scene(grp,300,250);
        scene.getStylesheets().add(Calculator.class.getResource("calc.css").toExternalForm());
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
