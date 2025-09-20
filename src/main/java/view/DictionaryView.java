package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class DictionaryView extends Application {

    // initialize components that need to be accessed from multiple methods
    private Label result = new Label("Mean");
    private TextField wordInput = new TextField();
    private DictionaryController dictionary;
    //create data
    @Override
    public void init() {
        dictionary = new DictionaryController();
    }
    //create interface
    @Override
    public void start(Stage stage) {
        Button searchtButton = new Button("Search");
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        stage.setTitle("DICTIONARY");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(searchtButton, insets);
        pane.setMargin(wordInput, insets);

        // reserve space for result
        result.setMinWidth(30);
        result.setAlignment(Pos.CENTER);
        wordInput.setPromptText("Enter word here");
        pane.getChildren().add(wordInput);
        pane.getChildren().add(searchtButton);
        pane.getChildren().add(result);

        Scene scene = new Scene(pane, 500, 200);
        stage.setScene(scene);
        stage.show();

        searchtButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String word = wordInput.getText();
                String meaning = dictionary.searchWord(word);
                dictionary.searchWord(word);
                setResult(meaning);
            }
        });

    }

    public String getWord() {
        return wordInput.getText().trim();
    }

    public void setResult(String result) {
        if (wordInput.getText().equals("")) {
            this.result.setText("Please enter the word.");

        } else {
            this.result.setText("Mean of \"" + getWord() + "\" is: " + result);
        }
    }
    //Stop
    @Override
    public void stop() {
    }
}

