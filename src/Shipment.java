public abstract class Shipment implements ITrackable{

    protected String trackingId;
    protected String senderAddress;
    protected String receiverAddress;

    public  Shipment(String trackingId, String senderAddress, String receiverAddress){
        this.trackingId = trackingId;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
    }
    @Override
    public String getTrackingId() {
        return trackingId;
    }

    @Override
    public abstract void trackStatus();

    public abstract double calculateCost();

}
