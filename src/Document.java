public class Document extends Shipment{

    private boolean isUrgent;

    public Document(String trackingId, String senderAddress , String receiverAddress, boolean isUrgent){
        super(trackingId,senderAddress,receiverAddress);
        this.isUrgent = isUrgent;
    }


    @Override
    public void trackStatus(){
        System.out.println("Evrak "+ this.trackingId + " teslimat noktasında");
    }
    @Override
    public double calculateCost(){
        return this.isUrgent ? 100.0 : 35.0;
    }

}
