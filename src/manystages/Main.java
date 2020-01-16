/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystages;

import content.StageFour;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author knrta
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Primary Stage");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.setY(100);
        primaryStage.setX(50);
        primaryStage.show();
        
        
        Stage StageTwo = new Stage();
        StageTwo.setTitle("Stage Two");
        StageTwo.setHeight(300);
        StageTwo.setWidth(300);
        StageTwo.setY(100);
        StageTwo.setX(350);
        StageTwo.show();
        
        StageThree Three = new StageThree();
        Three.show();
        
        StageFour Four = new StageFour(); //how to do in assignments
        Four.show();
       
     
        
                
    }
    
    public class StageThree extends Stage {
        public StageThree() {
            setTitle("Stage Three");
            setHeight(300);
            setWidth(300);
            setY(100);
            setX(650);
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
