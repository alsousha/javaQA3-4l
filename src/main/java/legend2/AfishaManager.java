package legend2;

public class AfishaManager {
    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository){
        this.repository = repository;
    }
    public void add(PurchaseItems item) {
        repository.save(item);
    }

    public PurchaseItems[] getAll() {
        PurchaseItems[] items = repository.findAll();
        PurchaseItems[] result = new PurchaseItems[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public PurchaseItems[] reverse() {
        PurchaseItems[] items = repository.findAll();
        PurchaseItems[] result = new PurchaseItems[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}




