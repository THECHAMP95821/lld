package lld.behavioral.observer;


import java.util.ArrayList;

public class Channel implements ChannelInterface {

    private String vid;
    private ArrayList<SubscriberInterface> subscribers;

    @Override
    public void addSubscriber(SubscriberInterface subscriber){
        subscribers.add(subscriber);
    };

    @Override
    public void removeSubscriber(SubscriberInterface subscriber){
        subscribers.remove(subscriber);
    };

    @Override
    public void notifySubscribers(){

    }

    public void uploadVideo(String vid){
        this.vid = vid;
        notifySubscribers();
    }

}
