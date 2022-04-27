package daalgavar3;
import acm.graphics.*;
import acm.program.*;
public class Waves extends GraphicsProgram {
public void run() {
GLabel label = new GLabel(HEADLINE);
label.setFont("TimesNewRoman-72");
add(label, getWidth(), (getHeight() + label.getAscent()) / 2);
while (label.getX() + label.getWidth() > 0) {
label.move(-DELTA_X, 0);
pause(PAUSE_TIME);
}
}
private static final double DELTA_X = 2.0;
private static final int PAUSE_TIME = 20;
private static final String HEADLINE =
 "I’m Student " +
 "I study PAZ. ";
}