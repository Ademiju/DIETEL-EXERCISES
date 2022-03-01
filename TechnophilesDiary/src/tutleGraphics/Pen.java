package tutleGraphics;

public class Pen {
    private PenState state = PenState.UP;

    public PenState getState() {
        return state;

    }

    public void setState(PenState state) {
        this.state = state;

    }
}
