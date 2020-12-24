public class CartManager {
    private PurchaseItems[] items = new PurchaseItems[0];

    public void add(PurchaseItems item){
        int lenght = items.length + 1;
        PurchaseItems[] tmp = new PurchaseItems[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public PurchaseItems[] getAll(){
        PurchaseItems[] result = new PurchaseItems[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length -i -1;
            result[i] = items[index];
        }
        return result;
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
            items = tmp;
        }
    }
}
