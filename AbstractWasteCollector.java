public abstract class AbstractWasteCollector implements WasteCollector {
    protected WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector next) {
        this.nextCollector = next;
    }

    protected void passToNext(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for waste type: " 
                                + container.getType());
        }
    }
}