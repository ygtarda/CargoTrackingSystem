public class Main {
    public static void main(String[] args) {

        // 1. Kargo şirketini oluştur
        ShippingCompany myCompany = new ShippingCompany();

        // 2. Bir Paket oluştur (Soru 3'teki sınıf)
        Shipment package1 = new Package(
                "PK12345",
                "Ankara",
                "İstanbul",
                5.5 // 5.5 kg
        );

        // 3. Bir Evrak oluştur (Soru 4'teki sınıf) - Acil
        Shipment document1 = new Document(
                "DC67890",
                "İzmir",
                "Bursa",
                true // Acil (isUrgent = true)
        );

        // Gönderileri şirkete ekle
        myCompany.addShipment(package1);
        myCompany.addShipment(document1);

        // 4. Tüm gönderileri listele (Polymorphism burada çalışacak)
        myCompany.listAllShipments();
    }
}