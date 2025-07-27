package lld.behavioral.state;

class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext() {
        currentState = new RedState(); // Start with RED
    }
    public void setState(TrafficLightState state) {
        this.currentState = state;
    }
    public void next() {
        currentState.next(this);
    }
    public String getColor() {
        return currentState.getColor();
    }
}
