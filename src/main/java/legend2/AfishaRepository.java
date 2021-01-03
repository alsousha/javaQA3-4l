package legend2;
/*
removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
removeAll* - полностью вычищает репозиторий
*/

public class AfishaRepository {
    private PurchaseItems[] items = new PurchaseItems[0];

    public void save(PurchaseItems item) {
        int length = items.length + 1;
        PurchaseItems[] tmp = new PurchaseItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItems[] findAll() {
        return items;
    }
    public PurchaseItems findById(int id){
        PurchaseItems item = null;
        for (int i = 0; i < items.length; i++) {
            if (i==id) item = this.items[i];
        }
        return item;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        PurchaseItems[] tmp = new PurchaseItems[length];
        int index = 0;
        for (PurchaseItems item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
    public void removeAll(){
        this.items = null;
    }
}

