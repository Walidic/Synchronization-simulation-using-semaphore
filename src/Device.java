public class Device extends Thread{
    private String name;
    private String type;

    public void setDeviceName(String inputName){
        name  = inputName;
    }

    public void SetDeviceType(String inputType){
        type = inputType;
    }

    public String getDeviveName(){
        return name;
    }

    public String getDeviceType(){
        return type;
    }

    public void connect (){

    }
}
