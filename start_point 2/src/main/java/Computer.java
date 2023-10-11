public class Computer {

    private int currentStorage;
    private String printerProperty;
//    private
//    private String printMessage;

    public Computer(int currentStorage){
        this.currentStorage=currentStorage;
    }

    public int getCurrentStorage() {
        return currentStorage;
    }
    public String getCurrentPrinter() {
        return printerProperty;
    }



    public void addStorage(int newStorage) {
        this.currentStorage = newStorage;
    }

    public void printerProperty(String currentPrinter) {
        this.printerProperty = currentPrinter;
    }

    public void printMessage(String message) {
//        this.printMessage = message;
        System.out.println(message);
    }

}
