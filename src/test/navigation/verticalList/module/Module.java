package test.navigation.verticalList.module;

import javafx.scene.image.ImageView;

public class Module{
	private String moduleName;
	private ImageView icon;
	
	public Module(){}
	
	public Module(String _name, ImageView _icon){
		this.moduleName = _name;
		this.icon = _icon;
	}
	
	public String moduleName(){
		return this.moduleName;
	}
	
	public ImageView getIcon(){
		return this.icon;
	}
}