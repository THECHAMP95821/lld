package lld.behavioral.state;

interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
