import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileInputStream;
import javafx.stage.FileChooser;
public class MyFxApp extends Application {
   Image image1;
   Image image2;
   Image image3;
   Image image4;
    Image image5;
    Image image0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sonic Characters");

        FileInputStream input5 = new FileInputStream("src/Shadow.png");
        image5 = new Image(input5);
        FileInputStream input4 = new FileInputStream("src/Amy.png");
        image4 = new Image(input4);
        FileInputStream input3 = new FileInputStream("src/Advance_knuckles.png");
        image3 = new Image(input3);
        FileInputStream input2 = new FileInputStream("src/Tails-PNG-Transparent-Image.png");
        image2 = new Image(input2);
        FileInputStream input1 = new FileInputStream("src/Sa2_sonic.png");
        image1 = new Image(input1);
        ImageView imageView = new ImageView(image1);

        imageView.setFitHeight(500);
        imageView.setFitWidth(500);


        Button button1 = new Button("Sonic");
        Button button2 = new Button("Tails");
        Button button3 = new Button("Knuckles");
        Button button4 = new Button("Amy");
        Button button5 = new Button("Shadow");
        Button selectFile = new Button ("Select file");

        RadioButton radioButton1 = new RadioButton("Sonic");
        RadioButton radioButton2 = new RadioButton("Tails");
        RadioButton radioButton3 = new RadioButton("Knuckles");
        RadioButton radioButton4 = new RadioButton("Amy");
        RadioButton radioButton5 = new RadioButton("Shadow");

        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);
        radioButton5.setToggleGroup(radioGroup);

        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("Sonic");
        choiceBox.getItems().add("Tails");
        choiceBox.getItems().add("Knuckles");
        choiceBox.getItems().add("Amy");
        choiceBox.getItems().add("Shadow");


        FileChooser fileChooser = new FileChooser();
        Button button0 = new Button("display file");


        button1.setOnAction(actionEvent -> {
            imageView.setImage(image1);
            choiceBox.getSelectionModel().select(0);
        });
        button2.setOnAction(actionEvent -> {
            imageView.setImage(image2);
            choiceBox.getSelectionModel().select(1);
        });
        button3.setOnAction(actionEvent -> {
            imageView.setImage(image3);
            choiceBox.getSelectionModel().select(2);
        });
        button4.setOnAction(actionEvent -> {
            imageView.setImage(image4);
            choiceBox.getSelectionModel().select(3);
        });
        button5.setOnAction(actionEvent -> {
            imageView.setImage(image5);
            choiceBox.getSelectionModel().select(4);
        });
        radioButton1.setOnAction(actionEvent -> {
            imageView.setImage(image1);
            choiceBox.getSelectionModel().select(0);
        });
        radioButton2.setOnAction(actionEvent -> {
            imageView.setImage(image2);
            choiceBox.getSelectionModel().select(1);
        });
        radioButton3.setOnAction(actionEvent -> {
            imageView.setImage(image3);
            choiceBox.getSelectionModel().select(2);
        });
        radioButton4.setOnAction(actionEvent -> {
            imageView.setImage(image4);
            choiceBox.getSelectionModel().select(3);
        });
        radioButton5.setOnAction(actionEvent -> {
            imageView.setImage(image5);
            choiceBox.getSelectionModel().select(4);
        });
        choiceBox.setOnAction((event) -> {
                    int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
                    if (selectedIndex == 0) {
                        imageView.setImage(image1); }
                    if (selectedIndex == 1) {
                        imageView.setImage(image2); }
                        if (selectedIndex == 2) {
                            imageView.setImage(image3); }
                        if (selectedIndex == 3) {
                            imageView.setImage(image4); }
                        if (selectedIndex == 4) {
                            imageView.setImage(image5); }
                });

        selectFile.setOnAction(actionEvent -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            image0 =new Image(selectedFile.toURI().toString());
        });
            button0.setOnAction(actionEvent ->{
                choiceBox.getSelectionModel();
                imageView.setImage(image0);
            });

            HBox hbox = new HBox(button1,button2,button3,button4,button5,choiceBox,button0,selectFile);
        VBox vbox = new VBox(hbox,radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,imageView);
        Scene scene = new Scene(vbox, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }
}