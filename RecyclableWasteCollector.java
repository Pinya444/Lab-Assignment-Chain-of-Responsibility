public class RecyclableWasteCollector extends AbstractWasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable") && container.isFull()) {
            System.out.println("Recyclable waste collected and sent for recycling.");
        } else {
            passToNext(container);
        }
    }
}