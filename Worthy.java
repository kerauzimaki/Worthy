import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
public class Worthy extends Application{
    public static void main(String[] args){

        launch(args);

    }   
    @Override 
    public void start(Stage primaryStage){
        //Set Title
        primaryStage.setTitle("Worthy");


        //Beginning dialog
        Label messageLabel1 = new Label("Hey...it's not ideal to go outside.");
        Label question = new Label("Will you still...go outside?");

        //Buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        Button continueButton = new Button("Continue");
        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");
        Button yesButton2 = new Button("Yes");

        //Button visiablitly
        continueButton.setVisible(false);
        leftButton.setVisible(false);
        rightButton.setVisible(false);
        yesButton2.setVisible(false);

       
        leftButton.setOnAction(event -> System.out.println("Left"));
        rightButton.setOnAction(event -> System.out.println("Right"));


        VBox vbox = new VBox(10, messageLabel1, question, yesButton, yesButton2, noButton, continueButton, leftButton, rightButton); 
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox, 300, 200); 
        primaryStage.setScene(scene);
        primaryStage.show();

        //Conditional - IF YES
            yesButton.setOnAction(event ->{
             System.out.println("Yes Clicked");
             messageLabel1.setText ("You step outside...but the world isn't the same.");
             question.setVisible(false);
             continueButton.setVisible(true);
             yesButton.setVisible(false);
             noButton.setVisible(false);
                continueButton.setOnAction(event1 ->{
                System.out.println("Continue Clicked");
             messageLabel1.setText("You decide to take a walk...");
             question.setVisible(false);
             continueButton.setOnAction(event2 ->{
                System.out.println("Continue Clicked Again");
                messageLabel1.setText("While walking, there's a diversion in the path.");
                question.setText("Right? or Left?");
                continueButton.setVisible(false);
                leftButton.setVisible(true);
                rightButton.setVisible(true);
                //CONDITIONAL IF LEFT - ENDING 4
                leftButton.setOnAction(event30 ->{
                    System.out.println("Left Clicked");
                    messageLabel1.setText("You chose the left side...");
                    rightButton.setVisible(false);
                    leftButton.setVisible(false);
                    question.setVisible(false);
                    continueButton.setVisible(true);
                    continueButton.setOnAction(event31 ->{
                        System.out.println("Continue Clicked");
                        messageLabel1.setText("You walk for hours...eventually it gets dark");
                        continueButton.setOnAction(event32 ->{
                            System.out.println("Continue Clicked Again");
                            messageLabel1.setText("It's dark...the only light is from the moon.");
                            continueButton.setOnAction(event33 ->{
                                System.out.println("Continue Clicked");
                                messageLabel1.setText("Then...you hear it before you see it.");
                                continueButton.setOnAction(event34 ->{
                                    System.out.println("Continue Clicked Again");
                                    messageLabel1.setText("You turn around...and there it is, glaring down at you.");
                                    continueButton.setOnAction(event35 ->{
                                        System.out.println("Continue Clicked");
                                        messageLabel1.setText("'It's your fault'");
                                        continueButton.setOnAction(event36 ->{
                                            System.out.println("Continue Clicked Again");
                                            messageLabel1.setText("No...");
                                            continueButton.setOnAction(event37 ->{
                                                System.out.println("Continue Clicked");
                                                messageLabel1.setText("'It's your fault.'");
                                                continueButton.setOnAction(event38 -> {
                                                    System.out.println("Continue Clicked Again");
                                                    messageLabel1.setText("No!");
                                                    continueButton.setOnAction(event39 ->{
                                                        System.out.println("Continue Clicked");
                                                        messageLabel1.setText("'...'");
                                                        continueButton.setOnAction(event40 ->{
                                                            System.out.println("Continue Clicked Again");
                                                            messageLabel1.setText("...");
                                                            continueButton.setOnAction(event41 -> {
                                                                System.out.println("Continue Clicked");
                                                                messageLabel1.setText("'You are not worthy.'");
                                                                continueButton.setOnAction(event42 -> {
                                                                    System.out.println("Continue Clicked Again");
                                                                    messageLabel1.setText("The End.");
                                                                });
                                                            });
                                                        });
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });
                //CONDITIONAL IF RIGHT - ENDING 1
                rightButton.setOnAction(event3 ->{
                    System.out.println("Right Clicked");
                    messageLabel1.setText("You chose the right side...");
                    rightButton.setVisible(false);
                    leftButton.setVisible(false);
                    question.setVisible(false);
                    continueButton.setVisible(true);
                    continueButton.setOnAction(event4 ->{
                        System.out.println("Contine Clicked");
                        messageLabel1.setText("It's here...");
                        continueButton.setOnAction(event5 ->{
                            System.out.println("Continue Clicked Again");
                            messageLabel1.setText("It glances at you...and nods?");
                            continueButton.setOnAction(event6 -> {
                                System.out.println("Continue Clicked");
                                messageLabel1.setText("It feels oddly peaceful.");
                                continueButton.setOnAction(event7 ->{
                                    System.out.println("Continue Clicked Again");
                                    messageLabel1.setText("It leaves...");
                                    continueButton.setOnAction(event8 ->{
                                        System.out.println("Continue Clicked");
                                        messageLabel1.setText("Hopefully it never comes back...");
                                        continueButton.setOnAction(event9 ->{
                                            System.out.println("ENDING 1");
                                            messageLabel1.setText("The End.");
                                        }); });
                                    });

                                });
                            });       
                        });

                    });


                });

            });
        });

        //IF NO
        noButton.setOnAction(event10 ->{
            System.out.println("No clicked");
            messageLabel1.setText("You're safe...but for how long?");
            question.setVisible(false);
            continueButton.setVisible(true);
            noButton.setVisible(false);
            yesButton.setVisible(false);
            continueButton.setOnAction(event11 ->{
                System.out.println("Continue Clicked");
                messageLabel1.setText("After a couple of hours, you hear a loud BANG!");
                continueButton.setOnAction(event12 ->{
                    System.out.println("Continue Clicked Again");
                    question.setVisible(true);
                    question.setText("Will you check it out?");
                    continueButton.setVisible(false);
                    noButton.setVisible(true);
                    yesButton.setVisible(true);
                    //IF NO 
                    noButton.setOnAction(event13 ->{
                        System.out.println("No clicked again");
                        yesButton.setVisible(false);
                        noButton.setVisible(false);
                        question.setVisible(false);
                        continueButton.setVisible(true);
                        messageLabel1.setText("You chose to hide.");
                        continueButton.setOnAction(event14 ->{
                            System.out.println("Continue Clicked");
                            messageLabel1.setText("The banging gets louder...until it suddenly stops.");
                            continueButton.setOnAction(event15 ->{
                                    System.out.println("Continue Clicked Again");
                                    messageLabel1.setText("CRUNCH!");
                                    continueButton.setOnAction(event16->{
                                        System.out.println("Continue Clicked");
                                        messageLabel1.setText("It's inside...20 seconds is all you have.");
                                        continueButton.setOnAction(event17 ->{
                                            System.out.println("Continue Clicked Again");
                                            messageLabel1.setVisible(false);
                                            question.setVisible(true);
                                            question.setText("Will you confront it?");
                                            continueButton.setVisible(false);
                                            yesButton2.setVisible(true);
                                            noButton.setVisible(true);
                                    //IF NO - ENDING 2
                                    noButton.setOnAction(event23 -> {
                                        System.out.println("No Clicked");
                                        messageLabel1.setVisible(true);
                                        messageLabel1.setText("...");
                                        question.setVisible(false);
                                        yesButton.setVisible(false);
                                        noButton.setVisible(false);
                                        continueButton.setVisible(true);
                                        continueButton.setOnAction(event24 ->{
                                            System.out.println("Continue Clicked");
                                            messageLabel1.setText("'Found you'");
                                            continueButton.setOnAction(event25 ->{
                                                System.out.println("Continue Clicked Again");
                                                messageLabel1.setText("It caught up to you...");
                                                continueButton.setOnAction(event26 ->{
                                                    System.out.println("Continue Clicked");
                                                    messageLabel1.setText("It's what you deserve.");
                                                    continueButton.setOnAction(event27 -> {
                                                        System.out.println("ENDING 2");
                                                        messageLabel1.setText("The End");
                                                    });
                                                });
                                            });
                                        });
                                    });
                                    //IF YES - ENDING 3
                                    yesButton2.setOnAction(event18 -> {
                                        System.out.println("Yes Clicked");
                                        question.setVisible(false);
                                        yesButton2.setVisible(false);
                                        noButton.setVisible(false);
                                        continueButton.setVisible(true);
                                        messageLabel1.setVisible(true);
                                        messageLabel1.setText("You stepped out of your hiding spot");
                                        continueButton.setOnAction(event19 -> {
                                            System.out.println("Continue Clicked");
                                            messageLabel1.setText("It's here.");
                                            continueButton.setOnAction(event20 -> {
                                                System.out.println("Continue Clicked Again");
                                                messageLabel1.setText("It looked at you...but it looks...disappointed?");
                                                continueButton.setOnAction(event21 -> {
                                                    System.out.println("Continue Clicked");
                                                    messageLabel1.setText("'Why?'");
                                                    continueButton.setOnAction(event22 -> {
                                                        System.out.println("Continue Clicked Again");
                                                        messageLabel1.setText("And without another word...it leaves.");
                                                        continueButton.setOnAction(event28 -> {
                                                            System.out.println("Continue Clicked");
                                                            messageLabel1.setText("Good for you...");
                                                            continueButton.setOnAction(event29 -> {
                                                                System.out.println("ENDING 3");
                                                                messageLabel1.setText("The End.");
                                                            });
                                                        });
                                                        });
                                            
                                                });
                                            });
                                        });
                                        

                                    });

                                        });
                                
                                });
                            });
                        });
                    });
                });
            });
        });
    } 
    
} 

    

