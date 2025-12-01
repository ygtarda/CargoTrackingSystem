import java.util.ArrayList;
import java.util.List;

public class ShippingCompany {

    private List<Shipment>  shipments;

    public ShippingCompany(){
        this.shipments = new ArrayList<>();
    }

    public void addShipment(Shipment shipment){
        this.shipments.add(shipment);
        System.out.println("Yeni gönderi eklendi: " + shipment.getTrackingId());
    }
    public void listAllShipments(){
        System.out.println("\n---TÜM KARGO GÖNDERİLERİ---");
        if (shipments.isEmpty()){
            System.out.println("Sistem gönderi bulamıyor");
            return;
        }
        for (Shipment shipment : this.shipments){
            System.out.print("ID : " + shipment.getTrackingId());
            System.out.print("| Ücret:"+ shipment.calculateCost());
            System.out.print("| Durum:");
            shipment.trackStatus();
        }
    }
}



