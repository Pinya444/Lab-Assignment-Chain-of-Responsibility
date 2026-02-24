public class Test {
    public static void main(String[] args) {

        WasteCollector organic = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();

        // Build the chain
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Test containers
        WasteContainer bin1 = new WasteContainer("organic", 100, 100);
        WasteContainer bin2 = new WasteContainer("recyclable", 80, 80);
        WasteContainer bin3 = new WasteContainer("hazardous", 50, 50);

        organic.collect(bin1);
        organic.collect(bin2);
        organic.collect(bin3);
    }
}