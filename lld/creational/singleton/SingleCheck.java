package lld.creational.singleton;

public class SingleCheck {
    private static SingleCheck loggerInstance = null;
    private SingleCheck() {}
    public static SingleCheck getInstance(){
        if(loggerInstance!=null){
            return loggerInstance;
        }
        else return new SingleCheck();
    }

}
