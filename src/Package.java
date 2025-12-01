public class Package extends Shipment {
    private double weight;

    public Package(String trackingId, String senderAddress, String receiverAddress, double weight) {
        super(trackingId, senderAddress, receiverAddress);
        this.weight = weight;
    }

    @Override
    public void trackStatus() {
        System.out.println("Package " + this.trackingId + " yolda " );
    }

    @Override
    public double calculateCost() {
        return this.weight * 7.5;
    }
}
