package Game_GUI;

import java.io.File;
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
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUI_Primary extends Application
{
	
	private static Label top_label;
	private static Label bottom_label;
	private static Button gameStart_Button;
	private static Button test_button;
	private static Button lang_de_Button;
	private static Button lang_en_Button;
	private static ToolBar main_toolbar;
	
	public void startView(){
		// show GUI (JavaFX)
		String value = ""; // TODO: Welcher wert muss da sein ?
		launch(value);
		System.out.println("started");
		
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		/*Image img1 = new Image ("test_pic_1.jpg");
		ImageView imgView1 = new ImageView(img1);*/
		Image img1 = new Image (new File("src/style/test_pic_1.jpg").toURI().toString());
		ImageView imgView1 = new ImageView(img1);
		
		/*Image img2 = new Image ("style/table.jpg", true);
		ImageView sub_image = new ImageView(img2);*/
		
		
		top_label = new Label("Wieviele Spieler sollen mitspielen?");
		top_label.setTextFill(Color.web("#2E9AFE"));
		top_label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		
		bottom_label = new Label();
		bottom_label.setTextFill(Color.web("#2E9AFE"));
		bottom_label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		
		
		
		
		
		gameStart_Button = new Button("Neues Spiel");
		gameStart_Button.setMaxSize(350, 0);
		gameStart_Button.getStyleClass().add("button_test");
		test_button = new Button("Test");
		test_button.setMaxSize(350, 0);
		test_button.getStyleClass().add("button_test");
		
		lang_de_Button = new Button("DE");
		lang_de_Button.setMaxSize(500, 350);
		lang_en_Button = new Button("ENG");
		lang_en_Button.setMaxWidth(Double.MAX_VALUE);
		
		VBox vbox = new VBox();
		VBox.setVgrow(gameStart_Button, Priority.ALWAYS);
		gameStart_Button.setMinHeight(45);
		VBox.setVgrow(test_button, Priority.ALWAYS);
		test_button.setMinHeight(45);
		vbox.getChildren().addAll(top_label, gameStart_Button, test_button);
		vbox.setPadding(new Insets(250, 50, 50, 50));
		vbox.setSpacing(20);
		
		
		HBox hbox_bottom = new HBox();
		HBox.setHgrow(lang_de_Button, Priority.ALWAYS);
	    HBox.setHgrow(lang_en_Button, Priority.ALWAYS);
	    lang_de_Button.setMaxWidth(60);
	    lang_en_Button.setMaxWidth(60);
		hbox_bottom.getChildren().addAll(bottom_label, lang_de_Button, lang_en_Button);
		hbox_bottom.setSpacing(5);
		hbox_bottom.setPadding(new Insets(10, 10, 10, 10));
		hbox_bottom.setSpacing(15);
		
		HBox hbox_left = new HBox();
		hbox_left.getChildren().addAll(imgView1);
		hbox_left.setPadding(new Insets(50, 50, 50, 50));
		
		HBox hbox_right = new HBox();
		hbox_right.setPadding(new Insets(50, 50, 50, 50));
		
		BorderPane main_pane = new BorderPane();
		main_pane.setCenter(vbox);
		main_pane.setLeft(hbox_left);
		main_pane.setBottom(hbox_bottom);
		main_pane.setRight(hbox_right);
		
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
	

   


