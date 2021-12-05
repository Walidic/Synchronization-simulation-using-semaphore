public class Device extends Thread{
    private String name;
    private String type;
    private Router router;

    public void setDeviceName(String inputName){
        this.name  = inputName;
    }

    public void SetDeviceType(String inputType){
        this.type = inputType;
    }

    public void setRouter(Router router){
        this.router = router;
    }

    public String getDeviceName(){
        return name;
    }

    public String getDeviceType(){
        return type;
    }

    public Router getRouter(){
        return router;
    }

    @Override
    public void run(){

    }
}
