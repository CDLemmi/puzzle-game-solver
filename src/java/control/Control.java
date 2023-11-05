package src.java.control;



public class Control implements FPClickable{

    GUIControl guiControl;
    UserMoveControl userMoveControl;



    public Control() {
        guiControl = new GUIControl(this);
        userMoveControl = new UserMoveControl(guiControl.getDisplayedState());

    }

    @Override
    public void onClick(int pos) {
        System.out.println(pos);
        userMoveControl.processClick(pos);
        guiControl.repaint();
    }
}
