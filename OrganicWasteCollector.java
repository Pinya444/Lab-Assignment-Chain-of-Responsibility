public class OrganicWasteCollector extends AbstractWasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("Organic waste collected and composted.");
        } else {
            passToNext(container);
        }
    }
}