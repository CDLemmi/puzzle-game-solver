package src.java.control;



public class Control implements FPClickable{

    GUIControl guiControl;



    public Control() {
        guiControl = new GUIControl(this);
    }

    @Override
    public void onClick(int pos) {
        System.out.println(pos);
    }
}
