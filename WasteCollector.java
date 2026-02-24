public interface WasteCollector {
    void setNextCollector(WasteCollector next);
    void collect(WasteContainer container);
}