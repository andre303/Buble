import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ImageButton extends Parent{

    // The image is being loaded in the background
    //  Image image = new Image(url, backgroundLoading);

    private static final Image NORMAL_IMAGE = new Image("cat.png", true);
    private static final Image PRESSED_IMAGE = new Image("frog.png", true);

    private ImageView iv = new ImageView(new Image("white.png", true));

    public void getIcon(ImageView i){
        this.getChildren().add(i);
    }

    public ImageButton(){}

    public ImageButton(ImageView i) {
        super();
        //i = new ImageView(NORMAL_IMAGE);
        this.getChildren().add(i);

        this.setOnMousePressed(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent evt) {
                getIcon(iv);
            }

        });
        // TODO other event handlers like mouse up
    }

}