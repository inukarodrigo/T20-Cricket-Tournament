package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class Controller implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;
    Main main = new Main();
    //These text fields are to edit or delete team profiles
    @FXML
    TextField askUserToEditTeamProfile,getOption,teamName, fieldNameTeamProfile,newValue,doneWithEditing,doneWithDeleting;

    //These text fields are for edit or delete player profiles
    @FXML
    TextField askUserToEditPlayerProfile,playerName,fieldNamePlayerProfile,doneWithEditingPlayer,doneWithDeletingPlayer;
    //These text fields are for display team profiles
    @FXML
    TextField askToDisplayTeamProfile,teamNameToDisplay;
    //These text fields are for display player profiles
    @FXML
    TextField askToDisplayPlayerProfile;
    //These text fields are to get the match summery,best 5 bowlers and batsmen,tournament standing
    @FXML
    TextField askToDisplayMatchSummery,askToDisplayBest5Batsmen,askToDisplayBest5Bowlers,askToDisplayTournamentStanding;
    @FXML
    private Label errorMessageLabel;
    @FXML
    private Button addButton;


    private String errorMessage = "";
    //To check is the fields are empty,used when display the match summery
    private boolean ifFieldFilled(){
        boolean isFilled = true;
        try {
            if (askToDisplayMatchSummery.getText().isEmpty()){
                isFilled = false;
                errorMessage = "First text field is empty!";
            }

            if (askToDisplayBest5Batsmen.getText().isEmpty()){
                isFilled = false;
                if (errorMessage.isEmpty()){
                    errorMessage = "Second text field is empty!";
                }else{
                    errorMessage+="\nSecond text field is empty!";
                }
            }
            if (askToDisplayBest5Bowlers.getText().isEmpty()){
                isFilled = false;
                if (errorMessage.isEmpty()){
                    errorMessage = "Third text field is empty!";
                }else
                    errorMessage+="\nThird text field is empty!";
            }
            if (askToDisplayTournamentStanding.getText().isEmpty()){
                isFilled = false;
                if (errorMessage.isEmpty()){
                    errorMessage = "Fourth text field is empty!";
                }else
                    errorMessage+="\nFourth text field is empty!";
            }
            errorMessageLabel.setText(errorMessage);
        }catch (NullPointerException e){
            //Nothing happened
        }
        return isFilled;
    }
    private boolean isValid(){
        boolean isValid = true;
        try {
            if (!(askToDisplayMatchSummery.getText().toLowerCase().equals("yes") || askToDisplayMatchSummery.getText().toLowerCase().equals("no"))){
                isValid = false;
                errorMessage = "Invalid input in first text field!";
            }
            if (!(askToDisplayBest5Batsmen.getText().toLowerCase().equals("yes") || askToDisplayBest5Batsmen.getText().toLowerCase().equals("no"))){
                isValid = false;
                errorMessage = "Invalid input in second text field!";
            }
            if (!(askToDisplayBest5Bowlers.getText().toLowerCase().equals("yes") || askToDisplayBest5Bowlers.getText().toLowerCase().equals("no"))){
                isValid = false;
                errorMessage = "Invalid input in third text field!";
            }
            if (!(askToDisplayTournamentStanding.getText().toLowerCase().equals("yes") || askToDisplayTournamentStanding.getText().toLowerCase().equals("no"))){
                isValid = false;
                errorMessage = "Invalid input in fourth text field!";
            }
            errorMessageLabel.setText(errorMessage);
        }
        catch (NullPointerException e){
            //Nothing happened
        }
        return isValid;
    }



    public void switchToScene2(ActionEvent event) throws IOException {
        if (askUserToEditTeamProfile.getText().toLowerCase().equals("yes") && getOption.getText().toLowerCase().equals("edit")){
            displayScene(event,"guiForEditTeamProfile.fxml");
        }else if (askUserToEditTeamProfile.getText().toLowerCase().equals("no")){
            displayScene(event,"guiAskingForEditDeletePlayerProfile.fxml");
        }else if (askUserToEditTeamProfile.getText().toLowerCase().equals("yes") && getOption.getText().toLowerCase().equals("delete")){
            displayScene(event,"guiForDeleteTeamProfile.fxml");
        }else if (getOption.getText().isEmpty() || askUserToEditTeamProfile.getText().isEmpty()){
            System.out.println("Text field is empty! ");
        }
        else
            System.out.println("Invalid input");
    }
    public void switchToScene3(ActionEvent event) throws IOException{
        if (askUserToEditPlayerProfile.getText().toLowerCase().equals("yes") && getOption.getText().toLowerCase().equals("edit")){
            displayScene(event,"guiForEditPlayerProfile.fxml");
        }else if (askUserToEditPlayerProfile.getText().toLowerCase().equals("no")){
            displayScene(event,"guiToDisplayTeamProfile.fxml");
        }else if (askUserToEditPlayerProfile.getText().toLowerCase().equals("yes") && getOption.getText().toLowerCase().equals("delete")){
            displayScene(event,"guiForDeletePlayerProfile.fxml");
        }else
            System.out.println("Invalid input");
    }
    public void switchToScene4(ActionEvent event) throws IOException{
        if (askToDisplayTeamProfile.getText().toLowerCase().equals("yes")){
            main.displayTeamProfile(teamNameToDisplay.getText());
        }else if (askToDisplayTeamProfile.getText().toLowerCase().equals("no")){
            displayScene(event,"guiToDisplayPlayerProfile.fxml");
        }else
            System.out.println("Invalid input");
    }
    public void switchToScene5(ActionEvent event) throws IOException{
        if (askToDisplayPlayerProfile.getText().toLowerCase().equals("yes")){
            main.displayPlayerProfile(teamNameToDisplay.getText());
        }else if (askToDisplayPlayerProfile.getText().toLowerCase().equals("no")){
            displayScene(event,"guiToDisplayMatchSummery.fxml");
        }else
            System.out.println("Invalid input");
    }
    public void deletePlayerProfile(ActionEvent event)throws IOException{
        main.deletePlayerProfile(playerName.getText());
        if (doneWithDeletingPlayer.getText().toLowerCase().equals("yes")){
            displayScene(event,"guiAskingForEditDeletePlayerProfile.fxml");
        }
    }

    public void editPlayerProfile(ActionEvent event)throws IOException{
        main.editPlayerProfile(playerName.getText(), fieldNamePlayerProfile.getText(),newValue.getText());
        if (doneWithEditingPlayer.getText().toLowerCase().equals("yes")){
            displayScene(event,"guiAskingForEditDeletePlayerProfile.fxml");
        }
    }

    public void editTeamProfile(ActionEvent event) throws IOException{
        main.editTeamProfile("edit",teamName.getText(), fieldNameTeamProfile.getText(),newValue.getText());
        if (doneWithEditing.getText().toLowerCase().equals("yes")){
            displayScene(event,"guiAskingForEditAndDeleteTeamProfile.fxml");
        }
    }
    public void deleteTeamProfile(ActionEvent event) throws IOException{
        main.deleteTeamProfile(teamName.getText());
        if (doneWithDeleting.getText().toLowerCase().equals("yes")){
            displayScene(event,"guiAskingForEditAndDeleteTeamProfile.fxml");
        }
    }
    public void displayScene(ActionEvent event,String fxmlFileName) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1300,700);
        stage.setScene(scene);
        stage.show();
    }


    int outerLoopCount = 0; //These variables are for match generation
    int innerLoopCount = outerLoopCount+1;
    String group = "A";
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.exit(0);
            }
        });
        addButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                errorMessage = "";
                try {
                    if (ifFieldFilled() && isValid()){
                    /* Below mechanism is equal to
                                for (int i=0;i<3;i++){
                                      for (int j=i+1;j<4;j++){
                                            main.clickedOnce(askToDisplayMatchSummery.getText(),askToDisplayBest5Bowlers.getText(),askToDisplayBest5Batsmen.getText(),askToDisplayTournamentStanding.getText(),outerLoopCount,innerLoopCount);
                                      }
                                 }
                            Didn't use for loop here because each time user click the button,new values should manually pass to the relevant methods
                     */
                        if (outerLoopCount<3){
                            if (innerLoopCount<4){
                                main.clickedOnce(askToDisplayMatchSummery.getText(),askToDisplayBest5Bowlers.getText(),askToDisplayBest5Batsmen.getText(),askToDisplayTournamentStanding.getText(),outerLoopCount,innerLoopCount,group);
                                innerLoopCount+=1;
                            }else if (innerLoopCount==4){
                                innerLoopCount = 0;
                                outerLoopCount+=1;
                                innerLoopCount = outerLoopCount+1;
                            }
                        }else {
                            main.displayTeamWhoQualifiedForFinals(group);
                            outerLoopCount = 0;
                            innerLoopCount = outerLoopCount+1;
                            group = "B";
                        }
                    }
                }catch (NullPointerException e){
                    //Nothing happened
                }
            }
        });
    }
}


