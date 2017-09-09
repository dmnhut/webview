/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anything;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Dev
 */
public class Webbrowser extends Application {

    private static WebView wv;
    private static WebEngine we;

    @Override
    public void start(Stage primaryStage) {
        wv = new WebView();
        we = wv.getEngine();
        // Enable Javascript.
        we.setJavaScriptEnabled(true);
        we.load("https://www.google.com");
        
        StackPane root = new StackPane();
        root.getChildren().addAll(wv);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("My Google!");
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
