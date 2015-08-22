package test.navigation.verticalList.cell;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import test.navigation.verticalList.module.*;

public class ModuleCell extends ListCell<Module>{
	private Label moduleLb = new Label("");
	private String moduleName;
	private ImageView icon = new ImageView();
	private HBox layout = new HBox();
	
	public ModuleCell(){
		moduleLb.setStyle("-fx-background-color: grey");
		layout.setSpacing(15);
		layout.getChildren().addAll(icon, moduleLb);
		HBox.setHgrow(layout, Priority.ALWAYS);		
	}

	@Override
	 protected void updateItem(Module item, boolean empty){
        super.updateItem(item, empty);
        if (empty){
        	moduleName = null;
            setGraphic(null);
        }else{
            moduleName = item.moduleName();
            moduleLb.setText(moduleName);
            icon.setImage(item.getIcon().getImage());
            setGraphic(layout);
        }
    }
}