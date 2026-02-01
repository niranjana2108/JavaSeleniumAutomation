package seleniumDaySeven;

import org.testng.annotations.Test;

import seleniumDaySeven.actions.ActionValidation;
import seleniumDaySeven.actions.DoubleClick;
import seleniumDaySeven.actions.DragAndDrop;
import seleniumDaySeven.actions.RightClick;
import seleniumDaySeven.actions.Slider;
import seleniumDaySeven.actions.ToolTips;


public class ActionsTest {
	RightClick rightClick = new RightClick();
	DragAndDrop dragAndDrop = new DragAndDrop();
	DoubleClick doubleClick = new DoubleClick();
	ActionValidation actionValidation = new ActionValidation();
	ToolTips toolTips = new ToolTips();
	Slider slider = new Slider();
	
	 @Test
	  public void validateSlidersTest() throws InterruptedException {
		 slider.openURL();
		 slider.validateSlider();
		  
	  }
	
	 @Test
	  public void validateKeyboardActionsTest() throws InterruptedException {
		 actionValidation.openURL();
		 actionValidation.validateKeyboardActions();
		  
	  }
	  
  @Test
  public void rightClickTest() throws InterruptedException {
	  rightClick.openURL();
	  rightClick.validateRightClick();
	  
  }
  
  @Test
  public void dragAndDropTest() throws InterruptedException {
	  dragAndDrop.openURL();
	  dragAndDrop.validateDragAndDrop();
	  
  }
  @Test
  public void doubleClickTest() throws InterruptedException {
	  doubleClick.openURL();
	  doubleClick.validateDoubleClick();
	  
  }
  
  @Test
  public void tooltipTest() throws InterruptedException {
	  toolTips.openURL();
	  toolTips.validateToolTip();
	  
  }
}
