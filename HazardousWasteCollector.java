public class HazardousWasteCollector extends AbstractWasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("Hazardous waste safely disposed.");
        } else {
            passToNext(container);
        }
    }
}