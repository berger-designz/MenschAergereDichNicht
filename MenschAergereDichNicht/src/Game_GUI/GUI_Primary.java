package Game_GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUI_Primary extends Application
{
	
	private static Label top_label;
	private static Label bottom_label;
	private static Button gamer_Button;
	private static Button lang_de_Button;
	private static Button lang_en_Button;
	private static ListView<String> gamer_list;
	
	public void startView(){
		// show GUI (JavaFX)
		String value = ""; // TODO: Welcher wert muss da sein ?
		launch(value);
		System.out.println("started");
		
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		/*Image img1 = new Image ("style/table.jpg", true);
		ImageView imgView1 = new ImageView(img1);
		
		Image img2 = new Image ("style/table.jpg", true);
		ImageView sub_image = new ImageView(img2);*/
		
		
		
		top_label = new Label("Wieviele Spieler sollen mitspielen?");
		top_label.setTextFill(Color.web("#2E9AFE"));
		top_label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		
		bottom_label = new Label();
		bottom_label.setTextFill(Color.web("#2E9AFE"));
		bottom_label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		
		gamer_list = new ListView<String>();
		ObservableList<String> items = FXCollections.observableArrayList (
		    "1", "2", "3", "4");
		gamer_list.setItems(items);
		gamer_list.setPrefWidth(50);
		gamer_list.setPrefHeight(4);
		
		
		gamer_Button = new Button("Anzahl Spieler speichern");
		lang_de_Button = new Button("DE");
		lang_en_Button = new Button("ENG");
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(top_label, gamer_list, gamer_Button);
		hbox.setSpacing(5);
		hbox.setPadding(new Insets(10, 10, 10, 10));
		
		HBox hbox_bottom = new HBox();
		hbox_bottom.getChildren().addAll(bottom_label, lang_de_Button, lang_en_Button);
		hbox_bottom.setSpacing(5);
		hbox_bottom.setPadding(new Insets(10, 10, 10, 10));
		
		BorderPane main_pane = new BorderPane();
		main_pane.setTop(hbox);
		//main_pane.setCenter(imgView1);
		main_pane.setBottom(hbox_bottom);
		//main_pane.setRight(sub_image);
		
		Scene main_scene = new Scene(main_pane);
		main_scene.getStylesheets().add("style/style.css");
		
		stage.centerOnScreen();
		stage.setTitle("Game - Mensch �rgere Dich nicht");
		stage.setHeight(700);
		stage.setWidth(1000);
		stage.setScene(main_scene);
		stage.show();
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
		
		
		
	}
	}
	

   


