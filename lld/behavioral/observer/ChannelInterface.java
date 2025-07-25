package lld.behavioral.observer;

public interface ChannelInterface {
    void addSubscriber(SubscriberInterface subscriber);
    void removeSubscriber(SubscriberInterface subscriber);
    void notifySubscribers();
}
