package default_name;

import controller.DogfightController;
import view.DogfightView;
import model.*;

public class static_main {

	public static void main(String[] args) {

final model.DogflightModel dogfightModel = new model.DogflightModel();
final controller. DogfightController dogfightController = new controller.DogfightController( Model.dogfightModel);
final view.DogfightView dogfightView = new view.DogfightView(Controller.dogfightController,dogfightModel);
dogfightController.setViewSystem(dogfightView);
dogfightController.play(); 
	}
}

